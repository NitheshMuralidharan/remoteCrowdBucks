<%@ include file="/html/portlet/sample_struts_portlet/init.jsp" %>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page import= "javax.portlet.PortletSession" %>
<%@ page import= "javax.portlet.ActionRequest" %>
<%@ page import="org.cyclos.model.users.addresses.UserAddressVO" %>

<%  		
   		ArrayList<UserAddressVO> list= new ArrayList<UserAddressVO>();
		 list = (ArrayList<UserAddressVO>)session.getAttribute("userAdd"); 
%>
<body>
<div style="border: 1px solid #cccccc; width: auto; height: auto;">
<table cellspacing="5" cellpadding="5" align="center" width="100%">
<%for(int i=0;i<list.size();i++){ %>

	<tr> <th>ADDRESS</th></tr>
<tr><td>Address line 1</td><td><%=list.get(i).getAddressLine1() %></td></tr>
<tr><td>PO Box</td><td><%=list.get(i).getPoBox() %></td></tr>
<tr><td>Zip Code</td><td><%=list.get(i).getZip() %></td></tr>
<tr><td>City</td><td><%=list.get(i).getCity()%></td></tr>	
<tr><td>Region or state</td><td><%=list.get(i).getRegion()%></td></tr>
<tr><td>Country</td><td><%=list.get(i).getCountry() %></td></tr>
</table>
<%} %>
</div>
</body>
