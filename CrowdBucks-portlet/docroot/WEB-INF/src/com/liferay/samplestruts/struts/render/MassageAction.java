package com.liferay.samplestruts.struts.render;

import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
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
import org.cyclos.model.messaging.messages.MessageVO;
import org.cyclos.utils.Page;

import com.liferay.portal.kernel.servlet.SessionMessages;

public class MassageAction extends Action  {

	@Override
	public ActionForward execute(
			ActionMapping actionMapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		
		
		PortletRequest aReq =  (PortletRequest) request.getAttribute("javax.portlet.request");
		PortletResponse aRes = (PortletResponse) request.getAttribute("javax.portlet.response");
		PortletSession session = aReq.getPortletSession();
		HttpSession session1 = request.getSession();
		String username = (String)session1.getAttribute("username");
		String password = (String)session1.getAttribute("password");
		
		 String Inboxur = "http://localhost:6549/InboxMessages?user="+username+"&pass="+password;
		 // mule code
		
		 final URL url1 = new URL(Inboxur);
			
			final HttpURLConnection conn = (HttpURLConnection) url1.openConnection();

	        conn.setRequestMethod("GET");
	        conn.setReadTimeout(10000);
	        conn.connect();

	        System.out.println("Before Input Stream");
	        
			ObjectInputStream is = new ObjectInputStream(conn.getInputStream());

	        final Object obj = is.readObject();
	        Page<MessageVO> msg = (Page<MessageVO>)obj;
	        
	        session.setAttribute("InboxPageCount", msg.getPageCount(), PortletSession.APPLICATION_SCOPE);
	        session.setAttribute("InboxTotalCount", msg.getTotalCount(), PortletSession.APPLICATION_SCOPE);
	        session.setAttribute("InboxPageItems", msg.getPageItems(), PortletSession.APPLICATION_SCOPE);
	        
	        System.out.println("page_count ="+msg.getPageCount());
	        System.out.println("total_users ="+msg.getTotalCount());
	        
			SessionMessages.add(aReq, "success");		
		

		return actionMapping.findForward("portlet.sample_struts_portlet.message");
	}

}