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

import org.socraticgrid.hl7.services.orders.model.primatives.Code;
import org.socraticgrid.hl7.services.orders.model.primatives.Quantity;

/**
 * The result details, qualitative and quantative measurements.
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Jan-2014 9:12:42 AM
 */
public class ResultDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Measurements made and documented using codes and interpretion.
	 */
	private Code qualitativeMeasurement;
	/**
	 * Measurements which are numeric/units based.
	 */
	private Quantity quantitativeMeasurement;
	/**
	 * Descriptive text about the result.
	 */
	private String descriptive;



	/**
	 * Measurements which are numeric/units based.
	 */
	public Quantity getQuantitativeMeasurement(){
		return quantitativeMeasurement;
	}

	/**
	 * Measurements which are numeric/units based.
	 * 
	 * @param newVal
	 */
	public void setQuantitativeMeasurement(Quantity newVal){
		quantitativeMeasurement = newVal;
	}

	/**
	 * Descriptive text about the result.
	 */
	public String getDescriptive(){
		return descriptive;
	}

	/**
	 * Measurements made and documented using codes and interpretion.
	 */
	public Code getQualitativeMeasurement(){
		return qualitativeMeasurement;
	}

	/**
	 * Descriptive text about the result.
	 * 
	 * @param newVal
	 */
	public void setDescriptive(String newVal){
		descriptive = newVal;
	}

	/**
	 * Measurements made and documented using codes and interpretion.
	 * 
	 * @param newVal
	 */
	public void setQualitativeMeasurement(Code newVal){
		qualitativeMeasurement = newVal;
	}

}

