<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@page import="java.nio.channels.SeekableByteChannel"%>
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
<div></div>
<p align="right">
	<html:link page="/portlet_action/sample_struts_portlet/view">
	 <span><img
	src="${pageContext.request.contextPath}/html/image/addtocart.jpg" height="2%" width="2%"/></span> 
	</html:link>
	<html:link page="/portlet_action/sample_struts_portlet/view">
	 <span><img
			src="${pageContext.request.contextPath}/html/image/msg.jpg" height="3%" width="2%"/></span> 
	</html:link>
	<html:link page="/portlet_action/sample_struts_portlet/view">
	 <span><img
			src="${pageContext.request.contextPath}/html/image/logout.jpg" height="3%" width="6%"/></span> 
	</html:link>
</div>	



</p> 

<ul id="menu1">
	<li class="drop"><html:link page="/portlet_action/sample_struts_portlet/home">Home</html:link></li>
	<li class="drop"><html:link page="/portlet_action/sample_struts_portlet/banking">Banking</html:link></li>
    <li class="drop"><html:link page="/portlet_action/sample_struts_portlet/users/render">Users</html:link></li>
   	<li class="drop"><html:link page="/portlet_action/sample_struts_portlet/advertise/render">Marketplace</html:link>
   	</li>
	<li class="drop"><html:link page="/portlet_action/sample_struts_portlet/personal">Personal</html:link></li>
</ul>
<%
 	}
 %>
<!-- 
<ul id="menu">
	<li class="menu_right"><a href="#" class="drop">Settings</a>
		<div class="dropdown_1column align_right">
			<div class="col_1">
				<ul class="simple">
					<li><html:link
							page="/portlet_action/sample_struts_portlet/view">
					LOGOUT	</html:link></li>
				</ul>
			</div>
		</div></li>
</ul> -->
 