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

package com.meera.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.meera.db.model.Address;

import java.util.List;

/**
 * The persistence utility for the address service. This utility wraps {@link AddressPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author E5410
 * @see AddressPersistence
 * @see AddressPersistenceImpl
 * @generated
 */
public class AddressUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Address address) {
		getPersistence().clearCache(address);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Address> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Address> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Address> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Address update(Address address) throws SystemException {
		return getPersistence().update(address);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Address update(Address address, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(address, serviceContext);
	}

	/**
	* Returns all the addresses where city = &#63;.
	*
	* @param city the city
	* @return the matching addresses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Address> findBycity(
		java.lang.String city)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycity(city);
	}

	/**
	* Returns a range of all the addresses where city = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param city the city
	* @param start the lower bound of the range of addresses
	* @param end the upper bound of the range of addresses (not inclusive)
	* @return the range of matching addresses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Address> findBycity(
		java.lang.String city, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycity(city, start, end);
	}

	/**
	* Returns an ordered range of all the addresses where city = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param city the city
	* @param start the lower bound of the range of addresses
	* @param end the upper bound of the range of addresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching addresses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Address> findBycity(
		java.lang.String city, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycity(city, start, end, orderByComparator);
	}

	/**
	* Returns the first address in the ordered set where city = &#63;.
	*
	* @param city the city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching address
	* @throws com.meera.db.NoSuchAddressException if a matching address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Address findBycity_First(
		java.lang.String city,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchAddressException {
		return getPersistence().findBycity_First(city, orderByComparator);
	}

	/**
	* Returns the first address in the ordered set where city = &#63;.
	*
	* @param city the city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching address, or <code>null</code> if a matching address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Address fetchBycity_First(
		java.lang.String city,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBycity_First(city, orderByComparator);
	}

	/**
	* Returns the last address in the ordered set where city = &#63;.
	*
	* @param city the city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching address
	* @throws com.meera.db.NoSuchAddressException if a matching address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Address findBycity_Last(
		java.lang.String city,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchAddressException {
		return getPersistence().findBycity_Last(city, orderByComparator);
	}

	/**
	* Returns the last address in the ordered set where city = &#63;.
	*
	* @param city the city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching address, or <code>null</code> if a matching address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Address fetchBycity_Last(
		java.lang.String city,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBycity_Last(city, orderByComparator);
	}

	/**
	* Returns the addresses before and after the current address in the ordered set where city = &#63;.
	*
	* @param addressId the primary key of the current address
	* @param city the city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next address
	* @throws com.meera.db.NoSuchAddressException if a address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Address[] findBycity_PrevAndNext(
		long addressId, java.lang.String city,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchAddressException {
		return getPersistence()
				   .findBycity_PrevAndNext(addressId, city, orderByComparator);
	}

	/**
	* Removes all the addresses where city = &#63; from the database.
	*
	* @param city the city
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBycity(java.lang.String city)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBycity(city);
	}

	/**
	* Returns the number of addresses where city = &#63;.
	*
	* @param city the city
	* @return the number of matching addresses
	* @throws SystemException if a system exception occurred
	*/
	public static int countBycity(java.lang.String city)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBycity(city);
	}

	/**
	* Caches the address in the entity cache if it is enabled.
	*
	* @param address the address
	*/
	public static void cacheResult(com.meera.db.model.Address address) {
		getPersistence().cacheResult(address);
	}

	/**
	* Caches the addresses in the entity cache if it is enabled.
	*
	* @param addresses the addresses
	*/
	public static void cacheResult(
		java.util.List<com.meera.db.model.Address> addresses) {
		getPersistence().cacheResult(addresses);
	}

	/**
	* Creates a new address with the primary key. Does not add the address to the database.
	*
	* @param addressId the primary key for the new address
	* @return the new address
	*/
	public static com.meera.db.model.Address create(long addressId) {
		return getPersistence().create(addressId);
	}

