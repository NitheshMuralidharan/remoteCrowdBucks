<%@ include file="/html/portlet/sample_struts_portlet/init.jsp"%>
<%@ page import="java.util.*,java.io.*"%>
<%
BigDecimal Amount =(BigDecimal) session.getAttribute("Amount");
String Currency = (String) session.getAttribute("Currency");
String FromOwner =(String) session.getAttribute("FromOwner");
String Type =(String) session.getAttribute("Type");
String Date =(String) session.getAttribute("Date");
String ToOwner =(String) session.getAttribute("ToOwner");
String desc =(String) session.getAttribute("desc");
 
 session.setAttribute("Currency", Currency);
 session.setAttribute("Amount", Amount);
 session.setAttribute("FromOwner", FromOwner);
 session.setAttribute("Type", Type);
 session.setAttribute("ToOwner", ToOwner);
 session.setAttribute("desc", desc);
 session.setAttribute("Date", Date);
%>
<body>
<div style="border:1px solid #cccccc; widht 95%;" >
<p style="color: #4a7098; font-size: 18px; margin-top: 2%; margin-left: 2%">Transfer Details</p>
<table cellspacing="5" cellpadding="5" align="center" width="100%">
<tr><td>Amount</td><td><%=Amount %></td></tr>
<tr><td>Date</td><td><%=Date %></td></tr>
<tr><td>From</td><td><%=FromOwner %></td></tr>
<tr><td>To</td><td><%=ToOwner%></td></tr>
<tr><td>Payment Type</td><td><%=Type %></td></tr>
<tr><td>Description</td><td><%=desc %></td></tr>
</table>
<html:link page="/portlet_action/sample_struts_portlet/banking/to_system">
<html:submit>Submit</html:submit>
</html:link><br>
<input type="button" value="Print this page" onClick="window.print()">
</div>
</body>