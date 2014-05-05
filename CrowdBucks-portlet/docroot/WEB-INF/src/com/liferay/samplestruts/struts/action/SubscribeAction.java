/*
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.samplestruts.struts.action;

import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.samplestruts.struts.form.SubscribeForm;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.cyclos.utils.PageImpl;

/**
 * @author Brian Wing Shun Chan
 */
public class SubscribeAction extends Action {

	@Override
	public ActionForward execute(
			ActionMapping actionMapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)
		throws Exception {

		SubscribeForm subscribeForm = (SubscribeForm)actionForm;
		
		String fname= subscribeForm.getFirstName();
		String lname= subscribeForm.getLastName();
		String email=subscribeForm.getEmailAddress();
		System.out.println("FIRST-NAME = "+fname);
		System.out.println("LAST-NAME = "+lname);
		System.out.println("EMAIL-ID = "+email);
		
		
		ActionRequest aReq = (ActionRequest) request.getAttribute("javax.portlet.request");
		ActionResponse aRes = (ActionResponse) request.getAttribute("javax.portlet.response");
		 PortletSession session = aReq.getPortletSession();
		 
		 String ur = "http://localhost:8081/"+fname;
		 // mule code
		 final URL url1 = new URL(ur);
			
			final HttpURLConnection conn = (HttpURLConnection) url1.openConnection();

	        conn.setRequestMethod("GET");
	        conn.setReadTimeout(10000);
	        conn.connect();

	        final ObjectInputStream is = new ObjectInputStream(conn.getInputStream());

	        final Object obj = is.readObject();
	        
			PageImpl us=(PageImpl) obj;	
	        session.setAttribute("page_count", us.getPageCount(), PortletSession.APPLICATION_SCOPE);
	        session.setAttribute("page_items", us.getPageItems(), PortletSession.APPLICATION_SCOPE);
			
	        System.out.println("page_count ="+us.getPageCount());
			System.out.println("page_items"+us.getPageItems());
			
		 
		 //---------------***************------------
		 
		 

		
		if (_log.isInfoEnabled()) {
			_log.info(subscribeForm.toString());
		}

		return actionMapping.findForward(
			"/sample_struts_portlet/subscribe_success");
	}

	private static Log _log = LogFactoryUtil.getLog(SubscribeAction.class);

}