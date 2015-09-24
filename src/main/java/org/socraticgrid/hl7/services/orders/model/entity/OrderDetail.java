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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Basit Azeem Sheikh
 */
@Entity
@Table(name = "tbl_order_detail")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class OrderDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Order order;
	private Promise orderedItem;
	private Promise promisedItem;
	private String type;
	private String additionalDosageIntructions;
	private String comment;
	private Quantity dispenseQuantity = new Quantity();
	private String dosageInstructions;
	private Code dosageMethod;
	private Quantity dosageQuantity = new Quantity();
	private Quantity dosageRateNumerator;
	private Quantity dosageRateDenominator;
	private Code dosageSite = new Code();
	private Date dosageTiming;
	private Date dosageStartTiming;
	private Date dosageEndTiming;
	private Quantity expectedSupplyDuration = new Quantity();
	private Quantity maxDosePerPeriodNumerator;
	private Quantity maxDosePerPeriodDenominator;
	private int numberOfRepeatsAllowed = 0;
	private Code prescriber;
	private Code route = new Code();
	private String schedule;
	private Date startDate;
	private Date endDate;
	private Set<Identifier> drugs = new HashSet<Identifier>(0);
	private Set<Identifier> medications = new HashSet<Identifier>(0);

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
	 * @return the order
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id", nullable = false)
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order
	 *            the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * @return the orderedItem
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ordered_item_promise_id", nullable = false)
	public Promise getOrderedItem() {
		return orderedItem;
	}

	/**
	 * @param orderedItem
	 *            the orderedItem to set
	 */
	public void setOrderedItem(Promise orderedItem) {
		this.orderedItem = orderedItem;
	}

	/**
	 * @return the promisedItem
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "promised_item_promise_id", nullable = false)
	public Promise getPromisedItem() {
		return promisedItem;
	}

	/**
	 * @param promisedItem
	 *            the promisedItem to set
	 */
	public void setPromisedItem(Promise promisedItem) {
		this.promisedItem = promisedItem;
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
	 * @return the additionalDosageIntructions
	 */
	@Column(name = "additional_dosage_instructions", length = 5000)
	public String getAdditionalDosageIntructions() {
		return additionalDosageIntructions;
	}

	/**
	 * @param additionalDosageIntructions
	 *            the additionalDosageIntructions to set
	 */
	public void setAdditionalDosageIntructions(
			String additionalDosageIntructions) {
		this.additionalDosageIntructions = additionalDosageIntructions;
	}

	/**
	 * @return the comment
	 */
	@Column(name = "comment", length = 5000)
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment
	 *            the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the dispenseQuantity
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "dispense_quantity_id")
	public Quantity getDispenseQuantity() {
		return dispenseQuantity;
	}

	/**
	 * @param dispenseQuantity
	 *            the dispenseQuantity to set
	 */
	public void setDispenseQuantity(Quantity dispenseQuantity) {
		this.dispenseQuantity = dispenseQuantity;
	}

	/**
	 * @return the dosageInstructions
	 */
	@Column(name = "dosage_instructions", length = 5000)
	public String getDosageInstructions() {
		return dosageInstructions;
	}

	/**
	 * @param dosageInstructions
	 *            the dosageInstructions to set
	 */
	public void setDosageInstructions(String dosageInstructions) {
		this.dosageInstructions = dosageInstructions;
	}

	/**
	 * @return the dosageMethod
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "dosage_method_code_id")
	public Code getDosageMethod() {
		return dosageMethod;
	}

	/**
	 * @param dosageMethod
	 *            the dosageMethod to set
	 */
	public void setDosageMethod(Code dosageMethod) {
		this.dosageMethod = dosageMethod;
	}

	/**
	 * @return the dosageQuantity
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "dosage_quantity_id")
	public Quantity getDosageQuantity() {
		return dosageQuantity;
	}

	/**
	 * @param dosageQuantity
	 *            the dosageQuantity to set
	 */
	public void setDosageQuantity(Quantity dosageQuantity) {
		this.dosageQuantity = dosageQuantity;
	}

	/**
	 * @return the dosageRateNumerator
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "dosage_rate_numerator_id")
	public Quantity getDosageRateNumerator() {
		return dosageRateNumerator;
	}

	/**
	 * @param dosageRateNumerator
	 *            the dosageRateNumerator to set
	 */
	public void setDosageRateNumerator(Quantity dosageRateNumerator) {
		this.dosageRateNumerator = dosageRateNumerator;
	}

	/**
	 * @return the dosageRateDenominator
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "dosage_rate_denominator_id")
	public Quantity getDosageRateDenominator() {
		return dosageRateDenominator;
	}

	/**
	 * @param dosageRateDenominator
	 *            the dosageRateDenominator to set
	 */
	public void setDosageRateDenominator(Quantity dosageRateDenominator) {
		this.dosageRateDenominator = dosageRateDenominator;
	}

	/**
	 * @return the dosageSite
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "dosage_site_code_id")
	public Code getDosageSite() {
		return dosageSite;
	}

	/**
	 * @param dosageSite
	 *            the dosageSite to set
	 */
	public void setDosageSite(Code dosageSite) {
		this.dosageSite = dosageSite;
	}

	/**
	 * @return the dosageTiming
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dosage_timing", length = 19)
	public Date getDosageTiming() {
		return dosageTiming;
	}

	/**
	 * @param dosageTiming
	 *            the dosageTiming to set
	 */
	public void setDosageTiming(Date dosageTiming) {
		this.dosageTiming = dosageTiming;
	}

	/**
	 * @return the dosageStartTiming
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dosage_start_timing", length = 19)
	public Date getDosageStartTiming() {
		return dosageStartTiming;
	}

	/**
	 * @param dosageStartTiming
	 *            the dosageStartTiming to set
	 */
	public void setDosageStartTiming(Date dosageStartTiming) {
		this.dosageStartTiming = dosageStartTiming;
	}

	/**
	 * @return the dosageEndTiming
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dosage_end_timing", length = 19)
	public Date getDosageEndTiming() {
		return dosageEndTiming;
	}

	/**
	 * @param dosageEndTiming
	 *            the dosageEndTiming to set
	 */
	public void setDosageEndTiming(Date dosageEndTiming) {
		this.dosageEndTiming = dosageEndTiming;
	}

	/**
	 * @return the expectedSupplyDuration
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "expected_supply_duration_id")
	public Quantity getExpectedSupplyDuration() {
		return expectedSupplyDuration;
	}

	/**
	 * @param expectedSupplyDuration
	 *            the expectedSupplyDuration to set
	 */
	public void setExpectedSupplyDuration(Quantity expectedSupplyDuration) {
		this.expectedSupplyDuration = expectedSupplyDuration;
	}

	/**
	 * @return the maxDosePerPeriodNumerator
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "max_dose_per_period_numerator_id")
	public Quantity getMaxDosePerPeriodNumerator() {
		return maxDosePerPeriodNumerator;
	}

	/**
	 * @param maxDosePerPeriodNumerator
	 *            the maxDosePerPeriodNumerator to set
	 */
	public void setMaxDosePerPeriodNumerator(Quantity maxDosePerPeriodNumerator) {
		this.maxDosePerPeriodNumerator = maxDosePerPeriodNumerator;
	}

	/**
	 * @return the maxDosePerPeriodDenominator
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "max_dose_per_period_denominator_id")
	public Quantity getMaxDosePerPeriodDenominator() {
		return maxDosePerPeriodDenominator;
	}

	/**
	 * @param maxDosePerPeriodDenominator
	 *            the maxDosePerPeriodDenominator to set
	 */
	public void setMaxDosePerPeriodDenominator(
			Quantity maxDosePerPeriodDenominator) {
		this.maxDosePerPeriodDenominator = maxDosePerPeriodDenominator;
	}

	/**
	 * @return the numberOfRepeatsAllowed
	 */
	@Column(name = "number_of_repeats_allowed")
	public int getNumberOfRepeatsAllowed() {
		return numberOfRepeatsAllowed;
	}

	/**
	 * @param numberOfRepeatsAllowed
	 *            the numberOfRepeatsAllowed to set
	 */
	public void setNumberOfRepeatsAllowed(int numberOfRepeatsAllowed) {
		this.numberOfRepeatsAllowed = numberOfRepeatsAllowed;
	}

	/**
	 * @return the prescriber
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "prescriber_code_id")
	public Code getPrescriber() {
		return prescriber;
	}

	/**
	 * @param prescriber
	 *            the prescriber to set
	 */
	public void setPrescriber(Code prescriber) {
		this.prescriber = prescriber;
	}

	/**
	 * @return the route
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "route_code_id")
	public Code getRoute() {
		return route;
	}

	/**
	 * @param route
	 *            the route to set
	 */
	public void setRoute(Code route) {
		this.route = route;
	}

	/**
	 * @return the schedule
	 */
	@Column(name = "schedule", length = 50)
	public String getSchedule() {
		return schedule;
	}

	/**
	 * @param schedule
	 *            the schedule to set
	 */
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	/**
	 * @return the startDate
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date", length = 19)
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
	@Column(name = "end_date", length = 19)
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
	 * @return the drugs
	 */
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "order_drug_identifier", joinColumns = { @JoinColumn(name = "order_drug_identifier", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "identifier_id", nullable = false, updatable = false) })
	public Set<Identifier> getDrugs() {
		return drugs;
	}

	/**
	 * @param drugs
	 *            the drugs to set
	 */
	public void setDrugs(Set<Identifier> drugs) {
		this.drugs = drugs;
	}

	/**
	 * @return the medications
	 */
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "order_medication_identifier", joinColumns = { @JoinColumn(name = "order_medication_identifier", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "identifier_id", nullable = false, updatable = false) })
	public Set<Identifier> getMedications() {
		return medications;
	}

	/**
	 * @param medications
	 *            the medications to set
	 */
	public void setMedications(Set<Identifier> medications) {
		this.medications = medications;
	}

}