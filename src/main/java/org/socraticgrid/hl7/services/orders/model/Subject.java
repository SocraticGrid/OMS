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

import org.socraticgrid.hl7.services.orders.model.primatives.Identifier;

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Jan-2014 9:12:42 AM
 */
public abstract class Subject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Unique identifier for the subject of the testing (the source of the specimen)
	 */
	private Identifier identity;

	/**
	 * Unique identifier for the subject of the testing (the source of the specimen)
	 */
	public Identifier getIdentity() {
		return identity;
	};

	/**
	 * Unique identifier for the subject of the testing (the source of the specimen)
	 * 
	 * @param newVal
	 */
	public void setIdentity(Identifier newVal){
		identity = newVal;
	}

}