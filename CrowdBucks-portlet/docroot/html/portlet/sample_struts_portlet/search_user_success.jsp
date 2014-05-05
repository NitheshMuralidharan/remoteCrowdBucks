<%@ include file="/html/portlet/sample_struts_portlet/init.jsp" %>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page import= "javax.portlet.PortletSession" %>
<%@ page import= "javax.portlet.ActionRequest" %>
<%@ page import="org.cyclos.model.users.users.UserDetailedVO" %>

<%

		 Integer page_count = (Integer)session.getAttribute("page_count");
		 Integer total_users = (Integer)session.getAttribute("total_users");
		 
		 ArrayList<UserDetailedVO> list= new ArrayList<UserDetailedVO>();
		 list = (ArrayList<UserDetailedVO>)session.getAttribute("page_items");
		 
		 
   
%>
<div style="border: 1px solid #cccccc; width: 95%; padding-left: 2%; float:left;">
<p style="color: #4a7098; font-size: 20px; margin-top: 2%; margin-left: 2%">
Number of Users Found : <%=total_users%></p>


	<%
		for(int i=0;i<list.size();i++) {
		UserDetailedVO userDetail = list.get(i);
	%>
		
	<div style="width: 25%;float: left;padding-left: 10px;">
	<span style="width: 100%;float: left;">
	<img width="100px" height="100px" src="http://localhost:8080/CrowdBucks-portlet/html/image/pagefile.png">
	</span><span style="width: 100%;">
	<strong style="color:#4a7098; "> <%=userDetail.getName() %></strong></span>
	</div>
		<%} %>
</div>

