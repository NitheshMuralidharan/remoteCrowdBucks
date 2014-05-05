<%@ include file="/html/portlet/sample_struts_portlet/init.jsp"%>
<%@ page import="org.cyclos.model.banking.accounts.AccountSummaryVO" %>
<%
	ArrayList<AccountSummaryVO> list= new ArrayList<AccountSummaryVO>();
	if(session.getAttribute("total_users")!=null){
	 list = (ArrayList<AccountSummaryVO>)session.getAttribute("total_users");
	}
	
%>



<body>
	<div style="border: 1px solid #cccccc; width: 95%;">
		<p
			style="color: #4a7098; font-size: 18px; margin-top: 2%; margin-left: 2%">Payment
			to System</p>
		
		   <html:form action="/sample_struts_portlet/banking/action/paytsys">
           <table cellspacing="5" cellpadding="5" align="center" width="100%">
			<tr><td>From account</td>
			<td><%=list.get(0).getName()%>Account - Balance: <%=list.get(0).getBalance().getAmount() %> <%=list.get(0).getBalance().getCurrency() %>
			</td></tr>
			<tr><td>Amount:</td><td><html:text property="amount" name="Pay2SysForm"/></td></tr>
			<tr><td>Payment Type:</td><td><html:select property="payment">
            <html:option value="p1">Payment to community account</html:option>
            <html:option value="p2">Payment to Debit account</html:option>
            <html:option value="p3">Payment to organization account</html:option>
            </html:select></td></tr>
			<tr><td>Description:</td>
			<td><html:textarea property="desc" name="Pay2SysForm"/></td>
			</tr>
			</table>
            <html:submit style="background: #ffcc66; width: 60px; height: 25px; radius:20px;">Submit</html:submit>
		</html:form>
		</div>

</body>