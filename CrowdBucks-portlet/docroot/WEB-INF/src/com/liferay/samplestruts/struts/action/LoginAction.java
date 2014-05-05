package com.liferay.samplestruts.struts.action;

import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.liferay.samplestruts.struts.form.LoginForm;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(
			ActionMapping actionMapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
		response.setHeader("Pragma","no-cache"); //HTTP 1.0 
		response.setHeader("Cache-Control","no-store");
		response.setDateHeader ("Expires", 0); 

		
		LoginForm abc = (LoginForm) actionForm;
		
		String username = abc.getUsername();
		String password = abc.getPassword();
		
		ActionRequest aReq = (ActionRequest) request.getAttribute("javax.portlet.request");
		ActionResponse aRes = (ActionResponse) request.getAttribute("javax.portlet.response");
		PortletSession session = aReq.getPortletSession();
		System.out.println("username :"+username);
		System.out.println("password :"+password);
		
		if((username.equals("vijay")) && (password.equals("vijay"))){
			session.setAttribute("username", username, PortletSession.APPLICATION_SCOPE);
			session.setAttribute("password", password , PortletSession.APPLICATION_SCOPE);
		
			return actionMapping.findForward("/sample_struts_portlet/login_success");
			
		}
		else {
			ActionErrors("Please Enter Valid Username and Password");
			return actionMapping.findForward("/sample_struts_portlet/login_failure");
		}
			
	
}

	private void ActionErrors(String string) {
		// TODO Auto-generated method stub
		
	}

	
}
