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
package org.socraticgrid.hl7.services.orders.model.operationresults;

import java.io.Serializable;

import org.socraticgrid.hl7.services.orders.model.primatives.Identifier;
import org.socraticgrid.hl7.services.orders.model.status.CancellationStatus;

public class CancelOrderResult implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CancellationStatus status;
	private Identifier orderIdentity;

	/**
	 * @return the status
	 */
	public CancellationStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(CancellationStatus status) {
		this.status = status;
	}

	/**
	 * @return the orderIdentity
	 */
	public Identifier getOrderIdentity() {
		return orderIdentity;
	}

	/**
	 * @param orderIdentity the orderIdentity to set
	 */
	public void setOrderIdentity(Identifier orderIdentity) {
		this.orderIdentity = orderIdentity;
	}
	
}
