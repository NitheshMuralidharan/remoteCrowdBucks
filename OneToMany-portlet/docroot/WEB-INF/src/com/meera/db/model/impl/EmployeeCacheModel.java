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

package com.meera.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.meera.db.model.Employee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author E5410
 * @see Employee
 * @generated
 */
public class EmployeeCacheModel implements CacheModel<Employee>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{employeeId=");
		sb.append(employeeId);
		sb.append(", employeeName=");
		sb.append(employeeName);
		sb.append(", employeeDesignation=");
		sb.append(employeeDesignation);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Employee toEntityModel() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setEmployeeId(employeeId);

		if (employeeName == null) {
			employeeImpl.setEmployeeName(StringPool.BLANK);
		}
		else {
			employeeImpl.setEmployeeName(employeeName);
		}

		if (employeeDesignation == null) {
			employeeImpl.setEmployeeDesignation(StringPool.BLANK);
		}
		else {
			employeeImpl.setEmployeeDesignation(employeeDesignation);
		}

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeId = objectInput.readLong();
		employeeName = objectInput.readUTF();
		employeeDesignation = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(employeeId);

		if (employeeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeName);
		}

		if (employeeDesignation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeDesignation);
		}
	}

	public long employeeId;
	public String employeeName;
	public String employeeDesignation;
}