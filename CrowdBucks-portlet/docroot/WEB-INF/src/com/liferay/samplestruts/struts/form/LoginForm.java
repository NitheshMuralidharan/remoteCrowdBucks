package com.liferay.samplestruts.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

@SuppressWarnings("serial")
public class LoginForm extends ActionForm {
	
	
	

public String getUsername() {
	return _username;
}

public String getPassword() {
	return _password;
}


@Override
public void reset(ActionMapping actionMapping, HttpServletRequest req) {
_username = null;
_password = null;
}



public void setUsername(String username) {
	_username = username;
}

public void setPassword(String password) {
	_password = password;
}

@Override
public String toString() {
return _username + " " + _password;
}

@Override
public ActionErrors validate(
ActionMapping actionMapping, HttpServletRequest req) {

ActionErrors errors = new ActionErrors();

if ((_username == null) || (_username.length() < 1)) {
errors.add(
"username", new ActionMessage("error.username.required"));
}

if ((_password == null) || (_password.length() < 1)) {
errors.add(
"password",
new ActionMessage("error.password.required"));
}

return errors;
}

private String _username;
private String _password;


}