<%@ include file="/html/portlet/sample_struts_portlet/init.jsp" %>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page import= "javax.portlet.PortletSession" %>
<%@ page import= "javax.portlet.ActionRequest" %>
<%@ page import="org.cyclos.model.messaging.notifications.NotificationVO" %>

<% 		
		ArrayList<NotificationVO> list= new ArrayList<NotificationVO>();
		list = (ArrayList<NotificationVO>)session.getAttribute("PageItems"); 
		int PageCount = (Integer)session.getAttribute("PageCount");
		int TotalCount = (Integer)session.getAttribute("TotalCount");
		String date = "";
		
%>
<body>
<div style="border: 1px solid #cccccc; width: auto; height: auto;">
<table cellspacing="5" cellpadding="5" align="center" width="100%">
<tr><th>Notification</th></tr>
<tr> <td width="30%"><strong>Message</strong></td><td width="30%"><strong>Date</strong></td></tr>
<%if(list.size()>0)
{

for(int i=0;i<list.size();i++){ 
	date = list.get(i).getDate().getMonth()+"-"+list.get(i).getDate().getDate()+"-"+list.get(i).getDate().getYear()+" "+list.get(i).getDate().getHours()+":"+list.get(i).getDate().getMinutes()+":"+list.get(i).getDate().getSeconds();
%>
	
<tr><td><%=list.get(i).getType()%></td><td><%=date %></td></tr>
<%} }else{%>
<tr><td colspan="3">No Messages Available</td></tr>
<%} %>
</table>
</div>

</body>