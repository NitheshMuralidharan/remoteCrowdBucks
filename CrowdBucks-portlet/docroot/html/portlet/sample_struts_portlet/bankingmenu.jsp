<%@ include file="/html/portlet/sample_struts_portlet/init.jsp"%>


<body>
<div style="border: 1px solid #cccccc;">
	<p
			style="color: #000000; font-size: 18px; margin-top: 2%; margin-left: 2%">
	My accounts</p>
	<div style="margin-left: 2%">
	<html:link page="/portlet_action/sample_struts_portlet/banking">Account Summary</html:link>
	</div>
	
	<p style="color:#000000;font-size: 18px; margin-top: 2%; margin-left: 2%">Payment</p>
	<div style="margin-left: 2%">
	<html:link page="/portlet_action/sample_struts_portlet/banking/to_user">To User</html:link>
	</div>
	<div style="margin-left: 2%">
	<html:link page="/portlet_action/sample_struts_portlet/banking/to_system">To system</html:link>
	</div>
	<div style="margin-left: 2%">
	<html:link page="/portlet_action/sample_struts_portlet/banking/to_self">To Self</html:link>
	</div>
</div>
</body>
