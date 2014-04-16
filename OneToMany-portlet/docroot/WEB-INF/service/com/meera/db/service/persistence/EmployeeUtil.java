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

import com.meera.db.model.Employee;

import java.util.List;

/**
 * The persistence utility for the employee service. This utility wraps {@link EmployeePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author E5410
 * @see EmployeePersistence
 * @see EmployeePersistenceImpl
 * @generated
 */
public class EmployeeUtil {
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
	public static void clearCache(Employee employee) {
		getPersistence().clearCache(employee);
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
	public static List<Employee> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Employee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Employee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Employee update(Employee employee) throws SystemException {
		return getPersistence().update(employee);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Employee update(Employee employee,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(employee, serviceContext);
	}

	/**
	* Returns all the employees where employeeName = &#63;.
	*
	* @param employeeName the employee name
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Employee> findByemployeeName(
		java.lang.String employeeName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByemployeeName(employeeName);
	}

	/**
	* Returns a range of all the employees where employeeName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param employeeName the employee name
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Employee> findByemployeeName(
		java.lang.String employeeName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByemployeeName(employeeName, start, end);
	}

	/**
	* Returns an ordered range of all the employees where employeeName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param employeeName the employee name
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Employee> findByemployeeName(
		java.lang.String employeeName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByemployeeName(employeeName, start, end,
			orderByComparator);
	}

	/**
	* Returns the first employee in the ordered set where employeeName = &#63;.
	*
	* @param employeeName the employee name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee
	* @throws com.meera.db.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Employee findByemployeeName_First(
		java.lang.String employeeName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchEmployeeException {
		return getPersistence()
				   .findByemployeeName_First(employeeName, orderByComparator);
	}

	/**
	* Returns the first employee in the ordered set where employeeName = &#63;.
	*
	* @param employeeName the employee name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Employee fetchByemployeeName_First(
		java.lang.String employeeName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByemployeeName_First(employeeName, orderByComparator);
	}

	/**
	* Returns the last employee in the ordered set where employeeName = &#63;.
	*
	* @param employeeName the employee name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee
	* @throws com.meera.db.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Employee findByemployeeName_Last(
		java.lang.String employeeName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchEmployeeException {
		return getPersistence()
				   .findByemployeeName_Last(employeeName, orderByComparator);
	}

	/**
	* Returns the last employee in the ordered set where employeeName = &#63;.
	*
	* @param employeeName the employee name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Employee fetchByemployeeName_Last(
		java.lang.String employeeName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByemployeeName_Last(employeeName, orderByComparator);
	}

	/**
	* Returns the employees before and after the current employee in the ordered set where employeeName = &#63;.
	*
	* @param employeeId the primary key of the current employee
	* @param employeeName the employee name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee
	* @throws com.meera.db.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Employee[] findByemployeeName_PrevAndNext(
		long employeeId, java.lang.String employeeName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchEmployeeException {
		return getPersistence()
				   .findByemployeeName_PrevAndNext(employeeId, employeeName,
			orderByComparator);
	}

	/**
	* Removes all the employees where employeeName = &#63; from the database.
	*
	* @param employeeName the employee name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByemployeeName(java.lang.String employeeName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByemployeeName(employeeName);
	}

	/**
	* Returns the number of employees where employeeName = &#63;.
	*
	* @param employeeName the employee name
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByemployeeName(java.lang.String employeeName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByemployeeName(employeeName);
	}

	/**
	* Caches the employee in the entity cache if it is enabled.
	*
	* @param employee the employee
	*/
	public static void cacheResult(com.meera.db.model.Employee employee) {
		getPersistence().cacheResult(employee);
	}

	/**
	* Caches the employees in the entity cache if it is enabled.
	*
	* @param employees the employees
	*/
	public static void cacheResult(
		java.util.List<com.meera.db.model.Employee> employees) {
		getPersistence().cacheResult(employees);
	}

	/**
	* Creates a new employee with the primary key. Does not add the employee to the database.
	*
	* @param employeeId the primary key for the new employee
	* @return the new employee
	*/
	public static com.meera.db.model.Employee create(long employeeId) {
		return getPersistence().create(employeeId);
	}

	/**
	* Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeId the primary key of the employee
	* @return the employee that was removed
	* @throws com.meera.db.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Employee remove(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchEmployeeException {
		return getPersistence().remove(employeeId);
	}

	public static com.meera.db.model.Employee updateImpl(
		com.meera.db.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(employee);
	}

	/**
	* Returns the employee with the primary key or throws a {@link com.meera.db.NoSuchEmployeeException} if it could not be found.
	*
	* @param employeeId the primary key of the employee
	* @return the employee
	* @throws com.meera.db.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Employee findByPrimaryKey(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchEmployeeException {
		return getPersistence().findByPrimaryKey(employeeId);
	}

	/**
	* Returns the employee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeId the primary key of the employee
	* @return the employee, or <code>null</code> if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.meera.db.model.Employee fetchByPrimaryKey(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(employeeId);
	}

	/**
	* Returns all the employees.
	*
	* @return the employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Employee> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Employee> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Employee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the employees from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of employees.
	*
	* @return the number of employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the addresses associated with the employee.
	*
	* @param pk the primary key of the employee
	* @return the addresses associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Address> getAddresses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getAddresses(pk);
	}

	/**
	* Returns a range of all the addresses associated with the employee.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the employee
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of addresses associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Address> getAddresses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getAddresses(pk, start, end);
	}

	/**
	* Returns an ordered range of all the addresses associated with the employee.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.meera.db.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the employee
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of addresses associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.meera.db.model.Address> getAddresses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getAddresses(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of addresses associated with the employee.
	*
	* @param pk the primary key of the employee
	* @return the number of addresses associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public static int getAddressesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getAddressesSize(pk);
	}

	/**
	* Returns <code>true</code> if the address is associated with the employee.
	*
	* @param pk the primary key of the employee
	* @param addressPK the primary key of the address
	* @return <code>true</code> if the address is associated with the employee; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsAddress(long pk, long addressPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsAddress(pk, addressPK);
	}

	/**
	* Returns <code>true</code> if the employee has any addresses associated with it.
	*
	* @param pk the primary key of the employee to check for associations with addresses
	* @return <code>true</code> if the employee has any addresses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsAddresses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsAddresses(pk);
	}

	/**
	* Adds an association between the employee and the address. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param addressPK the primary key of the address
	* @throws SystemException if a system exception occurred
	*/
	public static void addAddress(long pk, long addressPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addAddress(pk, addressPK);
	}

	/**
	* Adds an association between the employee and the address. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param address the address
	* @throws SystemException if a system exception occurred
	*/
	public static void addAddress(long pk, com.meera.db.model.Address address)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addAddress(pk, address);
	}

	/**
	* Adds an association between the employee and the addresses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param addressPKs the primary keys of the addresses
	* @throws SystemException if a system exception occurred
	*/
	public static void addAddresses(long pk, long[] addressPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addAddresses(pk, addressPKs);
	}

	/**
	* Adds an association between the employee and the addresses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param addresses the addresses
	* @throws SystemException if a system exception occurred
	*/
	public static void addAddresses(long pk,
		java.util.List<com.meera.db.model.Address> addresses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addAddresses(pk, addresses);
	}

	/**
	* Clears all associations between the employee and its addresses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee to clear the associated addresses from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearAddresses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearAddresses(pk);
	}

	/**
	* Removes the association between the employee and the address. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param addressPK the primary key of the address
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAddress(long pk, long addressPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAddress(pk, addressPK);
	}

	/**
	* Removes the association between the employee and the address. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param address the address
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAddress(long pk, com.meera.db.model.Address address)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAddress(pk, address);
	}

	/**
	* Removes the association between the employee and the addresses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param addressPKs the primary keys of the addresses
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAddresses(long pk, long[] addressPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAddresses(pk, addressPKs);
	}

	/**
	* Removes the association between the employee and the addresses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param addresses the addresses
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAddresses(long pk,
		java.util.List<com.meera.db.model.Address> addresses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAddresses(pk, addresses);
	}

	/**
	* Sets the addresses associated with the employee, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param addressPKs the primary keys of the addresses to be associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public static void setAddresses(long pk, long[] addressPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setAddresses(pk, addressPKs);
	}

	/**
	* Sets the addresses associated with the employee, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param addresses the addresses to be associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public static void setAddresses(long pk,
		java.util.List<com.meera.db.model.Address> addresses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setAddresses(pk, addresses);
	}

	public static EmployeePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EmployeePersistence)PortletBeanLocatorUtil.locate(com.meera.db.service.ClpSerializer.getServletContextName(),
					EmployeePersistence.class.getName());

			ReferenceRegistry.registerReference(EmployeeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EmployeePersistence persistence) {
	}

	private static EmployeePersistence _persistence;
}