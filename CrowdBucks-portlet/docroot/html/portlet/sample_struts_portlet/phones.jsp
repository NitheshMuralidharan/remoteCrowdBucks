<%@ include file="/html/portlet/sample_struts_portlet/init.jsp"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page import= "javax.portlet.PortletSession" %>
<%@ page import= "javax.portlet.ActionRequest" %>
<%@ page import="org.cyclos.model.users.users.ViewProfileData" %>
<%@ page import="org.cyclos.model.users.phones.PhoneVO" %>

<%
		 List<PhoneVO> phoneDetail = (List<PhoneVO>) session.getAttribute("phoneDetail");
		
%>
<h1>Phone details</h1>
<body>
	<div style="border: 1px solid #cccccc; width: auto;">
		<table cellspacing="5" cellpadding="5" align="center" width="100%">
		<%for(int i=0;i<phoneDetail.size();i++){ %>
			<tr>
				<th><%=phoneDetail.get(i).getName() %> (Private)</th>
			</tr>
			<tr>
				<td>Phone Type</td>
				<td><%=phoneDetail.get(i).getName() %></td>
			</tr>
			<tr>
				<td>Number</td>
				<td><%=phoneDetail.get(i).getNormalizedNumber() %></td>
			</tr>
<%} %>
		</table>
	</div>
</body>