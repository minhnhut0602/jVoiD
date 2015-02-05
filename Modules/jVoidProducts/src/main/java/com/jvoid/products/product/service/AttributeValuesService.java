/*
 * #%L
 * jVoiD Open Platform
 * %%
 * Copyright (C) 2014 - 2015 jVoiD
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
 package com.jvoid.products.product.service;

import java.util.List;

import com.jvoid.products.product.model.AttributeValues;


public interface AttributeValuesService {

	public void addAttributeValues(AttributeValues p);
	public void updateAttributeValues(AttributeValues p);
	public List<AttributeValues> listAttributeValues();
	public AttributeValues getAttributeValuesById(int id);
	public void removeAttributeValues(int id);
	
}