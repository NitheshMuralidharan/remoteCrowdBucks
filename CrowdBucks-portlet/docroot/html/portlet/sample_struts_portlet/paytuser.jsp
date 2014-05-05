<%@ include file="/html/portlet/sample_struts_portlet/init.jsp"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="javax.portlet.PortletSession"%>
<%@ page import="javax.portlet.ActionRequest"%>
<%@ page import="org.cyclos.model.banking.accounts.AccountSummaryVO"%>


<%
	ArrayList<AccountSummaryVO> list = new ArrayList<AccountSummaryVO>();
	if (session.getAttribute("total_users") != null) {
		list = (ArrayList<AccountSummaryVO>) session
				.getAttribute("total_users");
	}
%>
<body>
	<div style="border: 1px solid #cccccc; width: 95%;">
		<p
			style="color: #4a7098; font-size: 18px; margin-top: 2%; margin-left: 2%">Payment
			to user</p>
		<!--  action="/sample_struts_portlet/paytuser" -->
		<html:form action="/sample_struts_portlet/banking/action/to_user">


			<table cellspacing="5" cellpadding="5" align="center" width="100%">
				<tr>
					<td>From account</td>
					<td>
						<%
							if (list.size() > 0) {
									for (int i = 0; i < list.size(); i++) {
						%> <%=list.get(i).getName()%> Account - Balance: <%=list.get(i).getBalance().getAmount()%>
						<%=list.get(i).getBalance().getCurrency()%> <%
 	}
 		}
 %>
					</td>
				</tr>
				<tr>
					<td>Amount</td>
					<td><html:text property="amount" name="Pay2UserForm" /></td>
				</tr>
				<tr>
					<td>To</td>
					<td><html:text property="to" name="Pay2UserForm" /></td>
				</tr>
				<tr>
					<td>Description</td>
					<td><html:textarea property="desc" name="Pay2UserForm" /></td>
				</tr>
	
			</table>
		    <html:submit
				style="background: #ffcc66; width: 60px; height: 25px; radius:20px ;">Submit</html:submit>
	
		</html:form>
		</div>
</body>