/* 
 * Copyright 2015 Cognitive Medical Systems, Inc (http://www.cognitivemedciine.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.socraticgrid.hl7.services.orders.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.socraticgrid.hl7.services.orders.model.primatives.Identifier;

/**
 * A collection of orderable items that can be requested using a single identifier.
 * 
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Jan-2014 9:12:41 AM
 */
public class OrderSet extends OrderItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Identifier identity;
	private Set<OrderItem> items = new HashSet<OrderItem>();



	public Identifier getIdentity(){
		return identity;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setIdentity(Identifier newVal){
		identity = newVal;
	}

	/**
	 * @return the items
	 */
	public Set<OrderItem> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(Set<OrderItem> items) {
		this.items = items;
	}

}