<%@ include file="/html/portlet/sample_struts_portlet/init.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
      <li id="current"><a href="http://all-free-download.com/free-website-templates/">Home</a><br /></li>
      <li><html:link page="/portlet_action/sample_struts_portlet/nested/render"><span>Nested</span></html:link><br /></li>
      <li><html:link page="/portlet_action/sample_struts_portlet/subscribe/render?firstName=Vijay&lastName=BG&emailAddress=test@liferay.com"><span>Subscribe</span></html:link><br /></li>
      <li><html:link page="/portlet_action/sample_struts_portlet/unsubscribe/render?firstName=Vijay&lastName=BG&emailAddress=test@liferay.com"><span>Unsubscribe</span></html:link><br /></li>
      <li><html:link page="/portlet_action/sample_struts_portlet/upload/render"><span>Upload</span></html:link><br /></li>
      <li><a href="layout-6.html">ABOUT US</a><br /></li>
      <li><a href="layout-7.html">CONTACT US</a><br /></li>
    </ul>
</body>
</html>