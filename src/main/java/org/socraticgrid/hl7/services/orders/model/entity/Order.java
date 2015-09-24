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
import java.util.Date;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Basit Azeem Sheikh
 */
@Entity
@Table(name = "tbl_order")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Identifier orderIdentity;
	private ClinicalPractitioner orderedBy;
	private Identifier orderEnteredBy;
	private Date orderTime;
	private String type;
	private Code lab;
	private String medication;
	private String action;
	private String details;
	private Code status;
	private Subject subject;
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);
	private Set<Provenance> provenance = new HashSet<Provenance>(0);
	private Set<Requirement> requirements = new HashSet<Requirement>(0);

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
	 * @return the orderIdentity
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "order_identity")
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
	 * @return the orderedBy
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ordered_by_id", nullable = false)
	public ClinicalPractitioner getOrderedBy() {
		return orderedBy;
	}

	/**
	 * @param orderedBy
	 *            the orderedBy to set
	 */
	public void setOrderedBy(ClinicalPractitioner orderedBy) {
		this.orderedBy = orderedBy;
	}

	/**
	 * @return the orderEnteredBy
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "order_entered_by_identity")
	public Identifier getOrderEnteredBy() {
		return orderEnteredBy;
	}

	/**
	 * @param orderEnteredBy
	 *            the orderEnteredBy to set
	 */
	public void setOrderEnteredBy(Identifier orderEnteredBy) {
		this.orderEnteredBy = orderEnteredBy;
	}

	/**
	 * @return the orderTime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "order_time", length = 19)
	public Date getOrderTime() {
		return orderTime;
	}

	/**
	 * @param orderTime
	 *            the orderTime to set
	 */
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	/**
	 * @return the type
	 */
	@Column(name = "type", nullable = false, length = 50)
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the lab
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "lab_code_id")
	public Code getLab() {
		return lab;
	}

	/**
	 * @param lab
	 *            the lab to set
	 */
	public void setLab(Code lab) {
		this.lab = lab;
	}

	/**
	 * @return the medication
	 */
	@Column(name = "medication", length = 5000)
	public String getMedication() {
		return medication;
	}

	/**
	 * @param medication
	 *            the medication to set
	 */
	public void setMedication(String medication) {
		this.medication = medication;
	}

	/**
	 * @return the action
	 */
	@Column(name = "action", length = 5000)
	public String getAction() {
		return action;
	}

	/**
	 * @param action
	 *            the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * @return the details
	 */
	@Column(name = "details", length = 5000)
	public String getDetails() {
		return details;
	}

	/**
	 * @param details
	 *            the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
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
	 * @return the subject
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id", nullable = false)
	public Subject getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	/**
	 * @return the orderDetails
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "order", cascade = CascadeType.ALL)
	public Set<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	/**
	 * @param orderDetails
	 *            the orderDetails to set
	 */
	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	/**
	 * @return the provenance
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "order", cascade = CascadeType.ALL)
	public Set<Provenance> getProvenance() {
		return provenance;
	}

	/**
	 * @param provenance
	 *            the provenance to set
	 */
	public void setProvenance(Set<Provenance> provenance) {
		this.provenance = provenance;
	}

	/**
	 * @return the requirements
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "order", cascade = CascadeType.ALL)
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

}