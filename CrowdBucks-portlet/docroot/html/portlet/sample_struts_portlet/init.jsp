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

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://portals.apache.org/bridges/struts/tags-portlet-html" prefix="html" %>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<%@ page import="com.liferay.portal.util.PortalUtil" %>

<%@ page import="java.util.HashMap" %><%@
page import="java.util.Locale" %><%@
page import="java.util.Map" %><%@
page import="java.util.ResourceBundle" %>

<%response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
response.setHeader("Pragma","no-cache"); //HTTP 1.0 
response.setHeader("Cache-Control","no-store");
response.setDateHeader ("Expires", 0);
%>

<%@ page import="java.util.Iterator"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import= "javax.portlet.PortletSession" %>
<%@ page import= "javax.portlet.ActionRequest" %>
<%@page import="java.math.BigDecimal"%>
<%@ page import="java.util.*,java.io.*"%>

<portlet:defineObjects />