<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ include file="/html/portlet/sample_struts_portlet/init.jsp"%>
<%@ page import="org.cyclos.model.banking.accounts.AccountSummaryVO"%>

<body>
	<%
	String AcountID = (String)request.getParameter("id");
	System.out.println("<<<<<>>>>>>>"+AcountID);
	ArrayList<AccountSummaryVO> list= new ArrayList<AccountSummaryVO>();
	list = (ArrayList<AccountSummaryVO>)session.getAttribute("total_users");
	int id = Integer.parseInt(AcountID);
	%>
	<div style="border: 1px solid #FFFFFF; width: 95%;">
		<p
			style="color: #4a7098; font-size: 18px; margin-top: 2%; margin-left: 2%">crowdbucks
			account</p>
		<p style="margin-left: 2%">
					<img src="${pageContext.request.contextPath}/html/image/acc.png" />
			Balance :
			<%=list.get(id).getBalance().getAmount()%>
			<%=list.get(id).getBalance().getCurrency()%><br>

		</p>
	</div>
	<div style="border: 1px solid #cccccc; width: 95%;"></div>
</body>
