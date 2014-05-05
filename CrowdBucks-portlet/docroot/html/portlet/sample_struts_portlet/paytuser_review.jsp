<%@ include file="/html/portlet/sample_struts_portlet/init.jsp"%>
<%@page import="java.math.BigDecimal"%>
<%@ page import="java.lang.*" %>
<%@ page import= "javax.portlet.PortletSession" %>
<%@ page import= "javax.portlet.ActionRequest" %>
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
<p style="color: #4a7098; font-size: 18px; margin-top: 2%; margin-left: 2%">Payment review</p>
<table cellspacing="5" cellpadding="5" align="center" width="100%">
<tr><td>From Account</td><td><%=FromOwner %></td></tr>
<tr><td>To</td><td><%=ToOwner %></td></tr>
<tr><td>Payment Type</td><td><%=Type %></td></tr>
<tr><td>Amount</td><td><%=Amount %> <%=Currency %></td></tr>
</table>
</div>
<html:link page="/portlet_action/sample_struts_portlet/banking/paytuser_success">
<html:submit style="background: #ffcc66; width: 60px; height: 25px; radius:20px;">Submit</html:submit>
</html:link>
</body>