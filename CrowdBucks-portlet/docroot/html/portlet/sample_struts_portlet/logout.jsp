<%@ include file="/html/portlet/sample_struts_portlet/init.jsp" %>
<body>
<% response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
response.setHeader("Pragma","no-cache"); //HTTP 1.0 
response.setHeader("Cache-Control","no-store");
response.setDateHeader ("Expires", 0); 


    String uname= (String)session.getAttribute("username");
	if(uname!=null){
    	session.invalidate();
    
	}
	%>
   You are successfully logged out....
   <html:link page="/portlet_action/sample_struts_portlet/view"><span>LOGIN</span></html:link>
   
</body>