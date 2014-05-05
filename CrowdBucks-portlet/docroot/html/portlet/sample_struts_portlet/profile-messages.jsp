<%@ include file="/html/portlet/sample_struts_portlet/init.jsp" %>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page import= "javax.portlet.PortletSession" %>
<%@ page import= "javax.portlet.ActionRequest" %>
<%@ page import="org.cyclos.model.messaging.messages.MessageVO" %>

<%  		
   		ArrayList<MessageVO> Inboxlist= new ArrayList<MessageVO>();
		Inboxlist = (ArrayList<MessageVO>)session.getAttribute("InboxPageItems"); 
		int InboxPageCount = (Integer)session.getAttribute("InboxPageCount");
		int InboxTotalCount = (Integer)session.getAttribute("InboxTotalCount");
		String Inboxdate = "";
		
%>
<body>
<div style="border: 1px solid #cccccc; width: auto; height: auto;">
<table style="width: 100%;">

<tr><th>Message Box</th></tr>
<tr><td width="30%"><html:link page="/portlet_action/sample_struts_portlet/messages"><strong>Inbox</strong></html:link></td>
<td width="30%"><html:link page="/portlet_action/sample_struts_portlet/message-sent"><strong>Sent Messages</strong></html:link></td>
<td width="30%"><html:link page="/portlet_action/sample_struts_portlet/message-trash"><strong>Trash</strong></html:link></td>
</tr>
</table>
</div>
<div style="border: 1px solid #cccccc; width: auto; height: auto;">
<table style="width: 100%;">
<tr><th>Inbox Messages</th></tr>
<tr> <td width="30%"><strong>From</strong></td><td width="30%"><strong>Subject</strong></td><td width="30%"><strong>Date</strong></td></tr>
<%if(Inboxlist.size()>0)
	{
	for(int i=0;i<Inboxlist.size();i++){ 
	
	Inboxdate = Inboxlist.get(i).getDate().getDate()+"/"+Inboxlist.get(i).getDate().getMonth()+"/"+Inboxlist.get(i).getDate().getYear();
%>
	
<tr><td><%=Inboxlist.get(i).getOwner().getName() %></td><td><%=Inboxlist.get(i).getSubject() %></td><td><%=Inboxdate %></td></tr>
<%} }else{%>
<tr><td colspan="3">No Messages Available</td></tr>
<%} %>
</table>
</div>

</body>