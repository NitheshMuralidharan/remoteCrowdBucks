/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.meera.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author E5410
 * @see Employee
 * @generated
 */
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
	public EmployeeWrapper(Employee employee) {
		_employee = employee;
	}

	@Override
	public Class<?> getModelClass() {
		return Employee.class;
	}

	@Override
	public String getModelClassName() {
		return Employee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeId", getEmployeeId());
		attributes.put("employeeName", getEmployeeName());
		attributes.put("employeeDesignation", getEmployeeDesignation());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		String employeeName = (String)attributes.get("employeeName");

		if (employeeName != null) {
			setEmployeeName(employeeName);
		}

		String employeeDesignation = (String)attributes.get(
				"employeeDesignation");

		if (employeeDesignation != null) {
			setEmployeeDesignation(employeeDesignation);
		}
	}

	/**
	* Returns the primary key of this employee.
	*
	* @return the primary key of this employee
	*/
	@Override
	public long getPrimaryKey() {
		return _employee.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee.
	*
	* @param primaryKey the primary key of this employee
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employee.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee ID of this employee.
	*
	* @return the employee ID of this employee
	*/
	@Override
	public long getEmployeeId() {
		return _employee.getEmployeeId();
	}

	/**
	* Sets the employee ID of this employee.
	*
	* @param employeeId the employee ID of this employee
	*/
	@Override
	public void setEmployeeId(long employeeId) {
		_employee.setEmployeeId(employeeId);
	}

	/**
	* Returns the employee name of this employee.
	*
	* @return the employee name of this employee
	*/
	@Override
	public java.lang.String getEmployeeName() {
		return _employee.getEmployeeName();
	}

	/**
	* Sets the employee name of this employee.
	*
	* @param employeeName the employee name of this employee
	*/
	@Override
	public void setEmployeeName(java.lang.String employeeName) {
		_employee.setEmployeeName(employeeName);
	}

	/**
	* Returns the employee designation of this employee.
	*
	* @return the employee designation of this employee
	*/
	@Override
	public java.lang.String getEmployeeDesignation() {
		return _employee.getEmployeeDesignation();
	}

	/**
	* Sets the employee designation of this employee.
	*
	* @param employeeDesignation the employee designation of this employee
	*/
	@Override
	public void setEmployeeDesignation(java.lang.String employeeDesignation) {
		_employee.setEmployeeDesignation(employeeDesignation);
	}

	@Override
	public boolean isNew() {
		return _employee.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employee.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employee.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employee.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employee.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employee.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employee.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employee.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employee.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employee.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employee.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeWrapper((Employee)_employee.clone());
	}

	@Override
	public int compareTo(com.meera.db.model.Employee employee) {
		return _employee.compareTo(employee);
	}

	@Override
	public int hashCode() {
		return _employee.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.meera.db.model.Employee> toCacheModel() {
		return _employee.toCacheModel();
	}

	@Override
	public com.meera.db.model.Employee toEscapedModel() {
		return new EmployeeWrapper(_employee.toEscapedModel());
	}

	@Override
	public com.meera.db.model.Employee toUnescapedModel() {
		return new EmployeeWrapper(_employee.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employee.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employee.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employee.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeWrapper)) {
			return false;
		}

		EmployeeWrapper employeeWrapper = (EmployeeWrapper)obj;

		if (Validator.equals(_employee, employeeWrapper._employee)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Employee getWrappedEmployee() {
		return _employee;
	}

	@Override
	public Employee getWrappedModel() {
		return _employee;
	}

	@Override
	public void resetOriginalValues() {
		_employee.resetOriginalValues();
	}

	private Employee _employee;
}