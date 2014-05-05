package com.liferay.samplestruts.struts.form;

import org.apache.struts.action.ActionForm;

public class SearchContactsForm extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String contactKey;

	public String getContactKey() {
		return contactKey;
	}

	public void setContactKey(String contactKey) {
		this.contactKey = contactKey;
	}
	}
