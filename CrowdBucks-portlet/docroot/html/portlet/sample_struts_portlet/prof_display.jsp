<%@page import="java.util.List"%>
<%@ include file="/html/portlet/sample_struts_portlet/init.jsp" %>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page import= "javax.portlet.PortletSession" %>
<%@ page import= "javax.portlet.ActionRequest" %>
<%@ page import="org.cyclos.model.users.users.ViewProfileData" %>
<%@ page import="org.cyclos.model.marketplace.advertisements.UserAdsSearchData" %>
<%@ page import="org.cyclos.model.users.addresses.UserAddressVO" %>
<%@ page import="org.cyclos.model.users.phones.PhoneVO" %>

<%
		 ViewProfileData detail = (ViewProfileData) session.getAttribute("viewProfile");
		 String date = detail.getActivities().getUserActivationDate().getDate()+"/"+detail.getActivities().getUserActivationDate().getMonth()+"/"+detail.getActivities().getUserActivationDate().getYear();
		 List<PhoneVO> phoneDetail = (List<PhoneVO>) detail.getPhoneListData().getPhones();
		 List<UserAddressVO> address = detail.getAddressListData().getAddresses();
   		
		 UserAdsSearchData detail1 = (UserAdsSearchData) session.getAttribute("userAdd");; 
%>
<body>
<div style="border: 1px solid #cccccc; width:100%;">
<table  cellspacing="5" cellpadding = "5" align="center" width="100%">
	<tr> <th>Account</th></tr>
	<tr><td>Login Name</td><td><%=detail.getUser().getUsername() %></td></tr>
	<tr><td>Name</td><td><%=detail.getUser().getName() %></td></tr>
	<tr><td>E-Mail</td><td><%=detail.getEmail() %></td></tr>
	
	<%for(int j=0;j<phoneDetail.size();j++){ %>
	<tr><td><%=phoneDetail.get(j).getName() %></td>
	<td><%=phoneDetail.get(j).getNormalizedNumber() %></td>
	</tr>
	<%} %>
	
    <tr><td>Gender</td><td> <%= detail.getCustomValues().get(0).getEnumeratedValues().get(0).getValue() %> </td></tr> 
    <tr><td>Martial status</td><td><%=detail.getCustomValues().get(1).getEnumeratedValues().get(0).getValue() %></td></tr>
    
  <tr><hr style="margin-left: 30px; margin-right: 30px; margin-top: -20px;"></tr>
	<tr> <th>Activities</th></tr>
    
    <tr><td>Activation date</td><td><%=date %></td></tr> 
  <!--   <tr><td>Advertisements</td><td><%=detail1.getAds().getTotalCount() %></td></tr>  -->
        
    <tr> <th>Addresses</th></tr>
   <%for(int i=0;i<address.size();i++){ %>
    <tr><td>Address line 1</td><td><%=address.get(i).getAddressLine1() %></td></tr>
    <tr><td>PO Box</td><td><%=address.get(i).getPoBox() %></td></tr>
    <tr><td>Zip Code</td><td><%=address.get(i).getZip() %></td></tr>
    <tr><td>City</td><td><%=address.get(i).getCity() %></td></tr>
    <tr><td>Region or state</td><td><%=address.get(i).getRegion() %></td></tr>
    <tr><td>Country</td><td><%= address.get(i).getCountry() %></td></tr>
   <% }%> 
</table>
</div>
</body>