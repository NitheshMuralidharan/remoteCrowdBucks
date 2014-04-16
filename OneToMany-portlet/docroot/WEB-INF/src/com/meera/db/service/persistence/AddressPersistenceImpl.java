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

import com.meera.db.NoSuchAddressException;
import com.meera.db.model.Address;
import com.meera.db.model.impl.AddressImpl;
import com.meera.db.model.impl.AddressModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author E5410
 * @see AddressPersistence
 * @see AddressUtil
 * @generated
 */
public class AddressPersistenceImpl extends BasePersistenceImpl<Address>
	implements AddressPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AddressUtil} to access the address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AddressImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AddressModelImpl.ENTITY_CACHE_ENABLED,
			AddressModelImpl.FINDER_CACHE_ENABLED, AddressImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AddressModelImpl.ENTITY_CACHE_ENABLED,
			AddressModelImpl.FINDER_CACHE_ENABLED, AddressImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AddressModelImpl.ENTITY_CACHE_ENABLED,
			AddressModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CITY = new FinderPath(AddressModelImpl.ENTITY_CACHE_ENABLED,
			AddressModelImpl.FINDER_CACHE_ENABLED, AddressImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycity",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITY = new FinderPath(AddressModelImpl.ENTITY_CACHE_ENABLED,
			AddressModelImpl.FINDER_CACHE_ENABLED, AddressImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycity",
			new String[] { String.class.getName() },
			AddressModelImpl.CITY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CITY = new FinderPath(AddressModelImpl.ENTITY_CACHE_ENABLED,
			AddressModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycity",
			new String[] { String.class.getName() });

	/**
	 * Returns all the addresses where city = &#63;.
	 *
	 * @param city the city
	 * @return the matching addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Address> findBycity(String city) throws SystemException {
		return findBycity(city, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Address> findBycity(String city, int start, int end)
		throws SystemException {
		return findBycity(city, start, end, null);
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
	@Override
	public List<Address> findBycity(String city, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITY;
			finderArgs = new Object[] { city };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CITY;
			finderArgs = new Object[] { city, start, end, orderByComparator };
		}

		List<Address> list = (List<Address>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Address address : list) {
				if (!Validator.equals(city, address.getCity())) {
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

			query.append(_SQL_SELECT_ADDRESS_WHERE);

			boolean bindCity = false;

			if (city == null) {
				query.append(_FINDER_COLUMN_CITY_CITY_1);
			}
			else if (city.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CITY_CITY_3);
			}
			else {
				bindCity = true;

				query.append(_FINDER_COLUMN_CITY_CITY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AddressModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCity) {
					qPos.add(city);
				}

				if (!pagination) {
					list = (List<Address>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Address>(list);
				}
				else {
					list = (List<Address>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first address in the ordered set where city = &#63;.
	 *
	 * @param city the city
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching address
	 * @throws com.meera.db.NoSuchAddressException if a matching address could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Address findBycity_First(String city,
		OrderByComparator orderByComparator)
		throws NoSuchAddressException, SystemException {
		Address address = fetchBycity_First(city, orderByComparator);

		if (address != null) {
			return address;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("city=");
		msg.append(city);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAddressException(msg.toString());
	}

	/**
	 * Returns the first address in the ordered set where city = &#63;.
	 *
	 * @param city the city
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching address, or <code>null</code> if a matching address could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Address fetchBycity_First(String city,
		OrderByComparator orderByComparator) throws SystemException {
		List<Address> list = findBycity(city, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Address findBycity_Last(String city,
		OrderByComparator orderByComparator)
		throws NoSuchAddressException, SystemException {
		Address address = fetchBycity_Last(city, orderByComparator);

		if (address != null) {
			return address;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("city=");
		msg.append(city);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAddressException(msg.toString());
	}

	/**
	 * Returns the last address in the ordered set where city = &#63;.
	 *
	 * @param city the city
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching address, or <code>null</code> if a matching address could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Address fetchBycity_Last(String city,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBycity(city);

		if (count == 0) {
			return null;
		}

		List<Address> list = findBycity(city, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Address[] findBycity_PrevAndNext(long addressId, String city,
		OrderByComparator orderByComparator)
		throws NoSuchAddressException, SystemException {
		Address address = findByPrimaryKey(addressId);

		Session session = null;

		try {
			session = openSession();

			Address[] array = new AddressImpl[3];

			array[0] = getBycity_PrevAndNext(session, address, city,
					orderByComparator, true);

			array[1] = address;

			array[2] = getBycity_PrevAndNext(session, address, city,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Address getBycity_PrevAndNext(Session session, Address address,
		String city, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ADDRESS_WHERE);

		boolean bindCity = false;

		if (city == null) {
			query.append(_FINDER_COLUMN_CITY_CITY_1);
		}
		else if (city.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CITY_CITY_3);
		}
		else {
			bindCity = true;

			query.append(_FINDER_COLUMN_CITY_CITY_2);
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
			query.append(AddressModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCity) {
			qPos.add(city);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(address);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Address> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the addresses where city = &#63; from the database.
	 *
	 * @param city the city
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBycity(String city) throws SystemException {
		for (Address address : findBycity(city, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(address);
		}
	}

	/**
	 * Returns the number of addresses where city = &#63;.
	 *
	 * @param city the city
	 * @return the number of matching addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBycity(String city) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CITY;

		Object[] finderArgs = new Object[] { city };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ADDRESS_WHERE);

			boolean bindCity = false;

			if (city == null) {
				query.append(_FINDER_COLUMN_CITY_CITY_1);
			}
			else if (city.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CITY_CITY_3);
			}
			else {
				bindCity = true;

				query.append(_FINDER_COLUMN_CITY_CITY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCity) {
					qPos.add(city);
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

	private static final String _FINDER_COLUMN_CITY_CITY_1 = "address.city IS NULL";
	private static final String _FINDER_COLUMN_CITY_CITY_2 = "address.city = ?";
	private static final String _FINDER_COLUMN_CITY_CITY_3 = "(address.city IS NULL OR address.city = '')";

	public AddressPersistenceImpl() {
		setModelClass(Address.class);
	}

	/**
	 * Caches the address in the entity cache if it is enabled.
	 *
	 * @param address the address
	 */
	@Override
	public void cacheResult(Address address) {
		EntityCacheUtil.putResult(AddressModelImpl.ENTITY_CACHE_ENABLED,
			AddressImpl.class, address.getPrimaryKey(), address);

		address.resetOriginalValues();
	}

	/**
	 * Caches the addresses in the entity cache if it is enabled.
	 *
	 * @param addresses the addresses
	 */
	@Override
	public void cacheResult(List<Address> addresses) {
		for (Address address : addresses) {
			if (EntityCacheUtil.getResult(
						AddressModelImpl.ENTITY_CACHE_ENABLED,
						AddressImpl.class, address.getPrimaryKey()) == null) {
				cacheResult(address);
			}
			else {
				address.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all addresses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AddressImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AddressImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the address.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Address address) {
		EntityCacheUtil.removeResult(AddressModelImpl.ENTITY_CACHE_ENABLED,
			AddressImpl.class, address.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Address> addresses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Address address : addresses) {
			EntityCacheUtil.removeResult(AddressModelImpl.ENTITY_CACHE_ENABLED,
				AddressImpl.class, address.getPrimaryKey());
		}
	}

	/**
	 * Creates a new address with the primary key. Does not add the address to the database.
	 *
	 * @param addressId the primary key for the new address
	 * @return the new address
	 */
	@Override
	public Address create(long addressId) {
		Address address = new AddressImpl();

		address.setNew(true);
		address.setPrimaryKey(addressId);

		return address;
	}

	/**
	 * Removes the address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addressId the primary key of the address
	 * @return the address that was removed
	 * @throws com.meera.db.NoSuchAddressException if a address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Address remove(long addressId)
		throws NoSuchAddressException, SystemException {
		return remove((Serializable)addressId);
	}

	/**
	 * Removes the address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the address
	 * @return the address that was removed
	 * @throws com.meera.db.NoSuchAddressException if a address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Address remove(Serializable primaryKey)
		throws NoSuchAddressException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Address address = (Address)session.get(AddressImpl.class, primaryKey);

			if (address == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(address);
		}
		catch (NoSuchAddressException nsee) {
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
	protected Address removeImpl(Address address) throws SystemException {
		address = toUnwrappedModel(address);

		addressToEmployeeTableMapper.deleteLeftPrimaryKeyTableMappings(address.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(address)) {
				address = (Address)session.get(AddressImpl.class,
						address.getPrimaryKeyObj());
			}

			if (address != null) {
				session.delete(address);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (address != null) {
			clearCache(address);
		}

		return address;
	}

	@Override
	public Address updateImpl(com.meera.db.model.Address address)
		throws SystemException {
		address = toUnwrappedModel(address);

		boolean isNew = address.isNew();

		AddressModelImpl addressModelImpl = (AddressModelImpl)address;

		Session session = null;

		try {
			session = openSession();

			if (address.isNew()) {
				session.save(address);

				address.setNew(false);
			}
			else {
				session.merge(address);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AddressModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((addressModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { addressModelImpl.getOriginalCity() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CITY, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITY,
					args);

				args = new Object[] { addressModelImpl.getCity() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CITY, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITY,
					args);
			}
		}

		EntityCacheUtil.putResult(AddressModelImpl.ENTITY_CACHE_ENABLED,
			AddressImpl.class, address.getPrimaryKey(), address);

		return address;
	}

	protected Address toUnwrappedModel(Address address) {
		if (address instanceof AddressImpl) {
			return address;
		}

		AddressImpl addressImpl = new AddressImpl();

		addressImpl.setNew(address.isNew());
		addressImpl.setPrimaryKey(address.getPrimaryKey());

		addressImpl.setAddressId(address.getAddressId());
		addressImpl.setStreet1(address.getStreet1());
		addressImpl.setStreet2(address.getStreet2());
		addressImpl.setCity(address.getCity());

		return addressImpl;
	}

	/**
	 * Returns the address with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the address
	 * @return the address
	 * @throws com.meera.db.NoSuchAddressException if a address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Address findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddressException, SystemException {
		Address address = fetchByPrimaryKey(primaryKey);

		if (address == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return address;
	}

	/**
	 * Returns the address with the primary key or throws a {@link com.meera.db.NoSuchAddressException} if it could not be found.
	 *
	 * @param addressId the primary key of the address
	 * @return the address
	 * @throws com.meera.db.NoSuchAddressException if a address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Address findByPrimaryKey(long addressId)
		throws NoSuchAddressException, SystemException {
		return findByPrimaryKey((Serializable)addressId);
	}

	/**
	 * Returns the address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the address
	 * @return the address, or <code>null</code> if a address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Address fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Address address = (Address)EntityCacheUtil.getResult(AddressModelImpl.ENTITY_CACHE_ENABLED,
				AddressImpl.class, primaryKey);

		if (address == _nullAddress) {
			return null;
		}

		if (address == null) {
			Session session = null;

			try {
				session = openSession();

				address = (Address)session.get(AddressImpl.class, primaryKey);

				if (address != null) {
					cacheResult(address);
				}
				else {
					EntityCacheUtil.putResult(AddressModelImpl.ENTITY_CACHE_ENABLED,
						AddressImpl.class, primaryKey, _nullAddress);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AddressModelImpl.ENTITY_CACHE_ENABLED,
					AddressImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return address;
	}

	/**
	 * Returns the address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addressId the primary key of the address
	 * @return the address, or <code>null</code> if a address with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Address fetchByPrimaryKey(long addressId) throws SystemException {
		return fetchByPrimaryKey((Serializable)addressId);
	}

	/**
	 * Returns all the addresses.
	 *
	 * @return the addresses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Address> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Address> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Address> findAll(int start, int end,
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

		List<Address> list = (List<Address>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ADDRESS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ADDRESS;

				if (pagination) {
					sql = sql.concat(AddressModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Address>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Address>(list);
				}
				else {
					list = (List<Address>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the addresses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Address address : findAll()) {
			remove(address);
		}
	}

	/**
	 * Returns the number of addresses.
	 *
	 * @return the number of addresses
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

				Query q = session.createQuery(_SQL_COUNT_ADDRESS);

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
	 * Returns all the employees associated with the address.
	 *
	 * @param pk the primary key of the address
	 * @return the employees associated with the address
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.meera.db.model.Employee> getEmployees(long pk)
		throws SystemException {
		return getEmployees(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
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
	@Override
	public List<com.meera.db.model.Employee> getEmployees(long pk, int start,
		int end) throws SystemException {
		return getEmployees(pk, start, end, null);
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
	@Override
	public List<com.meera.db.model.Employee> getEmployees(long pk, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		return addressToEmployeeTableMapper.getRightBaseModels(pk, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of employees associated with the address.
	 *
	 * @param pk the primary key of the address
	 * @return the number of employees associated with the address
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getEmployeesSize(long pk) throws SystemException {
		long[] pks = addressToEmployeeTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the employee is associated with the address.
	 *
	 * @param pk the primary key of the address
	 * @param employeePK the primary key of the employee
	 * @return <code>true</code> if the employee is associated with the address; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsEmployee(long pk, long employeePK)
		throws SystemException {
		return addressToEmployeeTableMapper.containsTableMapping(pk, employeePK);
	}

	/**
	 * Returns <code>true</code> if the address has any employees associated with it.
	 *
	 * @param pk the primary key of the address to check for associations with employees
	 * @return <code>true</code> if the address has any employees associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsEmployees(long pk) throws SystemException {
		if (getEmployeesSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the address and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the address
	 * @param employeePK the primary key of the employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEmployee(long pk, long employeePK) throws SystemException {
		addressToEmployeeTableMapper.addTableMapping(pk, employeePK);
	}

	/**
	 * Adds an association between the address and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the address
	 * @param employee the employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEmployee(long pk, com.meera.db.model.Employee employee)
		throws SystemException {
		addressToEmployeeTableMapper.addTableMapping(pk,
			employee.getPrimaryKey());
	}

	/**
	 * Adds an association between the address and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the address
	 * @param employeePKs the primary keys of the employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEmployees(long pk, long[] employeePKs)
		throws SystemException {
		for (long employeePK : employeePKs) {
			addressToEmployeeTableMapper.addTableMapping(pk, employeePK);
		}
	}

	/**
	 * Adds an association between the address and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the address
	 * @param employees the employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addEmployees(long pk,
		List<com.meera.db.model.Employee> employees) throws SystemException {
		for (com.meera.db.model.Employee employee : employees) {
			addressToEmployeeTableMapper.addTableMapping(pk,
				employee.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the address and its employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the address to clear the associated employees from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearEmployees(long pk) throws SystemException {
		addressToEmployeeTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the address and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the address
	 * @param employeePK the primary key of the employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeEmployee(long pk, long employeePK)
		throws SystemException {
		addressToEmployeeTableMapper.deleteTableMapping(pk, employeePK);
	}

	/**
	 * Removes the association between the address and the employee. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the address
	 * @param employee the employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeEmployee(long pk, com.meera.db.model.Employee employee)
		throws SystemException {
		addressToEmployeeTableMapper.deleteTableMapping(pk,
			employee.getPrimaryKey());
	}

	/**
	 * Removes the association between the address and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the address
	 * @param employeePKs the primary keys of the employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeEmployees(long pk, long[] employeePKs)
		throws SystemException {
		for (long employeePK : employeePKs) {
			addressToEmployeeTableMapper.deleteTableMapping(pk, employeePK);
		}
	}

	/**
	 * Removes the association between the address and the employees. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the address
	 * @param employees the employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeEmployees(long pk,
		List<com.meera.db.model.Employee> employees) throws SystemException {
		for (com.meera.db.model.Employee employee : employees) {
			addressToEmployeeTableMapper.deleteTableMapping(pk,
				employee.getPrimaryKey());
		}
	}

	/**
	 * Sets the employees associated with the address, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the address
	 * @param employeePKs the primary keys of the employees to be associated with the address
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setEmployees(long pk, long[] employeePKs)
		throws SystemException {
		Set<Long> newEmployeePKsSet = SetUtil.fromArray(employeePKs);
		Set<Long> oldEmployeePKsSet = SetUtil.fromArray(addressToEmployeeTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeEmployeePKsSet = new HashSet<Long>(oldEmployeePKsSet);

		removeEmployeePKsSet.removeAll(newEmployeePKsSet);

		for (long removeEmployeePK : removeEmployeePKsSet) {
			addressToEmployeeTableMapper.deleteTableMapping(pk, removeEmployeePK);
		}

		newEmployeePKsSet.removeAll(oldEmployeePKsSet);

		for (long newEmployeePK : newEmployeePKsSet) {
			addressToEmployeeTableMapper.addTableMapping(pk, newEmployeePK);
		}
	}

	/**
	 * Sets the employees associated with the address, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the address
	 * @param employees the employees to be associated with the address
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setEmployees(long pk,
		List<com.meera.db.model.Employee> employees) throws SystemException {
		try {
			long[] employeePKs = new long[employees.size()];

			for (int i = 0; i < employees.size(); i++) {
				com.meera.db.model.Employee employee = employees.get(i);

				employeePKs[i] = employee.getPrimaryKey();
			}

			setEmployees(pk, employeePKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(AddressModelImpl.MAPPING_TABLE_TEST_EMPLOYEE_ADDRESS_NAME);
		}
	}

	/**
	 * Initializes the address persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.meera.db.model.Address")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Address>> listenersList = new ArrayList<ModelListener<Address>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Address>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		addressToEmployeeTableMapper = TableMapperFactory.getTableMapper("TEST_Employee_Address",
				"addressId", "employeeId", this, employeePersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(AddressImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = EmployeePersistence.class)
	protected EmployeePersistence employeePersistence;
	protected TableMapper<Address, com.meera.db.model.Employee> addressToEmployeeTableMapper;
	private static final String _SQL_SELECT_ADDRESS = "SELECT address FROM Address address";
	private static final String _SQL_SELECT_ADDRESS_WHERE = "SELECT address FROM Address address WHERE ";
	private static final String _SQL_COUNT_ADDRESS = "SELECT COUNT(address) FROM Address address";
	private static final String _SQL_COUNT_ADDRESS_WHERE = "SELECT COUNT(address) FROM Address address WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "address.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Address exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Address exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AddressPersistenceImpl.class);
	private static Address _nullAddress = new AddressImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Address> toCacheModel() {
				return _nullAddressCacheModel;
			}
		};

	private static CacheModel<Address> _nullAddressCacheModel = new CacheModel<Address>() {
			@Override
			public Address toEntityModel() {
				return _nullAddress;
			}
		};
}