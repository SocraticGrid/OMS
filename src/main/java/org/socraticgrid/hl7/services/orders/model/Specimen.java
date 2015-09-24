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

/**
 * A material sample obtained from a biological or a physical entity, or the
 * environment, for the purposes of diagnostic and environmental testing.
 * Specimens are a common source of analytes.
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Jan-2014 9:12:42 AM
 */
public class Specimen extends AnalyzableEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Code specimenType;

	/**
	 * @return the specimenType
	 */
	public Code getSpecimenType() {
		return specimenType;
	}

	/**
	 * @param specimenType the specimenType to set
	 */
	public void setSpecimenType(Code specimenType) {
		this.specimenType = specimenType;
	}
}