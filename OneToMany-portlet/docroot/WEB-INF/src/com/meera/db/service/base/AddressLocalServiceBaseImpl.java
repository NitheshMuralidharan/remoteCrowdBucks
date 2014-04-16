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

package com.meera.db.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.meera.db.model.Address;
import com.meera.db.service.AddressLocalService;
import com.meera.db.service.persistence.AddressPersistence;
import com.meera.db.service.persistence.EmployeePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the address local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.meera.db.service.impl.AddressLocalServiceImpl}.
 * </p>
 *
 * @author E5410
 * @see com.meera.db.service.impl.AddressLocalServiceImpl
 * @see com.meera.db.service.AddressLocalServiceUtil
 * @generated
 */
public abstract class AddressLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements AddressLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.meera.db.service.AddressLocalServiceUtil} to access the address local service.
	 */

	/**
	 * Adds the address to the database. Also notifies the appropriate model listeners.
	 *
	 * @param address the address
	 * @return the address that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Address addAddress(Address address) throws SystemException {
		address.setNew(true);

		return addressPersistence.update(address);
	}

	/**
	 * Creates a new address with the primary key. Does not add the address to the database.
	 *
	 * @param addressId the primary key for the new address
	 * @return the new address
	 */
	@Override
	public Address createAddress(long addressId) {
		return addressPersistence.create(addressId);
	}

	/**
	 * Deletes the address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addressId the primary key of the address
	 * @return the address that was removed
	 * @throws PortalException if a address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Address deleteAddress(long addressId)
		throws PortalException, SystemException {
		return addressPersistence.remove(addressId);
	}

	/**
	 * Deletes the address from the database. Also notifies the appropriate model listeners.
	 *
	 * @param address the address
	 * @return the address that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Address deleteAddress(Address address) throws SystemException {
		return addressPersistence.remove(address);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Address.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return addressPersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return addressPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return addressPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return addressPersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return addressPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public Address fetchAddress(long addressId) throws SystemException {
		return addressPersistence.fetchByPrimaryKey(addressId);
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
	public Address getAddress(long addressId)
		throws PortalException, SystemException {
		return addressPersistence.findByPrimaryKey(addressId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return addressPersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<Address> getAddresses(int start, int end)
		throws SystemException {
		return addressPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of addresses.
	 *
	 * @return the number of addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getAddressesCount() throws SystemException {
		return addressPersistence.countAll();
	}

	/**
	 * Updates the address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param address the address
	 * @return the address that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Address updateAddress(Address address) throws SystemException {
		return addressPersistence.update(address);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEmployeeAddress(long employeeId, long addressId)
		throws SystemException {
		employeePersistence.addAddress(employeeId, addressId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEmployeeAddress(long employeeId, Address address)
		throws SystemException {
		employeePersistence.addAddress(employeeId, address);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEmployeeAddresses(long employeeId, long[] addressIds)
		throws SystemException {
		employeePersistence.addAddresses(employeeId, addressIds);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEmployeeAddresses(long employeeId, List<Address> Addresses)
		throws SystemException {
		employeePersistence.addAddresses(employeeId, Addresses);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearEmployeeAddresses(long employeeId)
		throws SystemException {
		employeePersistence.clearAddresses(employeeId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deleteEmployeeAddress(long employeeId, long addressId)
		throws SystemException {
		employeePersistence.removeAddress(employeeId, addressId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deleteEmployeeAddress(long employeeId, Address address)
		throws SystemException {
		employeePersistence.removeAddress(employeeId, address);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deleteEmployeeAddresses(long employeeId, long[] addressIds)
		throws SystemException {
		employeePersistence.removeAddresses(employeeId, addressIds);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deleteEmployeeAddresses(long employeeId, List<Address> Addresses)
		throws SystemException {
		employeePersistence.removeAddresses(employeeId, Addresses);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Address> getEmployeeAddresses(long employeeId)
		throws SystemException {
		return employeePersistence.getAddresses(employeeId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Address> getEmployeeAddresses(long employeeId, int start,
		int end) throws SystemException {
		return employeePersistence.getAddresses(employeeId, start, end);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Address> getEmployeeAddresses(long employeeId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		return employeePersistence.getAddresses(employeeId, start, end,
			orderByComparator);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getEmployeeAddressesCount(long employeeId)
		throws SystemException {
		return employeePersistence.getAddressesSize(employeeId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean hasEmployeeAddress(long employeeId, long addressId)
		throws SystemException {
		return employeePersistence.containsAddress(employeeId, addressId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean hasEmployeeAddresses(long employeeId)
		throws SystemException {
		return employeePersistence.containsAddresses(employeeId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setEmployeeAddresses(long employeeId, long[] addressIds)
		throws SystemException {
		employeePersistence.setAddresses(employeeId, addressIds);
	}

	/**
	 * Returns the address local service.
	 *
	 * @return the address local service
	 */
	public com.meera.db.service.AddressLocalService getAddressLocalService() {
		return addressLocalService;
	}

	/**
	 * Sets the address local service.
	 *
	 * @param addressLocalService the address local service
	 */
	public void setAddressLocalService(
		com.meera.db.service.AddressLocalService addressLocalService) {
		this.addressLocalService = addressLocalService;
	}

	/**
	 * Returns the address remote service.
	 *
	 * @return the address remote service
	 */
	public com.meera.db.service.AddressService getAddressService() {
		return addressService;
	}

	/**
	 * Sets the address remote service.
	 *
	 * @param addressService the address remote service
	 */
	public void setAddressService(
		com.meera.db.service.AddressService addressService) {
		this.addressService = addressService;
	}

	/**
	 * Returns the address persistence.
	 *
	 * @return the address persistence
	 */
	public AddressPersistence getAddressPersistence() {
		return addressPersistence;
	}

	/**
	 * Sets the address persistence.
	 *
	 * @param addressPersistence the address persistence
	 */
	public void setAddressPersistence(AddressPersistence addressPersistence) {
		this.addressPersistence = addressPersistence;
	}

	/**
	 * Returns the employee local service.
	 *
	 * @return the employee local service
	 */
	public com.meera.db.service.EmployeeLocalService getEmployeeLocalService() {
		return employeeLocalService;
	}

	/**
	 * Sets the employee local service.
	 *
	 * @param employeeLocalService the employee local service
	 */
	public void setEmployeeLocalService(
		com.meera.db.service.EmployeeLocalService employeeLocalService) {
		this.employeeLocalService = employeeLocalService;
	}

	/**
	 * Returns the employee remote service.
	 *
	 * @return the employee remote service
	 */
	public com.meera.db.service.EmployeeService getEmployeeService() {
		return employeeService;
	}

	/**
	 * Sets the employee remote service.
	 *
	 * @param employeeService the employee remote service
	 */
	public void setEmployeeService(
		com.meera.db.service.EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	/**
	 * Returns the employee persistence.
	 *
	 * @return the employee persistence
	 */
	public EmployeePersistence getEmployeePersistence() {
		return employeePersistence;
	}

	/**
	 * Sets the employee persistence.
	 *
	 * @param employeePersistence the employee persistence
	 */
	public void setEmployeePersistence(EmployeePersistence employeePersistence) {
		this.employeePersistence = employeePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.meera.db.model.Address",
			addressLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.meera.db.model.Address");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Address.class;
	}

	protected String getModelClassName() {
		return Address.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = addressPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.meera.db.service.AddressLocalService.class)
	protected com.meera.db.service.AddressLocalService addressLocalService;
	@BeanReference(type = com.meera.db.service.AddressService.class)
	protected com.meera.db.service.AddressService addressService;
	@BeanReference(type = AddressPersistence.class)
	protected AddressPersistence addressPersistence;
	@BeanReference(type = com.meera.db.service.EmployeeLocalService.class)
	protected com.meera.db.service.EmployeeLocalService employeeLocalService;
	@BeanReference(type = com.meera.db.service.EmployeeService.class)
	protected com.meera.db.service.EmployeeService employeeService;
	@BeanReference(type = EmployeePersistence.class)
	protected EmployeePersistence employeePersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private AddressLocalServiceClpInvoker _clpInvoker = new AddressLocalServiceClpInvoker();
}