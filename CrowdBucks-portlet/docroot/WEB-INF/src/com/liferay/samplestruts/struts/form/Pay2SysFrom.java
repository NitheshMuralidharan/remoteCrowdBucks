package com.liferay.samplestruts.struts.form;

import org.apache.struts.action.ActionForm;

public class Pay2SysFrom extends ActionForm {
	private static final long serialVersionUID = 1L;

	private String desc;
	private String amount;
	private String payment;
    public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	

	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return amount + " " + desc+""+payment;
	
	}
}


