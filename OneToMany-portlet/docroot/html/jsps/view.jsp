<%@page import="com.meera.db.service.AddressLocalServiceUtil"%>
<%@page import="com.meera.db.service.AddressLocalService"%>
<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@page import="com.liferay.portal.kernel.json.JSONFactoryUtil"%>
<%@page import="com.meera.db.model.Employee"%>
<%@page import="com.meera.db.model.impl.EmployeeImpl"%>
<%@page import="com.meera.db.service.EmployeeLocalServiceUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
dsafdsfdsgfdg
<%=AddressLocalServiceUtil.getEmployeeAddresses(11).size()%>