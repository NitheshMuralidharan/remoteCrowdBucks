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

import com.meera.db.model.Address;

/**
 * The persistence interface for the address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author E5410
 * @see AddressPersistenceImpl
 * @see AddressUtil
 * @generated
 */
public interface AddressPersistence extends BasePersistence<Address> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddressUtil} to access the address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the addresses where city = &#63;.
	*
	* @param city the city
	* @return the matching addresses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.meera.db.model.Address> findBycity(
		java.lang.String city)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.meera.db.model.Address> findBycity(
		java.lang.String city, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.meera.db.model.Address> findBycity(
		java.lang.String city, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first address in the ordered set where city = &#63;.
	*
	* @param city the city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching address
	* @throws com.meera.db.NoSuchAddressException if a matching address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.db.model.Address findBycity_First(java.lang.String city,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchAddressException;

	/**
	* Returns the first address in the ordered set where city = &#63;.
	*
	* @param city the city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching address, or <code>null</code> if a matching address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.db.model.Address fetchBycity_First(java.lang.String city,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last address in the ordered set where city = &#63;.
	*
	* @param city the city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching address
	* @throws com.meera.db.NoSuchAddressException if a matching address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.db.model.Address findBycity_Last(java.lang.String city,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchAddressException;

	/**
	* Returns the last address in the ordered set where city = &#63;.
	*
	* @param city the city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching address, or <code>null</code> if a matching address could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.db.model.Address fetchBycity_Last(java.lang.String city,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.meera.db.model.Address[] findBycity_PrevAndNext(long addressId,
		java.lang.String city,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchAddressException;

	/**
	* Removes all the addresses where city = &#63; from the database.
	*
	* @param city the city
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycity(java.lang.String city)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of addresses where city = &#63;.
	*
	* @param city the city
	* @return the number of matching addresses
	* @throws SystemException if a system exception occurred
	*/
	public int countBycity(java.lang.String city)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the address in the entity cache if it is enabled.
	*
	* @param address the address
	*/
	public void cacheResult(com.meera.db.model.Address address);

	/**
	* Caches the addresses in the entity cache if it is enabled.
	*
	* @param addresses the addresses
	*/
	public void cacheResult(
		java.util.List<com.meera.db.model.Address> addresses);

	/**
	* Creates a new address with the primary key. Does not add the address to the database.
	*
	* @param addressId the primary key for the new address
	* @return the new address
	*/
	public com.meera.db.model.Address create(long addressId);

	/**
	* Removes the address with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param addressId the primary key of the address
	* @return the address that was removed
	* @throws com.meera.db.NoSuchAddressException if a address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.db.model.Address remove(long addressId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchAddressException;

	public com.meera.db.model.Address updateImpl(
		com.meera.db.model.Address address)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the address with the primary key or throws a {@link com.meera.db.NoSuchAddressException} if it could not be found.
	*
	* @param addressId the primary key of the address
	* @return the address
	* @throws com.meera.db.NoSuchAddressException if a address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.db.model.Address findByPrimaryKey(long addressId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.meera.db.NoSuchAddressException;

	/**
	* Returns the address with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param addressId the primary key of the address
	* @return the address, or <code>null</code> if a address with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.db.model.Address fetchByPrimaryKey(long addressId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the addresses.
	*
	* @return the addresses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.meera.db.model.Address> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.meera.db.model.Address> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.meera.db.model.Address> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the addresses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of addresses.
	*
	* @return the number of addresses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employees associated with the address.
	*
	* @param pk the primary key of the address
	* @return the employees associated with the address
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.meera.db.model.Employee> getEmployees(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.meera.db.model.Employee> getEmployees(long pk,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.meera.db.model.Employee> getEmployees(long pk,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees associated with the address.
	*
	* @param pk the primary key of the address
	* @return the number of employees associated with the address
	* @throws SystemException if a system exception occurred
	*/
	public int getEmployeesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the employee is associated with the address.
	*
	* @param pk the primary key of the address
	* @param employeePK the primary key of the employee
	* @return <code>true</code> if the employee is associated with the address; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsEmployee(long pk, long employeePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the address has any employees associated with it.
	*
	* @param pk the primary key of the address to check for associations with employees
	* @return <code>true</code> if the address has any employees associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsEmployees(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the address and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employeePK the primary key of the employee
	* @throws SystemException if a system exception occurred
	*/
	public void addEmployee(long pk, long employeePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the address and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employee the employee
	* @throws SystemException if a system exception occurred
	*/
	public void addEmployee(long pk, com.meera.db.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the address and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employeePKs the primary keys of the employees
	* @throws SystemException if a system exception occurred
	*/
	public void addEmployees(long pk, long[] employeePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the address and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employees the employees
	* @throws SystemException if a system exception occurred
	*/
	public void addEmployees(long pk,
		java.util.List<com.meera.db.model.Employee> employees)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the address and its employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address to clear the associated employees from
	* @throws SystemException if a system exception occurred
	*/
	public void clearEmployees(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the address and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employeePK the primary key of the employee
	* @throws SystemException if a system exception occurred
	*/
	public void removeEmployee(long pk, long employeePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the address and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employee the employee
	* @throws SystemException if a system exception occurred
	*/
	public void removeEmployee(long pk, com.meera.db.model.Employee employee)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the address and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employeePKs the primary keys of the employees
	* @throws SystemException if a system exception occurred
	*/
	public void removeEmployees(long pk, long[] employeePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the address and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employees the employees
	* @throws SystemException if a system exception occurred
	*/
	public void removeEmployees(long pk,
		java.util.List<com.meera.db.model.Employee> employees)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the employees associated with the address, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employeePKs the primary keys of the employees to be associated with the address
	* @throws SystemException if a system exception occurred
	*/
	public void setEmployees(long pk, long[] employeePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the employees associated with the address, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the address
	* @param employees the employees to be associated with the address
	* @throws SystemException if a system exception occurred
	*/
	public void setEmployees(long pk,
		java.util.List<com.meera.db.model.Employee> employees)
		throws com.liferay.portal.kernel.exception.SystemException;
}