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

package com.meera.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddressLocalService}.
 *
 * @author E5410
 * @see AddressLocalService
 * @generated
 */
public class AddressLocalServiceWrapper implements AddressLocalService,
	ServiceWrapper<AddressLocalService> {
	public AddressLocalServiceWrapper(AddressLocalService addressLocalService) {
		_addressLocalService = addressLocalService;
	}

	/**
	* Adds the address to the database. Also notifies the appropriate model listeners.
	*
	* @param address the address
	* @return the address that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.meera.db.model.Address addAddress(
		com.meera.db.model.Address address)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.addAddress(address);
	}

	/**
	* Creates a new address with the primary key. Does not add the address to the database.
	*
	* @param addressId the primary key for the new address
	* @return the new address
	*/
	@Override
	public com.meera.db.model.Address createAddress(long addressId) {
		return _addressLocalService.createAddress(addressId);
	}

	/**
	* Deletes the address with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param addressId the primary key of the address
	* @return the address that was removed
	* @throws PortalException if a address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.meera.db.model.Address deleteAddress(long addressId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.deleteAddress(addressId);
	}

	/**
	* Deletes the address from the database. Also notifies the appropriate model listeners.
	*
	* @param address the address
	* @return the address that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.meera.db.model.Address deleteAddress(
		com.meera.db.model.Address address)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.deleteAddress(address);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addressLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.meera.db.model.Address fetchAddress(long addressId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.fetchAddress(addressId);
	}

	/**
	* Returns the address with the primary key.
	*
	* @param addressId the primary key of the address
	* @return the address
	* @throws PortalException if a address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.meera.db.model.Address getAddress(long addressId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.getAddress(addressId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of addresses
	* @param end the upper bound of the range of addresses (not inclusive)
	* @return the range of addresses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.meera.db.model.Address> getAddresses(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.getAddresses(start, end);
	}

	/**
	* Returns the number of addresses.
	*
	* @return the number of addresses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAddressesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.getAddressesCount();
	}

	/**
	* Updates the address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param address the address
	* @return the address that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.meera.db.model.Address updateAddress(
		com.meera.db.model.Address address)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.updateAddress(address);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addEmployeeAddress(long employeeId, long addressId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_addressLocalService.addEmployeeAddress(employeeId, addressId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addEmployeeAddress(long employeeId,
		com.meera.db.model.Address address)
		throws com.liferay.portal.kernel.exception.SystemException {
		_addressLocalService.addEmployeeAddress(employeeId, address);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addEmployeeAddresses(long employeeId, long[] addressIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_addressLocalService.addEmployeeAddresses(employeeId, addressIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addEmployeeAddresses(long employeeId,
		java.util.List<com.meera.db.model.Address> Addresses)
		throws com.liferay.portal.kernel.exception.SystemException {
		_addressLocalService.addEmployeeAddresses(employeeId, Addresses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearEmployeeAddresses(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_addressLocalService.clearEmployeeAddresses(employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteEmployeeAddress(long employeeId, long addressId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_addressLocalService.deleteEmployeeAddress(employeeId, addressId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteEmployeeAddress(long employeeId,
		com.meera.db.model.Address address)
		throws com.liferay.portal.kernel.exception.SystemException {
		_addressLocalService.deleteEmployeeAddress(employeeId, address);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteEmployeeAddresses(long employeeId, long[] addressIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_addressLocalService.deleteEmployeeAddresses(employeeId, addressIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteEmployeeAddresses(long employeeId,
		java.util.List<com.meera.db.model.Address> Addresses)
		throws com.liferay.portal.kernel.exception.SystemException {
		_addressLocalService.deleteEmployeeAddresses(employeeId, Addresses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.meera.db.model.Address> getEmployeeAddresses(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.getEmployeeAddresses(employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.meera.db.model.Address> getEmployeeAddresses(
		long employeeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.getEmployeeAddresses(employeeId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.meera.db.model.Address> getEmployeeAddresses(
		long employeeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.getEmployeeAddresses(employeeId, start,
			end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEmployeeAddressesCount(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.getEmployeeAddressesCount(employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasEmployeeAddress(long employeeId, long addressId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.hasEmployeeAddress(employeeId, addressId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasEmployeeAddresses(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _addressLocalService.hasEmployeeAddresses(employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setEmployeeAddresses(long employeeId, long[] addressIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_addressLocalService.setEmployeeAddresses(employeeId, addressIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _addressLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_addressLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _addressLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AddressLocalService getWrappedAddressLocalService() {
		return _addressLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAddressLocalService(
		AddressLocalService addressLocalService) {
		_addressLocalService = addressLocalService;
	}

	@Override
	public AddressLocalService getWrappedService() {
		return _addressLocalService;
	}

	@Override
	public void setWrappedService(AddressLocalService addressLocalService) {
		_addressLocalService = addressLocalService;
	}

	private AddressLocalService _addressLocalService;
}