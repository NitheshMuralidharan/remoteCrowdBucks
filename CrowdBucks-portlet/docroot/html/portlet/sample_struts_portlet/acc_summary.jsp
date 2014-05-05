<%@ include file="/html/portlet/sample_struts_portlet/init.jsp"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="javax.portlet.PortletSession"%>
<%@ page import="javax.portlet.ActionRequest"%>
<%@ page import="org.cyclos.model.banking.accounts.AccountSummaryVO"%>
<%
	ArrayList<AccountSummaryVO> list = new ArrayList<AccountSummaryVO>();
	list = (ArrayList<AccountSummaryVO>) session
			.getAttribute("total_users");
%>
<body>
	<div style="border: 1px solid #cccccc; width: auto; height: auto;">
		<p
			style="color: #4a7098; font-size: 20px; margin-top: 2%; margin-left: 1%">Account
			summary</p>
			<table cellspacing="5" cellpadding="5" align="center" width="100%">
				<tr>
					<th>Account</th>
					<th>Balance</th>
				</tr>
				<%
					for (int i = 0; i < list.size(); i++) {
				%>
				<tr>
					<td>
					<bean:define id="ID" type="java.lang.String"><%=i%></bean:define>
					<html:link
							page="/portlet_action/sample_struts_portlet/banking/crowdbucks_acc?id=${ID}"">
							<%=list.get(i).getName()%></html:link></td>
					<td><%=list.get(i).getBalance().getAmount()%> <%=list.get(i).getBalance().getCurrency()%></td>
				</tr>
				<%
					}
				%>
			</table>
		</div>
</body>