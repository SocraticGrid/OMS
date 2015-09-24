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
import org.socraticgrid.hl7.services.orders.model.primatives.Identifier;

/**
 * This class is used to communicate the business status of the result.  Normal
 * values include preliminary, final, corrected.
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Jan-2014 9:12:41 AM
 */
public class ReportingStatus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Unique identifier for this instantiation of the documentation of diagnostic lab
	 * results.
	 */
	private Identifier resultIdentity;
	/**
	 * Values for the status attribute are taken from the concept domain ActStatus
	 */
	private Code status;

	/**
	 * Unique identifier for this instantiation of the documentation of diagnostic lab
	 * results.
	 */
	public Identifier getResultIdentity(){
		return resultIdentity;
	}

	/**
	 * Unique identifier for this instantiation of the documentation of diagnostic lab
	 * results.
	 * 
	 * @param newVal
	 */
	public void setResultIdentity(Identifier newVal){
		resultIdentity = newVal;
	}

	/**
	 * Values for the status attribute are taken from the concept domain ActStatus
	 */
	public Code getStatus(){
		return status;
	}

	/**
	 * Values for the status attribute are taken from the concept domain ActStatus
	 * 
	 * @param newVal
	 */
	public void setStatus(Code newVal){
		status = newVal;
	}

}