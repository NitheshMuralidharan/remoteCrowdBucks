package com.liferay.samplestruts.struts.action;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.liferay.samplestruts.struts.form.report;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ReportAction extends Action{
	
	@Override
	public ActionForward execute(
			ActionMapping actionMapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		
		report report = (report)actionForm;
		
		if (_log.isInfoEnabled()) {
			_log.info(report.toString());
		}

		return actionMapping.findForward(
			"/sample_struts_portlet/report_success");
	}

	private static Log _log = LogFactoryUtil.getLog(SubscribeAction.class);


	

}
