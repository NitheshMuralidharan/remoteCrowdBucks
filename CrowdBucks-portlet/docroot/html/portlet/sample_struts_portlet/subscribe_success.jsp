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
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page import= "javax.portlet.PortletSession" %>
<%@ page import= "javax.portlet.ActionRequest" %>

<%

		 Integer page_count = (Integer)session.getAttribute("page_count");
		 
		 ArrayList<String> list= new ArrayList<String>();
		 list = (ArrayList<String>)session.getAttribute("page_items");
		 
		 

%>
<strong>Subscribe Success</strong>
<h2>page_count : <%=page_count %></h2>
<%
  Iterator itr = list.iterator();
%><h2>Page_Items :</h2><%
while(itr.hasNext()) {
	Object pg_item = itr.next();
	%><%=pg_item %><%} %>

<%-- <h2>page_items : <%=page_items %></h2> --%>