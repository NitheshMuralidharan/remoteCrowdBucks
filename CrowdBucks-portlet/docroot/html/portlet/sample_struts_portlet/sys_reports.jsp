<%@ include file="/html/portlet/sample_struts_portlet/init.jsp" %>

<bean:define id="period" name="report" property="period" type="java.lang.String" />
<bean:define id="data_expenditure" name="report" property="data_expenditure" type="java.lang.String" />
<bean:define id="data_income" name="report" property="data_income" type="java.lang.String" />
<bean:define id="no_logins" name="report" property="no_logins" type="java.lang.String" />
<bean:define id="perc_not_trading" name="report" property="perc_not_trading" type="java.lang.String" />
<bean:define id="user_group_info" name="report" property="user_group_info" type="java.lang.String" />
<bean:define id="sys_acc" name="report" property="sys_acc" type="java.lang.String" />
<bean:define id="user_acc" name="report" property="user_acc" type="java.lang.String" />
<bean:define id="adv_info" name="report" property="adv_info" type="java.lang.String" />
<bean:define id="references" name="report" property="references" type="java.lang.String" />
<bean:define id="groups" name="report" property="groups" type="java.lang.String" />




<h2 style="color: blue">System reports</h2>
<hr>
<html:form action="/sample_struts_portlet/report/action">
	<table border="0" cellspacing="5" cellpadding = "5" align="center" width="100%">
		<tr><td width="50%">Period</td><td width="50%" align="center"><html:select property="period" name="report">
				<html:option value="2014querter1">2014 Querter 1</html:option>
				<html:option value="2013querter4">2013 Querter 4</html:option>
				<html:option value="2013querter3">2013 Querter 3</html:option>
				<html:option value="2013querter2">2013 Querter 2</html:option>
				<html:option value="2014">2014</html:option>
				<html:option value="2013">2013</html:option>
				<html:option value="2012">2012</html:option>
				<html:option value="march2014">March,2014</html:option>
				<html:option value="february2014">February,2014</html:option>
				<html:option value="january2014">January,2014</html:option>
				<html:option value="december2013">December,2013</html:option>
				<html:option value="2014week13">2014 Week 13</html:option>
				<html:option value="2014week12">2014 Week 12</html:option>
				<html:option value="2014week11">2014 Week 11</html:option>
				<html:option value="2014week10">2014 Week 10</html:option>
				<html:option value="other">Other</html:option>
				</html:select></td>
		</tr>
		</table>
		<br><br>
		<font color="grey" size="4">Report preferences (sections)</font>
		
		<hr>
		<table border="0" cellspacing="5" cellpadding = "5" align="center" width="100%">
		<tr><td>Data on expenditure</td><td><html:checkbox property="data_expenditure" name="report"></html:checkbox></td></tr>
		<tr><td>Data on income</td><td><html:checkbox property="data_income" name="report"></html:checkbox></td></tr>
		<tr><td>Number of logins</td><td><html:checkbox property="no_logins" name="report"></html:checkbox></td></tr>
		<tr><td>Percentage not trading</td><td><html:checkbox property="perc_not_trading" name="report"></html:checkbox></td></tr>
		<tr><td>User group information</td><td><html:checkbox property="user_group_info" name="report"></html:checkbox></td></tr>
		<tr><td>System accounts</td><td><html:checkbox property="sys_acc" name="report"></html:checkbox></td></tr>
		<tr><td>User accounts</td><td><html:checkbox property="user_acc" name="report"></html:checkbox></td></tr>
		<tr><td>Advertisements information</td><td><html:checkbox property="adv_info" name="report"></html:checkbox></td></tr>
		<tr><td>References</td><td><html:checkbox property="references" name="report"></html:checkbox></td></tr>
		</table>
		<br><br>
		<font color="grey" size="4"> Report preferences (filters)</font>
		<hr>
		<table border="0" align="center" width="100%">
		
		<tr><td width="50%">Show for groups</td><td width="50%" align="center"><html:select property="groups" name="report">
		<html:option value="users"> users</html:option>
		<html:option value="crwd"> crwd</html:option>
		
		</html:select></td></tr>
	</table>



</html:form>
</body>