	/**
	* Removes the address with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param addressId the primary key of the address
	* @return the address that was removed
	* @throws com.meera.db.NoSuchAddressException if a address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Address remove(long addressId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchAddressException {
		return getPersistence().remove(addressId);
	}

	public static com.meera.db.model.Address updateImpl(
		com.meera.db.model.Address address)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(address);
	}

	/**
	* Returns the address with the primary key or throws a {@link com.meera.db.NoSuchAddressException} if it could not be found.
	*
	* @param addressId the primary key of the address
	* @return the address
	* @throws com.meera.db.NoSuchAddressException if a address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Address findByPrimaryKey(long addressId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchAddressException {
		return getPersistence().findByPrimaryKey(addressId);
	}

	/**
	* Returns the address with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param addressId the primary key of the address
	* @return the address, or <code>null</code> if a address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Address fetchByPrimaryKey(long addressId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(addressId);
	}

	/**
	* Returns all the addresses.
	*
	* @return the addresses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Address> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.meera.db.model.Address> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the addresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of addresses
	* @param end the upper bound of the range of addresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of addresses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Address> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the addresses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of addresses.
	*
	* @return the number of addresses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the employees associated with the address.
	*
	* @param pk the primary key of the address
	* @return the employees associated with the address
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Employee> getEmployees(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getEmployees(pk);
	}

	/**
	* Returns a range of all the employees associated with the address.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the address
	* @param start the lower bound of the range of addresses
	* @param end the upper bound of the range of addresses (not inclusive)
	* @return the range of employees associated with the address
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Employee> getEmployees(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getEmployees(pk, start, end);
	}

	/**
	* Returns an ordered range of all the employees associated with the address.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the address
	* @param start the lower bound of the range of addresses
	* @param end the upper bound of the range of addresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employees associated with the address
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Employee> getEmployees(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getEmployees(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of employees associated with the address.
	*
	* @param pk the primary key of the address
	* @return the number of employees associated with the address
	* @throws SystemException if a system exception occurred
	*/
	public static int getEmployeesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getEmployeesSize(pk);
	}

	/**
	* Returns <code>true</code> if the employee is associated with the address.
	*
	* @param pk the primary key of the address
	* @param employeePK the primary key of the employee
	* @return <code>true</code> if the employee is associated with the address; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsEmployee(long pk, long employeePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsEmployee(pk, employeePK);
	}

	/**
	* Returns <code>true</code> if the address has any employees associated with it.
	*
	* @param pk the primary key of the address to check for associations with employees
	* @return <code>true</code> if the address has any employees associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsEmployees(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsEmployees(pk);
	}

	/**
	* Adds an association between the address and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employeePK the primary key of the employee
	* @throws SystemException if a system exception occurred
	*/
	public static void addEmployee(long pk, long employeePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addEmployee(pk, employeePK);
	}

	/**
	* Adds an association between the address and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employee the employee
	* @throws SystemException if a system exception occurred
	*/
	public static void addEmployee(long pk, com.meera.db.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addEmployee(pk, employee);
	}

	/**
	* Adds an association between the address and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employeePKs the primary keys of the employees
	* @throws SystemException if a system exception occurred
	*/
	public static void addEmployees(long pk, long[] employeePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addEmployees(pk, employeePKs);
	}

	/**
	* Adds an association between the address and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employees the employees
	* @throws SystemException if a system exception occurred
	*/
	public static void addEmployees(long pk,
		java.util.List<com.meera.db.model.Employee> employees)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addEmployees(pk, employees);
	}

	/**
	* Clears all associations between the address and its employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address to clear the associated employees from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearEmployees(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearEmployees(pk);
	}

	/**
	* Removes the association between the address and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employeePK the primary key of the employee
	* @throws SystemException if a system exception occurred
	*/
	public static void removeEmployee(long pk, long employeePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeEmployee(pk, employeePK);
	}

	/**
	* Removes the association between the address and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employee the employee
	* @throws SystemException if a system exception occurred
	*/
	public static void removeEmployee(long pk,
		com.meera.db.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeEmployee(pk, employee);
	}

	/**
	* Removes the association between the address and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employeePKs the primary keys of the employees
	* @throws SystemException if a system exception occurred
	*/
	public static void removeEmployees(long pk, long[] employeePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeEmployees(pk, employeePKs);
	}

	/**
	* Removes the association between the address and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employees the employees
	* @throws SystemException if a system exception occurred
	*/
	public static void removeEmployees(long pk,
		java.util.List<com.meera.db.model.Employee> employees)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeEmployees(pk, employees);
	}

	/**
	* Sets the employees associated with the address, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employeePKs the primary keys of the employees to be associated with the address
	* @throws SystemException if a system exception occurred
	*/
	public static void setEmployees(long pk, long[] employeePKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setEmployees(pk, employeePKs);
	}

	/**
	* Sets the employees associated with the address, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employees the employees to be associated with the address
	* @throws SystemException if a system exception occurred
	*/
	public static void setEmployees(long pk,
		java.util.List<com.meera.db.model.Employee> employees)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setEmployees(pk, employees);
	}

	public static AddressPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AddressPersistence)PortletBeanLocatorUtil.locate(com.meera.db.service.ClpSerializer.getServletContextName(),
					AddressPersistence.class.getName());

			ReferenceRegistry.registerReference(AddressUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AddressPersistence persistence) {
	}

	private static AddressPersistence _persistence;
}