package com.liferay.samplestruts.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class SearchContactsAction extends Action {
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public ActionForward execute(
			ActionMapping actionMapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		/*response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
		response.setHeader("Pragma","no-cache"); //HTTP 1.0 
		response.setHeader("Cache-Control","no-store");
		response.setDateHeader ("Expires", 0); 
		*/
		
		
		return actionMapping.findForward("/sample_struts_portlet/search_contacts_success");
	}

}
