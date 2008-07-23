/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.service;


/**
 * <a href="UserGroupLocalServiceUtil.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This class provides static methods for the
 * <code>com.liferay.portal.service.UserGroupLocalService</code>
 * bean. The static methods of this class calls the same methods of the bean
 * instance. It's convenient to be able to just write one line to call a method
 * on a bean instead of writing a lookup call and a method call.
 * </p>
 *
 * <p>
 * <code>com.liferay.portal.service.UserGroupLocalServiceFactory</code>
 * is responsible for the lookup of the bean.
 * </p>
 *
 * @author Brian Wing Shun Chan
 *
 * @see com.liferay.portal.service.UserGroupLocalService
 * @see com.liferay.portal.service.UserGroupLocalServiceFactory
 *
 */
public class UserGroupLocalServiceUtil {
	public static com.liferay.portal.model.UserGroup addUserGroup(
		com.liferay.portal.model.UserGroup userGroup)
		throws com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		return userGroupLocalService.addUserGroup(userGroup);
	}

	public static void deleteUserGroup(long userGroupId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		userGroupLocalService.deleteUserGroup(userGroupId);
	}

	public static void deleteUserGroup(
		com.liferay.portal.model.UserGroup userGroup)
		throws com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		userGroupLocalService.deleteUserGroup(userGroup);
	}

	public static java.util.List<Object> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		return userGroupLocalService.dynamicQuery(dynamicQuery);
	}

	public static java.util.List<Object> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		return userGroupLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	public static com.liferay.portal.model.UserGroup getUserGroup(
		long userGroupId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		return userGroupLocalService.getUserGroup(userGroupId);
	}

	public static java.util.List<com.liferay.portal.model.UserGroup> getUserGroups(
		int start, int end) throws com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		return userGroupLocalService.getUserGroups(start, end);
	}

	public static int getUserGroupsCount()
		throws com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		return userGroupLocalService.getUserGroupsCount();
	}

	public static com.liferay.portal.model.UserGroup updateUserGroup(
		com.liferay.portal.model.UserGroup userGroup)
		throws com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		return userGroupLocalService.updateUserGroup(userGroup);
	}

	public static void addGroupUserGroups(long groupId, long[] userGroupIds)
		throws com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		userGroupLocalService.addGroupUserGroups(groupId, userGroupIds);
	}

	public static com.liferay.portal.model.UserGroup addUserGroup(long userId,
		long companyId, java.lang.String name, java.lang.String description)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		return userGroupLocalService.addUserGroup(userId, companyId, name,
			description);
	}

	public static void clearUserUserGroups(long userId)
		throws com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		userGroupLocalService.clearUserUserGroups(userId);
	}

	public static com.liferay.portal.model.UserGroup getUserGroup(
		long companyId, java.lang.String name)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		return userGroupLocalService.getUserGroup(companyId, name);
	}

	public static java.util.List<com.liferay.portal.model.UserGroup> getUserGroups(
		long companyId) throws com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		return userGroupLocalService.getUserGroups(companyId);
	}

	public static java.util.List<com.liferay.portal.model.UserGroup> getUserUserGroups(
		long userId) throws com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		return userGroupLocalService.getUserUserGroups(userId);
	}

	public static boolean hasGroupUserGroup(long groupId, long userGroupId)
		throws com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		return userGroupLocalService.hasGroupUserGroup(groupId, userGroupId);
	}

	public static java.util.List<com.liferay.portal.model.UserGroup> search(
		long companyId, java.lang.String name, java.lang.String description,
		java.util.LinkedHashMap<String, Object> params, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		return userGroupLocalService.search(companyId, name, description,
			params, start, end, obc);
	}

	public static int searchCount(long companyId, java.lang.String name,
		java.lang.String description,
		java.util.LinkedHashMap<String, Object> params)
		throws com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		return userGroupLocalService.searchCount(companyId, name, description,
			params);
	}

	public static void unsetGroupUserGroups(long groupId, long[] userGroupIds)
		throws com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		userGroupLocalService.unsetGroupUserGroups(groupId, userGroupIds);
	}

	public static com.liferay.portal.model.UserGroup updateUserGroup(
		long companyId, long userGroupId, java.lang.String name,
		java.lang.String description)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		UserGroupLocalService userGroupLocalService = UserGroupLocalServiceFactory.getService();

		return userGroupLocalService.updateUserGroup(companyId, userGroupId,
			name, description);
	}
}