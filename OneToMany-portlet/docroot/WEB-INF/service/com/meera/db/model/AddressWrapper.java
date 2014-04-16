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
 * This class is a wrapper for {@link Address}.
 * </p>
 *
 * @author E5410
 * @see Address
 * @generated
 */
public class AddressWrapper implements Address, ModelWrapper<Address> {
	public AddressWrapper(Address address) {
		_address = address;
	}

	@Override
	public Class<?> getModelClass() {
		return Address.class;
	}

	@Override
	public String getModelClassName() {
		return Address.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("addressId", getAddressId());
		attributes.put("street1", getStreet1());
		attributes.put("street2", getStreet2());
		attributes.put("city", getCity());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addressId = (Long)attributes.get("addressId");

		if (addressId != null) {
			setAddressId(addressId);
		}

		String street1 = (String)attributes.get("street1");

		if (street1 != null) {
			setStreet1(street1);
		}

		String street2 = (String)attributes.get("street2");

		if (street2 != null) {
			setStreet2(street2);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}
	}

	/**
	* Returns the primary key of this address.
	*
	* @return the primary key of this address
	*/
	@Override
	public long getPrimaryKey() {
		return _address.getPrimaryKey();
	}

	/**
	* Sets the primary key of this address.
	*
	* @param primaryKey the primary key of this address
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_address.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the address ID of this address.
	*
	* @return the address ID of this address
	*/
	@Override
	public long getAddressId() {
		return _address.getAddressId();
	}

	/**
	* Sets the address ID of this address.
	*
	* @param addressId the address ID of this address
	*/
	@Override
	public void setAddressId(long addressId) {
		_address.setAddressId(addressId);
	}

	/**
	* Returns the street1 of this address.
	*
	* @return the street1 of this address
	*/
	@Override
	public java.lang.String getStreet1() {
		return _address.getStreet1();
	}

	/**
	* Sets the street1 of this address.
	*
	* @param street1 the street1 of this address
	*/
	@Override
	public void setStreet1(java.lang.String street1) {
		_address.setStreet1(street1);
	}

	/**
	* Returns the street2 of this address.
	*
	* @return the street2 of this address
	*/
	@Override
	public java.lang.String getStreet2() {
		return _address.getStreet2();
	}

	/**
	* Sets the street2 of this address.
	*
	* @param street2 the street2 of this address
	*/
	@Override
	public void setStreet2(java.lang.String street2) {
		_address.setStreet2(street2);
	}

	/**
	* Returns the city of this address.
	*
	* @return the city of this address
	*/
	@Override
	public java.lang.String getCity() {
		return _address.getCity();
	}

	/**
	* Sets the city of this address.
	*
	* @param city the city of this address
	*/
	@Override
	public void setCity(java.lang.String city) {
		_address.setCity(city);
	}

	@Override
	public boolean isNew() {
		return _address.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_address.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _address.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_address.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _address.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _address.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_address.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _address.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_address.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_address.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_address.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AddressWrapper((Address)_address.clone());
	}

	@Override
	public int compareTo(com.meera.db.model.Address address) {
		return _address.compareTo(address);
	}

	@Override
	public int hashCode() {
		return _address.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.meera.db.model.Address> toCacheModel() {
		return _address.toCacheModel();
	}

	@Override
	public com.meera.db.model.Address toEscapedModel() {
		return new AddressWrapper(_address.toEscapedModel());
	}

	@Override
	public com.meera.db.model.Address toUnescapedModel() {
		return new AddressWrapper(_address.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _address.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _address.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_address.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AddressWrapper)) {
			return false;
		}

		AddressWrapper addressWrapper = (AddressWrapper)obj;

		if (Validator.equals(_address, addressWrapper._address)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Address getWrappedAddress() {
		return _address;
	}

	@Override
	public Address getWrappedModel() {
		return _address;
	}

	@Override
	public void resetOriginalValues() {
		_address.resetOriginalValues();
	}

	private Address _address;
}