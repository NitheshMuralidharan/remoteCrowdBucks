package com.liferay.samplestruts.struts.render;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.liferay.samplestruts.struts.form.LoginForm;

public class LoginAction extends Action   {
	
	@Override
	public ActionForward execute(
			ActionMapping actionMapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
		response.setHeader("Pragma","no-cache"); //HTTP 1.0 
		response.setHeader("Cache-Control","no-store");
		response.setDateHeader ("Expires", 0); 
		
		LoginForm search = (LoginForm) actionForm;
		
		
		return actionMapping.findForward("portlet.sample_struts_portlet.view");
	}

}
