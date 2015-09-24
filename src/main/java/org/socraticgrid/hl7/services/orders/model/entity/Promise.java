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
package org.socraticgrid.hl7.services.orders.model.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Basit Azeem Sheikh
 */
@Entity
@Table(name = "tbl_promise")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class Promise implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Code status;
	private Identifier fulfillmentIdentity;
	private Identifier orderIdentity;
	private Identifier promiseIdentity;
	private Set<Requirement> requirements = new HashSet<Requirement>(0);
	private Set<OrderDetail> promisedItems = new HashSet<OrderDetail>(0);
	private Set<OrderDetail> orderedItems = new HashSet<OrderDetail>(0);

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the status
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "status_code_id")
	public Code getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Code status) {
		this.status = status;
	}

	/**
	 * @return the fulfillmentIdentity
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "fulfilment_identity_id")
	public Identifier getFulfillmentIdentity() {
		return fulfillmentIdentity;
	}

	/**
	 * @param fulfillmentIdentity
	 *            the fulfillmentIdentity to set
	 */
	public void setFulfillmentIdentity(Identifier fulfillmentIdentity) {
		this.fulfillmentIdentity = fulfillmentIdentity;
	}

	/**
	 * @return the orderIdentity
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "order_identity_id")
	public Identifier getOrderIdentity() {
		return orderIdentity;
	}

	/**
	 * @param orderIdentity
	 *            the orderIdentity to set
	 */
	public void setOrderIdentity(Identifier orderIdentity) {
		this.orderIdentity = orderIdentity;
	}

	/**
	 * @return the promiseIdentity
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "promise_identity_id")
	public Identifier getPromiseIdentity() {
		return promiseIdentity;
	}

	/**
	 * @param promiseIdentity
	 *            the promiseIdentity to set
	 */
	public void setPromiseIdentity(Identifier promiseIdentity) {
		this.promiseIdentity = promiseIdentity;
	}

	/**
	 * @return the requirements
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promise", cascade = CascadeType.ALL)
	public Set<Requirement> getRequirements() {
		return requirements;
	}

	/**
	 * @param requirements
	 *            the requirements to set
	 */
	public void setRequirements(Set<Requirement> requirements) {
		this.requirements = requirements;
	}

	/**
	 * @return the promisedItems
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promisedItem", cascade = CascadeType.ALL)
	public Set<OrderDetail> getPromisedItems() {
		return promisedItems;
	}

	/**
	 * @param promisedItems
	 *            the promisedItems to set
	 */
	public void setPromisedItems(Set<OrderDetail> promisedItems) {
		this.promisedItems = promisedItems;
	}

	/**
	 * @return the orderedItems
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orderedItem", cascade = CascadeType.ALL)
	public Set<OrderDetail> getOrderedItems() {
		return orderedItems;
	}

	/**
	 * @param orderedItems
	 *            the orderedItems to set
	 */
	public void setOrderedItems(Set<OrderDetail> orderedItems) {
		this.orderedItems = orderedItems;
	}

}