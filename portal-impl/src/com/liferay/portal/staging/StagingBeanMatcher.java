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

package com.liferay.portal.staging;

import com.liferay.portal.kernel.staging.Staging;
import com.liferay.portal.spring.aop.BeanMatcher;

/**
 * @author Edward C. Han
 */
public class StagingBeanMatcher implements BeanMatcher {

	@Override
	public boolean match(Class<?> beanClass, String beanName) {
		return Staging.class.isAssignableFrom(beanClass);
	}

}