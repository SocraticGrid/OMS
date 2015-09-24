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

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Jan-2014 9:12:41 AM
 */
public class OrderReason extends Provenance implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String backtraceInformation;
	private Text reasoning;
	private String reasoninyEntity;
	private ReasoningEntityType reasoninyEntityType;


	public String getBacktraceInformation(){
		return backtraceInformation;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setBacktraceInformation(String newVal){
		backtraceInformation = newVal;
	}

	public Text getReasoning(){
		return reasoning;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setReasoning(Text newVal){
		reasoning = newVal;
	}

	public String getReasoninyEntity(){
		return reasoninyEntity;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setReasoninyEntity(String newVal){
		reasoninyEntity = newVal;
	}

	public ReasoningEntityType getReasoninyEntityType(){
		return reasoninyEntityType;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setReasoninyEntityType(ReasoningEntityType newVal){
		reasoninyEntityType = newVal;
	}

}