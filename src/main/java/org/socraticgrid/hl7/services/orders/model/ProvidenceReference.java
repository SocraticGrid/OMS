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

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Jan-2014 9:12:41 AM
 */
public class ProvidenceReference extends Provenance {

	private String reference;
	private int orderCatelogId;

	public ProvidenceReference(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public String getReference(){
		return reference;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setReference(String newVal){
		reference = newVal;
	}

	public int getOrderCatelogId(){
		return orderCatelogId;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setOrderCatelogId(int newVal){
		orderCatelogId = newVal;
	}

}