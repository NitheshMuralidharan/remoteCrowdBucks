package com.liferay.samplestruts.struts.action;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.URL;

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
import org.cyclos.utils.Page;
import org.cyclos.model.users.users.UserDetailedVO;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.samplestruts.struts.form.SearchUserForm;

public class SearchUserAction extends Action  {

	
	@Override
	public ActionForward execute(
			ActionMapping actionMapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		
	SearchUserForm search = (SearchUserForm) actionForm;
		
		String uname = search.getUname();
		
		ActionRequest aReq = (ActionRequest) request.getAttribute("javax.portlet.request");
		ActionResponse aRes = (ActionResponse) request.getAttribute("javax.portlet.response");
		PortletSession session = aReq.getPortletSession();
		session.setAttribute("uname", uname, PortletSession.APPLICATION_SCOPE);
		HttpSession session1 = request.getSession();
		String username = (String)session1.getAttribute("username");
		String password = (String)session1.getAttribute("password");
		 System.out.println(uname+"?????"+username+"??????"+password);
		//String ur = "http://localhost:8091/"+uname;
		 String ur = "http://localhost:6549/searchuser?name="+uname+"&user="+username+"&pass="+username;
		 // mule code
		
		 final URL url1 = new URL(ur);
			
			final HttpURLConnection conn = (HttpURLConnection) url1.openConnection();

	        conn.setRequestMethod("GET");
	        conn.setReadTimeout(10000);
	        conn.connect();

	        System.out.println("Before Input Stream");
	        InputStream in = conn.getInputStream();
			ObjectInputStream is = new ObjectInputStream(new BufferedInputStream(in));

	        final Object obj = is.readObject();
				SessionMessages.add(aReq, "success");
				Page<UserDetailedVO> us=(Page<UserDetailedVO>) obj;
	
		session.setAttribute("page_count",us.getPageCount(), PortletSession.APPLICATION_SCOPE);
		session.setAttribute("page_items", us.getPageItems(), PortletSession.APPLICATION_SCOPE);
		session.setAttribute("total_users", us.getTotalCount(), PortletSession.APPLICATION_SCOPE);
		
		System.out.println("page_count ="+us.getPageCount());
		System.out.println("current psge ="+us.getCurrentPage());
		System.out.println("page size ="+us.getPageSize());
		System.out.println("total count="+us.getTotalCount());
				return actionMapping.findForward(
				"/sample_struts_portlet/searchuser_success");
	}
}
