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
<%response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
response.setHeader("Pragma","no-cache"); //HTTP 1.0 
response.setHeader("Cache-Control","no-store");
response.setDateHeader ("Expires", 0); 
if(session.getAttribute("username") == null){
  	
	RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
	   rd.forward(request, response);
  
  }else{

	  
%>

<%@ include file="/html/portlet/sample_struts_portlet/init.jsp" %>

<tiles:useAttribute classname="java.lang.String" id="tilesPortletContent" ignore="true" name="portlet_content" scope="request" />
<tiles:useAttribute classname="java.lang.String" id="tilesMenuContent" ignore="true" name="menu_content" scope="request" />


 <HTML>
	<HEAD>
		<TITLE><tiles:getAsString name="title"/></TITLE>
	</HEAD>
	<BODY >
		<TABLE border="0"  cellspacing="5" width="100%" >
			<TR height="20%">
				<TD colspan="2" width="100%" height="20%">
				<tiles:insert attribute="header" /></TD>
			</TR>
			<TR height="70%">
				<TD width="20%" valign="top" height="70%" >
					<tiles:insert attribute='menu'/>
				</TD>
				<TD valign="top" align="left" width="80%" height="70%">
					<tiles:insert attribute='body' />
				</TD>
			</TR>
			<TR height="10%">
				<TD colspan="2" width="100%" >
					<tiles:insert attribute="footer" />
				</TD>
			</TR>
		</TABLE>
	</BODY>
</HTML>
<%}%>