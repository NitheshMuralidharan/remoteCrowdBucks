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

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import com.meera.db.NoSuchEmployeeException;
import com.meera.db.model.Employee;
import com.meera.db.model.impl.EmployeeImpl;
import com.meera.db.model.impl.EmployeeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author E5410
 * @see EmployeePersistence
 * @see EmployeeUtil
 * @generated
 */
public class EmployeePersistenceImpl extends BasePersistenceImpl<Employee>
	implements EmployeePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeUtil} to access the employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPLOYEENAME =
		new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByemployeeName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEENAME =
		new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByemployeeName",
			new String[] { String.class.getName() },
			EmployeeModelImpl.EMPLOYEENAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EMPLOYEENAME = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByemployeeName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the employees where employeeName = &#63;.
	 *
	 * @param employeeName the employee name
	 * @return the matching employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Employee> findByemployeeName(String employeeName)
		throws SystemException {
		return findByemployeeName(employeeName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Employee> findByemployeeName(String employeeName, int start,
		int end) throws SystemException {
		return findByemployeeName(employeeName, start, end, null);
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
	@Override
	public List<Employee> findByemployeeName(String employeeName, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEENAME;
			finderArgs = new Object[] { employeeName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPLOYEENAME;
			finderArgs = new Object[] {
					employeeName,
					
					start, end, orderByComparator
				};
		}

		List<Employee> list = (List<Employee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Employee employee : list) {
				if (!Validator.equals(employeeName, employee.getEmployeeName())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_EMPLOYEE_WHERE);

			boolean bindEmployeeName = false;

			if (employeeName == null) {
				query.append(_FINDER_COLUMN_EMPLOYEENAME_EMPLOYEENAME_1);
			}
			else if (employeeName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMPLOYEENAME_EMPLOYEENAME_3);
			}
			else {
				bindEmployeeName = true;

				query.append(_FINDER_COLUMN_EMPLOYEENAME_EMPLOYEENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmployeeName) {
					qPos.add(employeeName);
				}

				if (!pagination) {
					list = (List<Employee>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Employee>(list);
				}
				else {
					list = (List<Employee>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Employee findByemployeeName_First(String employeeName,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = fetchByemployeeName_First(employeeName,
				orderByComparator);

		if (employee != null) {
			return employee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("employeeName=");
		msg.append(employeeName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeException(msg.toString());
	}

	/**
	 * Returns the first employee in the ordered set where employeeName = &#63;.
	 *
	 * @param employeeName the employee name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee, or <code>null</code> if a matching employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee fetchByemployeeName_First(String employeeName,
		OrderByComparator orderByComparator) throws SystemException {
		List<Employee> list = findByemployeeName(employeeName, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Employee findByemployeeName_Last(String employeeName,
		OrderByComparator orderByComparator)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = fetchByemployeeName_Last(employeeName,
				orderByComparator);

		if (employee != null) {
			return employee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("employeeName=");
		msg.append(employeeName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmployeeException(msg.toString());
	}

	/**
	 * Returns the last employee in the ordered set where employeeName = &#63;.
	 *
	 * @param employeeName the employee name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee, or <code>null</code> if a matching employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee fetchByemployeeName_Last(String employeeName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByemployeeName(employeeName);

		if (count == 0) {
			return null;
		}

		List<Employee> list = findByemployeeName(employeeName, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Employee[] findByemployeeName_PrevAndNext(long employeeId,
		String employeeName, OrderByComparator orderByComparator)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = findByPrimaryKey(employeeId);

		Session session = null;

		try {
			session = openSession();

			Employee[] array = new EmployeeImpl[3];

			array[0] = getByemployeeName_PrevAndNext(session, employee,
					employeeName, orderByComparator, true);

			array[1] = employee;

			array[2] = getByemployeeName_PrevAndNext(session, employee,
					employeeName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Employee getByemployeeName_PrevAndNext(Session session,
		Employee employee, String employeeName,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EMPLOYEE_WHERE);

		boolean bindEmployeeName = false;

		if (employeeName == null) {
			query.append(_FINDER_COLUMN_EMPLOYEENAME_EMPLOYEENAME_1);
		}
		else if (employeeName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EMPLOYEENAME_EMPLOYEENAME_3);
		}
		else {
			bindEmployeeName = true;

			query.append(_FINDER_COLUMN_EMPLOYEENAME_EMPLOYEENAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(EmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindEmployeeName) {
			qPos.add(employeeName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(employee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Employee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the employees where employeeName = &#63; from the database.
	 *
	 * @param employeeName the employee name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByemployeeName(String employeeName)
		throws SystemException {
		for (Employee employee : findByemployeeName(employeeName,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(employee);
		}
	}

	/**
	 * Returns the number of employees where employeeName = &#63;.
	 *
	 * @param employeeName the employee name
	 * @return the number of matching employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByemployeeName(String employeeName)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EMPLOYEENAME;

		Object[] finderArgs = new Object[] { employeeName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EMPLOYEE_WHERE);

			boolean bindEmployeeName = false;

			if (employeeName == null) {
				query.append(_FINDER_COLUMN_EMPLOYEENAME_EMPLOYEENAME_1);
			}
			else if (employeeName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMPLOYEENAME_EMPLOYEENAME_3);
			}
			else {
				bindEmployeeName = true;

				query.append(_FINDER_COLUMN_EMPLOYEENAME_EMPLOYEENAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmployeeName) {
					qPos.add(employeeName);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_EMPLOYEENAME_EMPLOYEENAME_1 = "employee.employeeName IS NULL";
	private static final String _FINDER_COLUMN_EMPLOYEENAME_EMPLOYEENAME_2 = "employee.employeeName = ?";
	private static final String _FINDER_COLUMN_EMPLOYEENAME_EMPLOYEENAME_3 = "(employee.employeeName IS NULL OR employee.employeeName = '')";

	public EmployeePersistenceImpl() {
		setModelClass(Employee.class);
	}

	/**
	 * Caches the employee in the entity cache if it is enabled.
	 *
	 * @param employee the employee
	 */
	@Override
	public void cacheResult(Employee employee) {
		EntityCacheUtil.putResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeImpl.class, employee.getPrimaryKey(), employee);

		employee.resetOriginalValues();
	}

	/**
	 * Caches the employees in the entity cache if it is enabled.
	 *
	 * @param employees the employees
	 */
	@Override
	public void cacheResult(List<Employee> employees) {
		for (Employee employee : employees) {
			if (EntityCacheUtil.getResult(
						EmployeeModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeImpl.class, employee.getPrimaryKey()) == null) {
				cacheResult(employee);
			}
			else {
				employee.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employees.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployeeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployeeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Employee employee) {
		EntityCacheUtil.removeResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeImpl.class, employee.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Employee> employees) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Employee employee : employees) {
			EntityCacheUtil.removeResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeImpl.class, employee.getPrimaryKey());
		}
	}

	/**
	 * Creates a new employee with the primary key. Does not add the employee to the database.
	 *
	 * @param employeeId the primary key for the new employee
	 * @return the new employee
	 */
	@Override
	public Employee create(long employeeId) {
		Employee employee = new EmployeeImpl();

		employee.setNew(true);
		employee.setPrimaryKey(employeeId);

		return employee;
	}

	/**
	 * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeId the primary key of the employee
	 * @return the employee that was removed
	 * @throws com.meera.db.NoSuchEmployeeException if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee remove(long employeeId)
		throws NoSuchEmployeeException, SystemException {
		return remove((Serializable)employeeId);
	}

	/**
	 * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee
	 * @return the employee that was removed
	 * @throws com.meera.db.NoSuchEmployeeException if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee remove(Serializable primaryKey)
		throws NoSuchEmployeeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Employee employee = (Employee)session.get(EmployeeImpl.class,
					primaryKey);

			if (employee == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employee);
		}
		catch (NoSuchEmployeeException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Employee removeImpl(Employee employee) throws SystemException {
		employee = toUnwrappedModel(employee);

		employeeToAddressTableMapper.deleteLeftPrimaryKeyTableMappings(employee.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employee)) {
				employee = (Employee)session.get(EmployeeImpl.class,
						employee.getPrimaryKeyObj());
			}

			if (employee != null) {
				session.delete(employee);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employee != null) {
			clearCache(employee);
		}

		return employee;
	}

	@Override
	public Employee updateImpl(com.meera.db.model.Employee employee)
		throws SystemException {
		employee = toUnwrappedModel(employee);

		boolean isNew = employee.isNew();

		EmployeeModelImpl employeeModelImpl = (EmployeeModelImpl)employee;

		Session session = null;

		try {
			session = openSession();

			if (employee.isNew()) {
				session.save(employee);

				employee.setNew(false);
			}
			else {
				session.merge(employee);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !EmployeeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((employeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEENAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						employeeModelImpl.getOriginalEmployeeName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEENAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEENAME,
					args);

				args = new Object[] { employeeModelImpl.getEmployeeName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEENAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEENAME,
					args);
			}
		}

		EntityCacheUtil.putResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeImpl.class, employee.getPrimaryKey(), employee);

		return employee;
	}

	protected Employee toUnwrappedModel(Employee employee) {
		if (employee instanceof EmployeeImpl) {
			return employee;
		}

		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setNew(employee.isNew());
		employeeImpl.setPrimaryKey(employee.getPrimaryKey());

		employeeImpl.setEmployeeId(employee.getEmployeeId());
		employeeImpl.setEmployeeName(employee.getEmployeeName());
		employeeImpl.setEmployeeDesignation(employee.getEmployeeDesignation());

		return employeeImpl;
	}

	/**
	 * Returns the employee with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee
	 * @return the employee
	 * @throws com.meera.db.NoSuchEmployeeException if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeException, SystemException {
		Employee employee = fetchByPrimaryKey(primaryKey);

		if (employee == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employee;
	}

	/**
	 * Returns the employee with the primary key or throws a {@link com.meera.db.NoSuchEmployeeException} if it could not be found.
	 *
	 * @param employeeId the primary key of the employee
	 * @return the employee
	 * @throws com.meera.db.NoSuchEmployeeException if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee findByPrimaryKey(long employeeId)
		throws NoSuchEmployeeException, SystemException {
		return findByPrimaryKey((Serializable)employeeId);
	}

	/**
	 * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee
	 * @return the employee, or <code>null</code> if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Employee employee = (Employee)EntityCacheUtil.getResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeImpl.class, primaryKey);

		if (employee == _nullEmployee) {
			return null;
		}

		if (employee == null) {
			Session session = null;

			try {
				session = openSession();

				employee = (Employee)session.get(EmployeeImpl.class, primaryKey);

				if (employee != null) {
					cacheResult(employee);
				}
				else {
					EntityCacheUtil.putResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeImpl.class, primaryKey, _nullEmployee);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employee;
	}

	/**
	 * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeId the primary key of the employee
	 * @return the employee, or <code>null</code> if a employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employee fetchByPrimaryKey(long employeeId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)employeeId);
	}

	/**
	 * Returns all the employees.
	 *
	 * @return the employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Employee> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Employee> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Employee> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Employee> list = (List<Employee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYEE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEE;

				if (pagination) {
					sql = sql.concat(EmployeeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Employee>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Employee>(list);
				}
				else {
					list = (List<Employee>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the employees from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Employee employee : findAll()) {
			remove(employee);
		}
	}

	/**
	 * Returns the number of employees.
	 *
	 * @return the number of employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEE);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns all the addresses associated with the employee.
	 *
	 * @param pk the primary key of the employee
	 * @return the addresses associated with the employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.meera.db.model.Address> getAddresses(long pk)
		throws SystemException {
		return getAddresses(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
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
	@Override
	public List<com.meera.db.model.Address> getAddresses(long pk, int start,
		int end) throws SystemException {
		return getAddresses(pk, start, end, null);
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
	@Override
	public List<com.meera.db.model.Address> getAddresses(long pk, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		return employeeToAddressTableMapper.getRightBaseModels(pk, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of addresses associated with the employee.
	 *
	 * @param pk the primary key of the employee
	 * @return the number of addresses associated with the employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getAddressesSize(long pk) throws SystemException {
		long[] pks = employeeToAddressTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the address is associated with the employee.
	 *
	 * @param pk the primary key of the employee
	 * @param addressPK the primary key of the address
	 * @return <code>true</code> if the address is associated with the employee; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsAddress(long pk, long addressPK)
		throws SystemException {
		return employeeToAddressTableMapper.containsTableMapping(pk, addressPK);
	}

	/**
	 * Returns <code>true</code> if the employee has any addresses associated with it.
	 *
	 * @param pk the primary key of the employee to check for associations with addresses
	 * @return <code>true</code> if the employee has any addresses associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsAddresses(long pk) throws SystemException {
		if (getAddressesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the employee and the address. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param addressPK the primary key of the address
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addAddress(long pk, long addressPK) throws SystemException {
		employeeToAddressTableMapper.addTableMapping(pk, addressPK);
	}

	/**
	 * Adds an association between the employee and the address. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param address the address
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addAddress(long pk, com.meera.db.model.Address address)
		throws SystemException {
		employeeToAddressTableMapper.addTableMapping(pk, address.getPrimaryKey());
	}

	/**
	 * Adds an association between the employee and the addresses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param addressPKs the primary keys of the addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addAddresses(long pk, long[] addressPKs)
		throws SystemException {
		for (long addressPK : addressPKs) {
			employeeToAddressTableMapper.addTableMapping(pk, addressPK);
		}
	}

	/**
	 * Adds an association between the employee and the addresses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param addresses the addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addAddresses(long pk, List<com.meera.db.model.Address> addresses)
		throws SystemException {
		for (com.meera.db.model.Address address : addresses) {
			employeeToAddressTableMapper.addTableMapping(pk,
				address.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the employee and its addresses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee to clear the associated addresses from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearAddresses(long pk) throws SystemException {
		employeeToAddressTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the employee and the address. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param addressPK the primary key of the address
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAddress(long pk, long addressPK)
		throws SystemException {
		employeeToAddressTableMapper.deleteTableMapping(pk, addressPK);
	}

	/**
	 * Removes the association between the employee and the address. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param address the address
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAddress(long pk, com.meera.db.model.Address address)
		throws SystemException {
		employeeToAddressTableMapper.deleteTableMapping(pk,
			address.getPrimaryKey());
	}

	/**
	 * Removes the association between the employee and the addresses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param addressPKs the primary keys of the addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAddresses(long pk, long[] addressPKs)
		throws SystemException {
		for (long addressPK : addressPKs) {
			employeeToAddressTableMapper.deleteTableMapping(pk, addressPK);
		}
	}

	/**
	 * Removes the association between the employee and the addresses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param addresses the addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAddresses(long pk,
		List<com.meera.db.model.Address> addresses) throws SystemException {
		for (com.meera.db.model.Address address : addresses) {
			employeeToAddressTableMapper.deleteTableMapping(pk,
				address.getPrimaryKey());
		}
	}

	/**
	 * Sets the addresses associated with the employee, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param addressPKs the primary keys of the addresses to be associated with the employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setAddresses(long pk, long[] addressPKs)
		throws SystemException {
		Set<Long> newAddressPKsSet = SetUtil.fromArray(addressPKs);
		Set<Long> oldAddressPKsSet = SetUtil.fromArray(employeeToAddressTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeAddressPKsSet = new HashSet<Long>(oldAddressPKsSet);

		removeAddressPKsSet.removeAll(newAddressPKsSet);

		for (long removeAddressPK : removeAddressPKsSet) {
			employeeToAddressTableMapper.deleteTableMapping(pk, removeAddressPK);
		}

		newAddressPKsSet.removeAll(oldAddressPKsSet);

		for (long newAddressPK : newAddressPKsSet) {
			employeeToAddressTableMapper.addTableMapping(pk, newAddressPK);
		}
	}

	/**
	 * Sets the addresses associated with the employee, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the employee
	 * @param addresses the addresses to be associated with the employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setAddresses(long pk, List<com.meera.db.model.Address> addresses)
		throws SystemException {
		try {
			long[] addressPKs = new long[addresses.size()];

			for (int i = 0; i < addresses.size(); i++) {
				com.meera.db.model.Address address = addresses.get(i);

				addressPKs[i] = address.getPrimaryKey();
			}

			setAddresses(pk, addressPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(EmployeeModelImpl.MAPPING_TABLE_TEST_EMPLOYEE_ADDRESS_NAME);
		}
	}

	/**
	 * Initializes the employee persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.meera.db.model.Employee")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Employee>> listenersList = new ArrayList<ModelListener<Employee>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Employee>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		employeeToAddressTableMapper = TableMapperFactory.getTableMapper("TEST_Employee_Address",
				"employeeId", "addressId", this, addressPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(EmployeeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = AddressPersistence.class)
	protected AddressPersistence addressPersistence;
	protected TableMapper<Employee, com.meera.db.model.Address> employeeToAddressTableMapper;
	private static final String _SQL_SELECT_EMPLOYEE = "SELECT employee FROM Employee employee";
	private static final String _SQL_SELECT_EMPLOYEE_WHERE = "SELECT employee FROM Employee employee WHERE ";
	private static final String _SQL_COUNT_EMPLOYEE = "SELECT COUNT(employee) FROM Employee employee";
	private static final String _SQL_COUNT_EMPLOYEE_WHERE = "SELECT COUNT(employee) FROM Employee employee WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employee.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Employee exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Employee exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployeePersistenceImpl.class);
	private static Employee _nullEmployee = new EmployeeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Employee> toCacheModel() {
				return _nullEmployeeCacheModel;
			}
		};

	private static CacheModel<Employee> _nullEmployeeCacheModel = new CacheModel<Employee>() {
			@Override
			public Employee toEntityModel() {
				return _nullEmployee;
			}
		};
}