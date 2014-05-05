<%@ include file="/html/portlet/sample_struts_portlet/init.jsp"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="s"%>
<html>
<head>
<title>TODO supply a title</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width">

<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body style="overflow: hidden;">
	<%
		response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1 
		response.setHeader("Pragma", "no-cache"); //HTTP 1.0 
		response.setHeader("Cache-Control", "no-store");
		response.setDateHeader("Expires", 0);

		/*  String uname= (String)session.getAttribute("username");
		if(uname!=null){
		 	session.invalidate();
		 
		} */
	%>
	<div
		style="border: 1px solid #555; width: 90%; margin-left: 50px; background: #ffffff; border-radius: 5px; position: relative;">
		<p
			style="color: #567ea0; font-size: 28px; margin-top: 1%; margin-left: 1%;">System
			Login</p>
		<hr style="margin-left: 30px; margin-right: 30px; margin-top: 10px;">
		<div>
			<p style="margin-left: 3%; font-size: 16px; font-weight: bold;">Register
				now</p>
			<p style="margin-left: 3%; margin-right: 50%">The Cyclos platform
				permits a de-centralization of banking services that can stimulate
				local trade and development. You can create a new account below. You
				will receive an e-mail with the login information, in case you did
				not receive an email please check your spam/junk folder.</p>
			<p style="margin-left: 3%; margin-right: 50%">You can change this
				text by going to: System management - Content management -
				Application translation - ACCESS.LOGIN.register.text</p>
			<p style="margin-left: 30px;">
				<a href="" style="text-decoration: none; color: #3366ff;">Click
					here to register</a>
			</p>

		</div>
		<p
			style="position: absolute; border-left: 1px solid #d9d9d9; margin-left: 58%; height: 78%; top: 18%;">
		</p>
		<div style="position: absolute; bottom: -1%; margin-left: 60%;">
			<p style="font-weight: bold;">Login to Cyclos</p>
			<html:form action="/html/login">
				<table>
					<tr>
						<td>Login name</td>
					</tr>
					<tr>
						<td><html:text property="username" name="LoginForm">
							</html:text></td>
						<td><font color="red"><html:errors property="username"/></font></td>
					</tr>
					<tr>
						<td>Login password</td>
					</tr>
					<tr>
						<td><html:password property="password" name="LoginForm">
							</html:password></td>
						<td><font color="red"><html:errors property="password"/></font></td>
					</tr>
				</table>
				<html:submit
					style="background: #ffcc66; width: 60px; height: 25px; radius:20px;">sign in</html:submit>
			</html:form>
			<p style="position: relative; top: -24px;">
				<a href="" style="text-decoration: none; color: #6699ff;">Click
					here if you have problems logging in</a>

			</p>

		</div>
	</div>
</body>
</html>