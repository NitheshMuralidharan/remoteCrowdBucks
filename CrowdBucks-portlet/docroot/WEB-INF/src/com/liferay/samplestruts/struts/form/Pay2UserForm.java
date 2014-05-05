package com.liferay.samplestruts.struts.form;

import org.apache.struts.action.ActionForm;

public class Pay2UserForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String from_acc;
	private String amount;
	private String to;
    private String desc;

	
	
	
	public String getFrom_acc() {
		return from_acc;
	}
	public void setFrom_acc(String from_acc) {
		this.from_acc = from_acc;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
