<%@ include file="/html/portlet/sample_struts_portlet/init.jsp"%>
<%@ page autoFlush="true" buffer="1094kb"%>
<%-- <bean:define id="uname" name="SearchUserForm" property="uname" type="java.lang.String" /> --%>
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

<div style="border: 1px solid #cccccc; width: 95%; padding-left: 2%;">
	<p
		style="color: #4a7098; font-size: 20px; margin-top: 2%; margin-left: 2%">
		My Contacts</p>
	<html:form action="/sample_struts_portlet/contact/action">
		<table>
			<tr>
				<th>Keywords :</th>
				<th><html:text property="contactKey" name="SearchContactsForm"></html:text>
				</th>
			</tr>
			<tr>
				<th><html:submit>Search</html:submit></th>
			</tr>
		</table>
	</html:form>
</div>
<%
	}
%>