<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<title>Insert title here</title>
</head>
<body>
	<div style="border: 1px solid #cccccc; width: 95%;">
		<p
			style="color: #4a7098; font-size: 18px; margin-top: 2%; margin-left: 2%">Crowbucks
			account</p>

		<div style="padding-left: 3%;">
			<img src="${pageContext.request.contextPath}/html/image/acc.png" />
			Balance: 0.00
		</div>
		<br>
		<p
			style="color: #4a7098; font-size: 18px; margin-top: 2%; margin-left: 2%">Saving
			account</p>
		<div style="padding-left: 3%;">
			<img src="${pageContext.request.contextPath}/html/image/acc.png" />
			Balance : 0<br> <img
				src="${pageContext.request.contextPath}/html/image/acc.png" />
			Available: 0<br>
		</div>
		<p
			style="color: #4a7098; font-size: 18px; margin-top: 2%; margin-left: 2%">Connected
			users</p>
		Active ads:0 <br> ACtive webshop ads:0<br> Pending sales:0<br>
		Pending Purchase:0<br> Unread messages:0<br> Last
		login:03-04-2014<br>
	</div>
</body>
</html>
<%
	}
%>