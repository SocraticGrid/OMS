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
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.socraticgrid.hl7.services.orders.model.primatives.Code;
import org.socraticgrid.hl7.services.orders.model.primatives.Identifier;

/**
 * The source of the specimen being tested by a laboratory.  Subject is used, esp.
 * for public health as not all lab tests are done for 'patients'.
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Jan-2014 9:12:41 AM
 */
public class Patient extends Subject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Identifier> suplementalIdentifiers=new LinkedList<Identifier>();
	
	/**
	 * Name of the subject (source of the specimen)
	 */
	private String name;
	/**
	 * Subject's date of birth.  Used as confirming information.
	 */
	private Date dateOfBirth;
	/**
	 * Values for the status attribute are taken from the concept domain
	 * AdministrativeGender
	 */
	private Code gender;

	/**
	 * Subject's date of birth.  Used as confirming information.
	 */
	public Date getDateOfBirth(){
		return dateOfBirth;
	}

	/**
	 * Subject's date of birth.  Used as confirming information.
	 * 
	 * @param newVal
	 */
	public void setDateOfBirth(Date newVal){
		dateOfBirth = newVal;
	}


	/**
	 * Name of the subject (source of the specimen)
	 */
	public String getName(){
		return name;
	}

	/**
	 * Name of the subject (source of the specimen)
	 * 
	 * @param newVal
	 */
	public void setName(String newVal){
		name = newVal;
	}

	/**
	 * Values for the status attribute are taken from the concept domain
	 * AdministrativeGender
	 */
	public Code getGender(){
		return gender;
	}

	/**
	 * Values for the status attribute are taken from the concept domain
	 * AdministrativeGender
	 * 
	 * @param newVal
	 */
	public void setGender(Code newVal){
		gender = newVal;
	}

	/**
	 * @return the suplementalIdentifiers
	 */
	public List<Identifier> getSuplementalIdentifiers() {
		return suplementalIdentifiers;
	}

	/**
	 * @param suplementalIdentifiers the suplementalIdentifiers to set
	 */
	public void setSuplementalIdentifiers(List<Identifier> suplementalIdentifiers) {
		this.suplementalIdentifiers = suplementalIdentifiers;
	}

}