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

import com.liferay.portal.service.persistence.BasePersistence;

import com.meera.db.model.Employee;

/**
 * The persistence interface for the employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author E5410
 * @see EmployeePersistenceImpl
 * @see EmployeeUtil
 * @generated
 */
public interface EmployeePersistence extends BasePersistence<Employee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeUtil} to access the employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the employees where employeeName = &#63;.
	*
	* @param employeeName the employee name
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.meera.db.model.Employee> findByemployeeName(
		java.lang.String employeeName)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.meera.db.model.Employee> findByemployeeName(
		java.lang.String employeeName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.meera.db.model.Employee> findByemployeeName(
		java.lang.String employeeName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee in the ordered set where employeeName = &#63;.
	*
	* @param employeeName the employee name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee
	* @throws com.meera.db.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.db.model.Employee findByemployeeName_First(
		java.lang.String employeeName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchEmployeeException;

	/**
	* Returns the first employee in the ordered set where employeeName = &#63;.
	*
	* @param employeeName the employee name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.db.model.Employee fetchByemployeeName_First(
		java.lang.String employeeName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee in the ordered set where employeeName = &#63;.
	*
	* @param employeeName the employee name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee
	* @throws com.meera.db.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.db.model.Employee findByemployeeName_Last(
		java.lang.String employeeName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchEmployeeException;

	/**
	* Returns the last employee in the ordered set where employeeName = &#63;.
	*
	* @param employeeName the employee name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.db.model.Employee fetchByemployeeName_Last(
		java.lang.String employeeName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.meera.db.model.Employee[] findByemployeeName_PrevAndNext(
		long employeeId, java.lang.String employeeName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchEmployeeException;

	/**
	* Removes all the employees where employeeName = &#63; from the database.
	*
	* @param employeeName the employee name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByemployeeName(java.lang.String employeeName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees where employeeName = &#63;.
	*
	* @param employeeName the employee name
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByemployeeName(java.lang.String employeeName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the employee in the entity cache if it is enabled.
	*
	* @param employee the employee
	*/
	public void cacheResult(com.meera.db.model.Employee employee);

	/**
	* Caches the employees in the entity cache if it is enabled.
	*
	* @param employees the employees
	*/
	public void cacheResult(
		java.util.List<com.meera.db.model.Employee> employees);

	/**
	* Creates a new employee with the primary key. Does not add the employee to the database.
	*
	* @param employeeId the primary key for the new employee
	* @return the new employee
	*/
	public com.meera.db.model.Employee create(long employeeId);

	/**
	* Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeId the primary key of the employee
	* @return the employee that was removed
	* @throws com.meera.db.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.db.model.Employee remove(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchEmployeeException;

	public com.meera.db.model.Employee updateImpl(
		com.meera.db.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee with the primary key or throws a {@link com.meera.db.NoSuchEmployeeException} if it could not be found.
	*
	* @param employeeId the primary key of the employee
	* @return the employee
	* @throws com.meera.db.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.db.model.Employee findByPrimaryKey(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchEmployeeException;

	/**
	* Returns the employee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeId the primary key of the employee
	* @return the employee, or <code>null</code> if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.db.model.Employee fetchByPrimaryKey(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employees.
	*
	* @return the employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.meera.db.model.Employee> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.meera.db.model.Employee> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.meera.db.model.Employee> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employees from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees.
	*
	* @return the number of employees
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the addresses associated with the employee.
	*
	* @param pk the primary key of the employee
	* @return the addresses associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.meera.db.model.Address> getAddresses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.meera.db.model.Address> getAddresses(long pk,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.meera.db.model.Address> getAddresses(long pk,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of addresses associated with the employee.
	*
	* @param pk the primary key of the employee
	* @return the number of addresses associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public int getAddressesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the address is associated with the employee.
	*
	* @param pk the primary key of the employee
	* @param addressPK the primary key of the address
	* @return <code>true</code> if the address is associated with the employee; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsAddress(long pk, long addressPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the employee has any addresses associated with it.
	*
	* @param pk the primary key of the employee to check for associations with addresses
	* @return <code>true</code> if the employee has any addresses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsAddresses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the employee and the address. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param addressPK the primary key of the address
	* @throws SystemException if a system exception occurred
	*/
	public void addAddress(long pk, long addressPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the employee and the address. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param address the address
	* @throws SystemException if a system exception occurred
	*/
	public void addAddress(long pk, com.meera.db.model.Address address)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the employee and the addresses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param addressPKs the primary keys of the addresses
	* @throws SystemException if a system exception occurred
	*/
	public void addAddresses(long pk, long[] addressPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the employee and the addresses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param addresses the addresses
	* @throws SystemException if a system exception occurred
	*/
	public void addAddresses(long pk,
		java.util.List<com.meera.db.model.Address> addresses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the employee and its addresses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee to clear the associated addresses from
	* @throws SystemException if a system exception occurred
	*/
	public void clearAddresses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the employee and the address. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param addressPK the primary key of the address
	* @throws SystemException if a system exception occurred
	*/
	public void removeAddress(long pk, long addressPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the employee and the address. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param address the address
	* @throws SystemException if a system exception occurred
	*/
	public void removeAddress(long pk, com.meera.db.model.Address address)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the employee and the addresses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param addressPKs the primary keys of the addresses
	* @throws SystemException if a system exception occurred
	*/
	public void removeAddresses(long pk, long[] addressPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the employee and the addresses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param addresses the addresses
	* @throws SystemException if a system exception occurred
	*/
	public void removeAddresses(long pk,
		java.util.List<com.meera.db.model.Address> addresses)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the addresses associated with the employee, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param addressPKs the primary keys of the addresses to be associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public void setAddresses(long pk, long[] addressPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the addresses associated with the employee, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the employee
	* @param addresses the addresses to be associated with the employee
	* @throws SystemException if a system exception occurred
	*/
	public void setAddresses(long pk,
		java.util.List<com.meera.db.model.Address> addresses)
		throws com.liferay.portal.kernel.exception.SystemException;
}