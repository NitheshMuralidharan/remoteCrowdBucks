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

import com.meera.db.model.Address;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Address in entity cache.
 *
 * @author E5410
 * @see Address
 * @generated
 */
public class AddressCacheModel implements CacheModel<Address>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{addressId=");
		sb.append(addressId);
		sb.append(", street1=");
		sb.append(street1);
		sb.append(", street2=");
		sb.append(street2);
		sb.append(", city=");
		sb.append(city);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Address toEntityModel() {
		AddressImpl addressImpl = new AddressImpl();

		addressImpl.setAddressId(addressId);

		if (street1 == null) {
			addressImpl.setStreet1(StringPool.BLANK);
		}
		else {
			addressImpl.setStreet1(street1);
		}

		if (street2 == null) {
			addressImpl.setStreet2(StringPool.BLANK);
		}
		else {
			addressImpl.setStreet2(street2);
		}

		if (city == null) {
			addressImpl.setCity(StringPool.BLANK);
		}
		else {
			addressImpl.setCity(city);
		}

		addressImpl.resetOriginalValues();

		return addressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addressId = objectInput.readLong();
		street1 = objectInput.readUTF();
		street2 = objectInput.readUTF();
		city = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(addressId);

		if (street1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(street1);
		}

		if (street2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(street2);
		}

		if (city == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(city);
		}
	}

	public long addressId;
	public String street1;
	public String street2;
	public String city;
}