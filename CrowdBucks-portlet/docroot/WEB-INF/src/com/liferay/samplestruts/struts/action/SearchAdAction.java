package com.liferay.samplestruts.struts.action;

import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

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
import org.cyclos.model.marketplace.advertisements.BasicAdVO;
import org.cyclos.utils.Page;
import org.cyclos.utils.PageImpl;

import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.samplestruts.struts.form.SearchAdForm;


public class SearchAdAction extends Action  {

	
	@Override
	public ActionForward execute(
			ActionMapping actionMapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		
SearchAdForm search1 =(SearchAdForm) actionForm;
		
		
		String key = search1.getKey();
        		
		ActionRequest aReq = (ActionRequest) request.getAttribute("javax.portlet.request");
		ActionResponse aRes = (ActionResponse) request.getAttribute("javax.portlet.response");
		PortletSession session = aReq.getPortletSession();
		session.setAttribute("key", key, PortletSession.APPLICATION_SCOPE);
		 HttpSession session1 = request.getSession();
		 String username = (String)session1.getAttribute("username");
		 String password = (String)session1.getAttribute("password");
		 String ur = "http://localhost:6549/SearchAds?ads="+key+"&user="+username+"&pass="+password;
		 // mule code
		 final URL url1 = new URL(ur);
			
			final HttpURLConnection conn = (HttpURLConnection) url1.openConnection();

	        conn.setRequestMethod("GET");
	        conn.setReadTimeout(10000);
	        conn.connect();

	        final ObjectInputStream is = new ObjectInputStream(conn.getInputStream());

	        final Object obj = is.readObject();
	        Page<BasicAdVO> ads= (PageImpl) obj;	
			
	        session.setAttribute("adpage_count", ads.getPageCount(), PortletSession.APPLICATION_SCOPE);
	        session.setAttribute("adpage_items", ads.getPageItems(), PortletSession.APPLICATION_SCOPE);
	       // session.setAttribute("total_users", us.getTotalCount(), PortletSession.APPLICATION_SCOPE);
			//session.setAttribute("ads", ads, PortletSession.APPLICATION_SCOPE);
	        System.out.println("page_count ="+ads.getPageCount());
			System.out.println("page_items"+ads.getPageItems());
			
			
			ArrayList ads123 = new ArrayList();
			for(int i=0; i<ads.getPageItems().size(); i++){
				
				ads123.add(ads.getPageItems().get(i).getCurrentPrice());
			}
			session.setAttribute("ads", ads123, PortletSession.APPLICATION_SCOPE);
			
			
			
			SessionMessages.add(aReq, "success");
			
		
		return actionMapping.findForward("/sample_struts_portlet/search-ad-success");
	}
}