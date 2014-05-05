<%@ include file="/html/portlet/sample_struts_portlet/init.jsp" %>
<%@page import="org.cyclos.model.utils.CurrencyAmountDTO"%>
<%@page import="org.cyclos.model.banking.accounts.AccountSummaryVO"%>
<%@page import="org.cyclos.model.banking.accounts.AccountHistoryEntryVO"%>
<%@ page import="java.util.Iterator"%>
<%@ page import= "javax.portlet.PortletSession" %>
<%@ page import= "javax.portlet.ActionRequest" %>
<%@ page import= "java.net.URL" %>
<%@ page import= "java.net.HttpURLConnection" %>
<%@ page import= "java.io.ObjectInputStream" %>
<%@ page import= "org.cyclos.utils.PageImpl" %>
<%@page import="java.util.List"%>

<body>
<h2 style="color: blue">Account summary</h2>
<hr>

<%

//String username=(String)session.getAttribute("username");
//String password=(String)session.getAttribute("password");
// String ur = "http://localhost:8085/getAccountInfo?user="+username+"&pass="+password;
 

String ur = "http://localhost:8085/getAccountInfo?user=vijay&pass=vijay";

// mule code
 final URL url1 = new URL(ur);
	
	final HttpURLConnection conn = (HttpURLConnection) url1.openConnection();

    conn.setRequestMethod("GET");
    conn.setReadTimeout(10000);
    conn.connect();

    final ObjectInputStream is = new ObjectInputStream(conn.getInputStream());

    final Object obj = is.readObject();
    
	//PageImpl us=(PageImpl) obj;	

		List<AccountSummaryVO> listent=(List<AccountSummaryVO>)obj;
 
%>

<div class="CSS_Table_Example" style="width:600px;">
<table >
	<tr> 
		
		<td>Account </td>
		<td>Balance</td>					
	</tr>
	<%
	for(AccountSummaryVO curr : listent)
	 {
		CurrencyAmountDTO balance = curr.getBalance();
	
	%>
		
	<tr>
			<td><%=curr.getName() %></td>
		<td><%=balance.getAmount() %>$<%=balance.getCurrency() %></td>
	</tr>

	<%} %>
</table>
</div>

</body>