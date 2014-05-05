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
import org.cyclos.model.banking.transactions.PaymentVO;
import org.cyclos.utils.PageImpl;

import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.samplestruts.struts.form.LoginForm;
import com.liferay.samplestruts.struts.form.Pay2UserForm;


import com.liferay.samplestruts.struts.form.LoginForm;

public class Pay2UserAction extends Action {

	/**
	 * 
	 */
	public ActionForward execute(
			ActionMapping actionMapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
		response.setHeader("Pragma","no-cache"); //HTTP 1.0 
		response.setHeader("Cache-Control","no-store");
		response.setDateHeader ("Expires", 0); 
		
		Pay2UserForm pay2userForm = (Pay2UserForm)actionForm;
		
		String amount = pay2userForm.getAmount();
		String payeeto = pay2userForm.getTo();
		String desc = pay2userForm.getDesc();
		String from_acc = pay2userForm.getFrom_acc();
		
		ActionRequest aReq = (ActionRequest) request.getAttribute("javax.portlet.request");
		ActionResponse aRes = (ActionResponse) request.getAttribute("javax.portlet.response");
		PortletSession session = aReq.getPortletSession();
		
		HttpSession session1 = request.getSession();
		String username = (String)session1.getAttribute("username");
		String password = (String)session1.getAttribute("password");
		 System.out.println(amount+"?????"+username+"??????"+password);
		//String ur = "http://localhost:8091/"+uname;
		 String ur = "http://localhost:6549/PaytoMember?payee="+payeeto+"&amt="+amount+"&user="+username+"&pass="+password;
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
	        PaymentVO us = (PaymentVO) obj;
	        String date =  ""+us.getDate().getDate()+"/"+us.getDate().getMonth()+"/"+us.getDate().getYear();
	        
	        session.setAttribute("Amount", us.getCurrencyAmount().getAmount(), PortletSession.APPLICATION_SCOPE);
	        session.setAttribute("Currency", us.getCurrencyAmount().getCurrency().getName(), PortletSession.APPLICATION_SCOPE);
	        session.setAttribute("FromOwner", us.getFromOwner().toString(), PortletSession.APPLICATION_SCOPE);
	        
	        session.setAttribute("Date", date, PortletSession.APPLICATION_SCOPE);
	        session.setAttribute("ToOwner", us.getToOwner().toString(), PortletSession.APPLICATION_SCOPE);
	       
	        session.setAttribute("Type", "Payment To "+us.getType().getTo().getName(), PortletSession.APPLICATION_SCOPE);
			session.setAttribute("desc", desc, PortletSession.APPLICATION_SCOPE);
	       
			
	       // System.out.println("page_count ="+us.getDate());
	       
			//System.out.println("page_items"+us.getCurrencyAmount());
			
			SessionMessages.add(aReq, "success");		

		
		return actionMapping.findForward("/sample_struts_portlet/pay2user");
	}
	}
