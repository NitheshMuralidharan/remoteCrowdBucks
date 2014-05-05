<%@ include file="/html/portlet/sample_struts_portlet/init.jsp"%>
<%
	response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1 
	response.setHeader("Pragma", "no-cache"); //HTTP 1.0 
	response.setHeader("Cache-Control", "no-store");
	response.setDateHeader("Expires", 0);
	if (session.getAttribute("username") == null) {

		RequestDispatcher rd = request
				.getRequestDispatcher("Login.jsp");
		rd.forward(request, response);

	} else {
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HOME</title>
</head>
<body>

<!-- <div class="mainCenter"> --><div class="notificationContainer" aria-hidden="true" style="display: none;">
		</div><ul class="breadCrumb" aria-hidden="true" style="display: none;"></ul>
		<div class="pageContainer">
		<div class="pageHeadingContainer pageHeadingContainer-lineVisible" aria-hidden="true" style="display: none;">
		<div class="pageHeading">
		<div class="pageHeadingText">
		</div>
		<div class="pageHeadingWidgets" aria-hidden="true" style="display: none;">
		</div>
		</div>
		<div class="pageTabsContainer" aria-hidden="true" style="display: none;">
		<ul class="pageTabs"></ul></div>
		</div>
		<div class="pagePanel">
		<div class="page" id="org.cyclos.client.app.users.users.UserHomePage">
		<div>
		<div class="dashboardContainer"><div class="dashboardActions">
		<li class="dashboardAction">
		<html:link page="/portlet_action/sample_struts_portlet/banking">
			<img
				src="${pageContext.request.contextPath}/html/image/accountinfo.png" 
				class="dashboardActionIcon DASHBOARD_ACTION-ACCOUNT_INFO"/>
		
	    <table class="dashboardActionContainer"><tbody><tr><td>
		<div class="dashboardActionLabel">Account info</div></td></tr></tbody></table></html:link>
		</li>
	   <li class="dashboardAction">
		<html:link
			page="/portlet_action/sample_struts_portlet/banking/to_user">
			<img src="${pageContext.request.contextPath}/html/image/Payuser.png" 
			class="dashboardActionIcon DASHBOARD_ACTION-ACCOUNT_INFO"
			/>	
		<table class="dashboardActionContainer"><tbody><tr><td>
		<div class="dashboardActionLabel">Pay user</div></td></tr></tbody></table></html:link>
		</li>
	
<li class="dashboardAction">
		<html:link
			page="/portlet_action/sample_struts_portlet/banking/to_system">
			<img src="${pageContext.request.contextPath}/html/image/paysystem.png" 
			class="dashboardActionIcon DASHBOARD_ACTION-ACCOUNT_INFO"
			/>
		<table class="dashboardActionContainer"><tbody><tr><td>
		<div class="dashboardActionLabel">Pay system</div></td></tr></tbody></table></html:link>
		</li>
	
<li class="dashboardAction">
		<html:link
			page="/portlet_action/sample_struts_portlet/users/render">
			<img src="${pageContext.request.contextPath}/html/image/search user.png" 
			class="dashboardActionIcon DASHBOARD_ACTION-ACCOUNT_INFO"
			/>
		<table class="dashboardActionContainer"><tbody><tr><td>
		<div class="dashboardActionLabel">Search users</div></td></tr></tbody></table></html:link>
		</li>

<li class="dashboardAction">
		<html:link
			page="/portlet_action/sample_struts_portlet/contact/render">
			<img src="${pageContext.request.contextPath}/html/image/view contact.png" 
			class="dashboardActionIcon DASHBOARD_ACTION-ACCOUNT_INFO"
			/>
		<table class="dashboardActionContainer"><tbody><tr><td>
		<div class="dashboardActionLabel">View contacts</div></td></tr></tbody></table></html:link>
		</li>

<li class="dashboardAction">
		<html:link
			page="/portlet_action/sample_struts_portlet/personal">
			<img src="${pageContext.request.contextPath}/html/image/update profile.png" 
			class="dashboardActionIcon DASHBOARD_ACTION-ACCOUNT_INFO"
			/>
		<table class="dashboardActionContainer"><tbody><tr><td>
		<div class="dashboardActionLabel">Update profile</div></td></tr></tbody></table></html:link>
		</li>
</div></div></div>
<br>
		<div style="border: width:95%; padding-right:7%; padding-left:2%"">
			<p style="color: #4a7098; font-size: 25px; margin-top: 17%;">Home</p>
			<hr>
			<p style="color: #4a7098; font-size: 20px;">Network home page</p>
			<br> <br>
			<p>You can change the content of this page logging in as network
				admin and going to: "System management - Content management - Menu &
				Content - Static content - Logged users home" At the same location
				(in Static content) you can change the header and footer. The logo
				can be changed in the tab 'Logos'.</p>
			<br>
			<p>This content page is the home page for users, brokers and
				admins. If you want different content pages and settings for
				different groups you will have to create new configurations and
				bound them to groups. Make sure you define the configuration
				structure well. For more information please view the
				'Configurations' section of the administration manual.</p>
	

</body>
</html>

<%
	}
%>
		<!--  
	 <html:link page="/portlet_action/sample_struts_portlet/banking/to_system">
     <img src="${pageContext.request.contextPath}/html/image/send message.png"/>
     </html:link>	
	
	<html:link page="/portlet_action/sample_struts_portlet/banking/to_system">
     <img src="${pageContext.request.contextPath}/html/image/view message.png"/>
     </html:link>	
	
	 <html:link page="/portlet_action/sample_struts_portlet/banking/to_system">
     <img src="${pageContext.request.contextPath}/html/image/search ads.png"/>
     </html:link>
	
	<html:link page="/portlet_action/sample_struts_portlet/banking/to_system">
     <img src="${pageContext.request.contextPath}/html/image/place ads.png"/>
     </html:link>
	
	<html:link
		page="/portlet_action/sample_struts_portlet/banking/to_system">
		<img
			src="${pageContext.request.contextPath}/html/image/documentation.png" />
	</html:link>
	 -->