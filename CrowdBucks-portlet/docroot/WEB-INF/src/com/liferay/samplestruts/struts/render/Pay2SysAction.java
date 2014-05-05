package com.liferay.samplestruts.struts.render;

import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.cyclos.model.banking.accounts.AccountSummaryVO;

import com.liferay.portal.kernel.servlet.SessionMessages;

public class Pay2SysAction extends Action {

	/**
	 * @param args
	 */
	public ActionForward execute(
			ActionMapping actionMapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
		response.setHeader("Pragma","no-cache"); //HTTP 1.0 
		response.setHeader("Cache-Control","no-store");
		response.setDateHeader ("Expires", 0); 
 
		PortletRequest aReq =  (PortletRequest) request.getAttribute("javax.portlet.request");
		PortletResponse aRes = (PortletResponse) request.getAttribute("javax.portlet.response");
		PortletSession session = aReq.getPortletSession();
		HttpSession session1 = request.getSession();
		String username = (String)session1.getAttribute("username");
		String password = (String)session1.getAttribute("password");
		
		 String ur = "http://localhost:6549/getAccountList?user="+username+"&pass="+password;
		// String ur = "http://localhost:6549/getAccountList?user="+username+"&pass="+password;
		 // mule code
		
		 final URL url1 = new URL(ur);
		 final HttpURLConnection conn = (HttpURLConnection) url1.openConnection();
		 
	        conn.setRequestMethod("GET");
	        conn.setReadTimeout(10000);
	        conn.connect();
	        ObjectInputStream is = new ObjectInputStream(conn.getInputStream());
	        final Object obj = is.readObject();
	        ArrayList<AccountSummaryVO> list= new ArrayList<AccountSummaryVO>();
	        list = (ArrayList<AccountSummaryVO>)obj;
		
            session.setAttribute("total_users", list, PortletSession.APPLICATION_SCOPE);
			
			SessionMessages.add(aReq, "success");
 		return actionMapping.findForward("portlet.sample_struts_portlet.pay2sys");

	}

}
