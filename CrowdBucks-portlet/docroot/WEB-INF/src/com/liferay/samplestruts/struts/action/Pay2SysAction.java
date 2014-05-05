package com.liferay.samplestruts.struts.action;

import java.io.BufferedInputStream;
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
import org.cyclos.model.banking.transactions.PaymentVO;
import org.omg.CORBA.portable.InputStream;

import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.samplestruts.struts.form.Pay2SysFrom;

public class Pay2SysAction extends Action{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
		Pay2SysFrom pay2sysForm = (Pay2SysFrom)actionForm;
		
		String amount = pay2sysForm.getAmount();
		String paymentType = pay2sysForm.getPayment();
		String desc = pay2sysForm.getDesc();
		
		
		PortletRequest aReq = (PortletRequest) request.getAttribute("javax.portlet.request");
		PortletResponse aRes = (PortletResponse) request.getAttribute("javax.portlet.response");
		PortletSession session = aReq.getPortletSession();
		
		
		HttpSession session1 = request.getSession();
		String username = (String)session1.getAttribute("username");
		String password = (String)session1.getAttribute("password");
		 System.out.println(amount+"?????"+username+"??????"+password);
		//String ur = "http://localhost:8091/"+uname;
		 String ur = "http://localhost:6549/PaytoSystem?amt="+amount+"&user="+username+"&pass="+password;
		 // mule code
		
		 final URL url1 = new URL(ur);
			
			final HttpURLConnection conn = (HttpURLConnection) url1.openConnection();

	        conn.setRequestMethod("GET");
	        conn.setReadTimeout(10000);
	        conn.connect();

	        System.out.println("Before Input Stream");
			ObjectInputStream is = new ObjectInputStream(conn.getInputStream());

	        final Object obj = is.readObject();
	        PaymentVO us = (PaymentVO) obj;
	        String date =  ""+us.getDate().getDate()+"/"+us.getDate().getMonth()+"/"+us.getDate().getYear();
	        
	        session.setAttribute("Amount", us.getCurrencyAmount().getAmount(), PortletSession.APPLICATION_SCOPE);
	        session.setAttribute("Currency", us.getCurrencyAmount().getCurrency().getName(), PortletSession.APPLICATION_SCOPE);
	        session.setAttribute("FromOwner", us.getFromOwner().toString(), PortletSession.APPLICATION_SCOPE);
	        
	        session.setAttribute("Date", date, PortletSession.APPLICATION_SCOPE);
	        session.setAttribute("ToOwner", us.getType().getTo().getName(), PortletSession.APPLICATION_SCOPE);
	       
	        session.setAttribute("Type", "Payment To "+us.getType().getTo().getName(), PortletSession.APPLICATION_SCOPE);
			session.setAttribute("desc", desc, PortletSession.APPLICATION_SCOPE);
			
	        System.out.println("page_count ="+us.getType().getNature().toString());
			System.out.println("page_items"+us.getCurrencyAmount());
			
			SessionMessages.add(aReq, "success");
		
		return actionMapping.findForward("/sample_struts_portlet/pay2sys_success");
}
}