package com.liferay.samplestruts.struts.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LogoutAction extends Action   {

	@Override
	public ActionForward execute(
			ActionMapping actionMapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		
		
		response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
		response.setHeader("Pragma","no-cache"); //HTTP 1.0 
		response.setHeader("Cache-Control","no-store");
		response.setDateHeader ("Expires", 0); 
		
		/*ActionRequest aReq = (ActionRequest) request.getAttribute("javax.portlet.request");
		ActionResponse aRes = (ActionResponse) request.getAttribute("javax.portlet.response"); 
		PortletSession session = aReq.getPortletSession();  
		
		session.invalidate();*/
		
		return actionMapping.findForward("portlet.sample_struts_portlet.logout");
	}
}
