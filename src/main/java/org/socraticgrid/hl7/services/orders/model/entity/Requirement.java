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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.socraticgrid.hl7.services.orders.model.requirements.RequirementStatusCode;
import org.socraticgrid.hl7.services.orders.model.requirements.RequirementType;

/**
 * @author Basit Azeem Sheikh
 */
@Entity
@Table(name = "tbl_requirement")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class Requirement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String reqId;
	private String orignator;
	private RequirementStatusCode status;
	private RequirementType type;
	private Promise promise;
	private Order order;

	// EndorsementRequirement
	private String userId;
	private String seed;
	private String signature;
	private String scheme;

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
	 * @return the reqId
	 */
	@Column(name = "req_id", nullable = false, length = 100)
	public String getReqId() {
		return reqId;
	}

	/**
	 * @param reqId the reqId to set
	 */
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	/**
	 * @return the orignator
	 */
	@Column(name = "originator", nullable = false, length = 100)
	public String getOrignator() {
		return orignator;
	}

	/**
	 * @param orignator
	 *            the orignator to set
	 */
	public void setOrignator(String orignator) {
		this.orignator = orignator;
	}

	/**
	 * @return the status
	 */
	@Column(name = "status", length = 50)
	@Enumerated(EnumType.STRING)
	public RequirementStatusCode getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(RequirementStatusCode status) {
		this.status = status;
	}

	/**
	 * @return the type
	 */
	@Column(name = "type", length = 50)
	@Enumerated(EnumType.STRING)
	public RequirementType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(RequirementType type) {
		this.type = type;
	}

	/**
	 * @return the promise
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "promise_id", nullable = true)
	public Promise getPromise() {
		return promise;
	}

	/**
	 * @param promise the promise to set
	 */
	public void setPromise(Promise promise) {
		this.promise = promise;
	}

	/**
	 * @return the order
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id", nullable = true)
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * @return the userId
	 */
	@Column(name = "user_id", length = 50)
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the seed
	 */
	@Column(name = "seed", length = 500)
	public String getSeed() {
		return seed;
	}

	/**
	 * @param seed
	 *            the seed to set
	 */
	public void setSeed(String seed) {
		this.seed = seed;
	}

	/**
	 * @return the signature
	 */
	@Column(name = "signature", length = 50)
	public String getSignature() {
		return signature;
	}

	/**
	 * @param signature
	 *            the signature to set
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}

	/**
	 * @return the scheme
	 */
	@Column(name = "scheme", length = 50)
	public String getScheme() {
		return scheme;
	}

	/**
	 * @param scheme
	 *            the scheme to set
	 */
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	
}