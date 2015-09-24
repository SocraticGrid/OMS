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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author Basit Azeem Sheikh
 */
@Entity
@Table(name = "tbl_Identifier")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class Identifier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String value;
	private String use;
	private String label;
	private String system;
	private Date startDate;
	private Date endDate;
	private Set<OrderDetail> orderDrugs = new HashSet<OrderDetail>(0);
	private Set<OrderDetail> orderMedications = new HashSet<OrderDetail>(0);

	public Identifier() {
	}

	public Identifier(Long id, String value, String use, String label,
			String system, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.value = value;
		this.use = use;
		this.label = label;
		this.system = system;
		this.startDate = startDate;
		this.endDate = endDate;
	}

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
	 * @return the value
	 */
	@Column(name = "identity_value", nullable = false, length = 100, unique = true)
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	@XmlElement
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the use
	 */
	@Column(name = "identity_use", length = 5000)
	public String getUse() {
		return use;
	}

	/**
	 * @param use
	 *            the use to set
	 */
	@XmlElement
	public void setUse(String use) {
		this.use = use;
	}

	/**
	 * @return the label
	 */
	@Column(name = "identity_label", length = 500)
	public String getLabel() {
		return label;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	@XmlElement
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the system
	 */
	@Column(name = "identity_system", length = 100)
	public String getSystem() {
		return system;
	}

	/**
	 * @param system
	 *            the system to set
	 */
	@XmlElement
	public void setSystem(String system) {
		this.system = system;
	}

	/**
	 * @return the startDate
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date", nullable = false, length = 19)
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date", nullable = false, length = 19)
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the orderDrugs
	 */
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "drugs")
	public Set<OrderDetail> getOrderDrugs() {
		return orderDrugs;
	}

	/**
	 * @param orderDrugs
	 *            the orderDrugs to set
	 */
	public void setOrderDrugs(Set<OrderDetail> orderDrugs) {
		this.orderDrugs = orderDrugs;
	}

	/**
	 * @return the orderMedications
	 */
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "medications")
	public Set<OrderDetail> getOrderMedications() {
		return orderMedications;
	}

	/**
	 * @param orderMedications
	 *            the orderMedications to set
	 */
	public void setOrderMedications(Set<OrderDetail> orderMedications) {
		this.orderMedications = orderMedications;
	}

}