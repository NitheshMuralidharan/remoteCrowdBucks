package com.liferay.samplestruts.struts.form;

import org.apache.struts.action.ActionForm;

public class report extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String period;
	private String data_expenditure;
	private String data_income;
	private String no_logins;
	private String perc_not_trading;
	private String user_group_info;
	private String sys_acc;
	private String user_acc;
	private String adv_info;
	private String references;
	private String groups;
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getData_expenditure() {
		return data_expenditure;
	}
	public void setData_expenditure(String data_expenditure) {
		this.data_expenditure = data_expenditure;
	}
	public String getData_income() {
		return data_income;
	}
	public void setData_income(String data_income) {
		this.data_income = data_income;
	}
	public String getNo_logins() {
		return no_logins;
	}
	public void setNo_logins(String no_logins) {
		this.no_logins = no_logins;
	}
	public String getPerc_not_trading() {
		return perc_not_trading;
	}
	public void setPerc_not_trading(String perc_not_trading) {
		this.perc_not_trading = perc_not_trading;
	}
	public String getUser_group_info() {
		return user_group_info;
	}
	public void setUser_group_info(String user_group_info) {
		this.user_group_info = user_group_info;
	}
	public String getSys_acc() {
		return sys_acc;
	}
	public void setSys_acc(String sys_acc) {
		this.sys_acc = sys_acc;
	}
	public String getUser_acc() {
		return user_acc;
	}
	public void setUser_acc(String user_acc) {
		this.user_acc = user_acc;
	}
	public String getAdv_info() {
		return adv_info;
	}
	public void setAdv_info(String adv_info) {
		this.adv_info = adv_info;
	}
	public String getReferences() {
		return references;
	}
	public void setReferences(String references) {
		this.references = references;
	}
	public String getGroups() {
		return groups;
	}
	public void setGroups(String groups) {
		this.groups = groups;
	}
	
}
