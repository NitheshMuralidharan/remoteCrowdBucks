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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Address service. Represents a row in the &quot;TEST_Address&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.meera.db.model.impl.AddressModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.meera.db.model.impl.AddressImpl}.
 * </p>
 *
 * @author E5410
 * @see Address
 * @see com.meera.db.model.impl.AddressImpl
 * @see com.meera.db.model.impl.AddressModelImpl
 * @generated
 */
public interface AddressModel extends BaseModel<Address> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a address model instance should use the {@link Address} interface instead.
	 */

	/**
	 * Returns the primary key of this address.
	 *
	 * @return the primary key of this address
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this address.
	 *
	 * @param primaryKey the primary key of this address
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the address ID of this address.
	 *
	 * @return the address ID of this address
	 */
	public long getAddressId();

	/**
	 * Sets the address ID of this address.
	 *
	 * @param addressId the address ID of this address
	 */
	public void setAddressId(long addressId);

	/**
	 * Returns the street1 of this address.
	 *
	 * @return the street1 of this address
	 */
	@AutoEscape
	public String getStreet1();

	/**
	 * Sets the street1 of this address.
	 *
	 * @param street1 the street1 of this address
	 */
	public void setStreet1(String street1);

	/**
	 * Returns the street2 of this address.
	 *
	 * @return the street2 of this address
	 */
	@AutoEscape
	public String getStreet2();

	/**
	 * Sets the street2 of this address.
	 *
	 * @param street2 the street2 of this address
	 */
	public void setStreet2(String street2);

	/**
	 * Returns the city of this address.
	 *
	 * @return the city of this address
	 */
	@AutoEscape
	public String getCity();

	/**
	 * Sets the city of this address.
	 *
	 * @param city the city of this address
	 */
	public void setCity(String city);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Address address);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Address> toCacheModel();

	@Override
	public Address toEscapedModel();

	@Override
	public Address toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}