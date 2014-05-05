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

public class TrashMassageAction extends Action  {

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
		        
		        String Trashur = "http://localhost:6549/TrashMessages?user="+username+"&pass="+password;
				 // mule code
				
				 final URL url3 = new URL(Trashur);
					
					final HttpURLConnection conn2 = (HttpURLConnection) url3.openConnection();

			        conn2.setRequestMethod("GET");
			        conn2.setReadTimeout(10000);
			        conn2.connect();

			        System.out.println("Before Input Stream");
			        
					ObjectInputStream is2 = new ObjectInputStream(conn2.getInputStream());

			        final Object obj2 = is2.readObject();
			        Page<MessageVO> msg2 = (Page<MessageVO>)obj2;
	     
	        
	        session.setAttribute("TrashPageCount", msg2.getPageCount(), PortletSession.APPLICATION_SCOPE);
	        session.setAttribute("TrashTotalCount", msg2.getTotalCount(), PortletSession.APPLICATION_SCOPE);
	        session.setAttribute("TrashPageItems", msg2.getPageItems(), PortletSession.APPLICATION_SCOPE);
			
	        System.out.println("page_count ="+msg2.getPageCount());
	        System.out.println("total_users ="+msg2.getTotalCount());
	        
			SessionMessages.add(aReq, "success");		
		

		return actionMapping.findForward("portlet.sample_struts_portlet.message-trash");
	}

}
