
<%@ include file="/html/portlet/sample_struts_portlet/init.jsp" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page import= "javax.portlet.PortletSession" %>
<%@ page import= "javax.portlet.ActionRequest" %>
<%@ page import= "org.cyclos.utils.Page" %>
<%@ page import= "org.cyclos.model.marketplace.advertisements.BasicAdVO" %>
<liferay-ui:success key="success" message="Search Ad successfully!"/>
<%

		 Integer page_count = (Integer)session.getAttribute("adpage_count");
		// Integer total_users = (Integer)session.getAttribute("total_users");
		
		 ArrayList<String> list= new ArrayList<String>();
		 list = (ArrayList<String>)session.getAttribute("adpage_items");
		 
		 ArrayList<String> ads= new ArrayList<String>();
   					ads = (ArrayList<String>)session.getAttribute("ads");

  Iterator itr = list.iterator();
  Iterator itr1 = ads.iterator();
%>

<div class="CSS_Table_Example" style="width:600px;">
<table >
	<tr> 
		<th>AdName </th>
		<th></th>
		<th>Price </th>
						
	</tr>
	<%
		while(itr.hasNext() && itr1.hasNext()) {
		Object pg_item = itr.next();
		Object price = itr1.next();
	%>
			
	<tr>
		<td ><%=pg_item %></td>
		<td></td>
		<td ><%=price %></td>
		
		
	</tr>

		
	<%
	}%>
</table>
</div>