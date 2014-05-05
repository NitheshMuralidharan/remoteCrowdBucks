<%@ include file="/html/portlet/sample_struts_portlet/init.jsp"%>
<body>
	<div style="border: 1px solid #cccccc; width: 95%;">
		<p
			style="color: #4a7098; font-size: 20px; margin-top: 2%; margin-left: 2%">Search
			advertisements</p>
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
		<html:form action="/sample_struts_portlet/advertise/action">
			<table>
				<tr>
					<th>Advertisement :</th>
				</tr>
				<tr>
					<html:text property="key" name="SearchAdForm"></html:text>
				</tr>
				<tr>
					<html:submit>Search</html:submit>
				</tr>
			</table>
		</html:form>

		<%
			}
		%>
	</div>
</body>