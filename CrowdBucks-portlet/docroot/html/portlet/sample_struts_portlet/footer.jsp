<%@ include file="/html/portlet/sample_struts_portlet/init.jsp" %>
<%response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
response.setHeader("Pragma","no-cache"); //HTTP 1.0 
response.setHeader("Cache-Control","no-store");
response.setDateHeader ("Expires", 0);
if(session.getAttribute("username") == null){
  	
	RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
	   rd.forward(request, response);
  
  } else {
%>
<html>

<body >
<center><p> &#169; <font color="blue">Azstrel </font></p></center> 
</body>
</html>
<%}%>