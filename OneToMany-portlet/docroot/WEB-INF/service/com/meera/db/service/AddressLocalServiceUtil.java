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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Address. This utility wraps
 * {@link com.meera.db.service.impl.AddressLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author E5410
 * @see AddressLocalService
 * @see com.meera.db.service.base.AddressLocalServiceBaseImpl
 * @see com.meera.db.service.impl.AddressLocalServiceImpl
 * @generated
 */
public class AddressLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.meera.db.service.impl.AddressLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the address to the database. Also notifies the appropriate model listeners.
	*
	* @param address the address
	* @return the address that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Address addAddress(
		com.meera.db.model.Address address)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAddress(address);
	}

	/**
	* Creates a new address with the primary key. Does not add the address to the database.
	*
	* @param addressId the primary key for the new address
	* @return the new address
	*/
	public static com.meera.db.model.Address createAddress(long addressId) {
		return getService().createAddress(addressId);
	}

	/**
	* Deletes the address with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param addressId the primary key of the address
	* @return the address that was removed
	* @throws PortalException if a address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Address deleteAddress(long addressId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAddress(addressId);
	}

	/**
	* Deletes the address from the database. Also notifies the appropriate model listeners.
	*
	* @param address the address
	* @return the address that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Address deleteAddress(
		com.meera.db.model.Address address)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAddress(address);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.meera.db.model.Address fetchAddress(long addressId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAddress(addressId);
	}

	/**
	* Returns the address with the primary key.
	*
	* @param addressId the primary key of the address
	* @return the address
	* @throws PortalException if a address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Address getAddress(long addressId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAddress(addressId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.meera.db.model.Address> getAddresses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAddresses(start, end);
	}

	/**
	* Returns the number of addresses.
	*
	* @return the number of addresses
	* @throws SystemException if a system exception occurred
	*/
	public static int getAddressesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAddressesCount();
	}

	/**
	* Updates the address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param address the address
	* @return the address that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Address updateAddress(
		com.meera.db.model.Address address)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAddress(address);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addEmployeeAddress(long employeeId, long addressId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addEmployeeAddress(employeeId, addressId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addEmployeeAddress(long employeeId,
		com.meera.db.model.Address address)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addEmployeeAddress(employeeId, address);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addEmployeeAddresses(long employeeId, long[] addressIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addEmployeeAddresses(employeeId, addressIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addEmployeeAddresses(long employeeId,
		java.util.List<com.meera.db.model.Address> Addresses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addEmployeeAddresses(employeeId, Addresses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearEmployeeAddresses(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearEmployeeAddresses(employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteEmployeeAddress(long employeeId, long addressId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteEmployeeAddress(employeeId, addressId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteEmployeeAddress(long employeeId,
		com.meera.db.model.Address address)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteEmployeeAddress(employeeId, address);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteEmployeeAddresses(long employeeId,
		long[] addressIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteEmployeeAddresses(employeeId, addressIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteEmployeeAddresses(long employeeId,
		java.util.List<com.meera.db.model.Address> Addresses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteEmployeeAddresses(employeeId, Addresses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Address> getEmployeeAddresses(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeAddresses(employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Address> getEmployeeAddresses(
		long employeeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeAddresses(employeeId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Address> getEmployeeAddresses(
		long employeeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getEmployeeAddresses(employeeId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getEmployeeAddressesCount(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEmployeeAddressesCount(employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasEmployeeAddress(long employeeId, long addressId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasEmployeeAddress(employeeId, addressId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasEmployeeAddresses(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasEmployeeAddresses(employeeId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setEmployeeAddresses(long employeeId, long[] addressIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setEmployeeAddresses(employeeId, addressIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static AddressLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AddressLocalService.class.getName());

			if (invokableLocalService instanceof AddressLocalService) {
				_service = (AddressLocalService)invokableLocalService;
			}
			else {
				_service = new AddressLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AddressLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(AddressLocalService service) {
	}

	private static AddressLocalService _service;
}