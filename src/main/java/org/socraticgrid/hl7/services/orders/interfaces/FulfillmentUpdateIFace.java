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
package org.socraticgrid.hl7.services.orders.interfaces;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.socraticgrid.hl7.services.orders.model.Order;
import org.socraticgrid.hl7.services.orders.model.OrderModel;
import org.socraticgrid.hl7.services.orders.model.Result;
import org.socraticgrid.hl7.services.orders.model.ResultAgumentation;
import org.socraticgrid.hl7.services.orders.model.primatives.Code;
import org.socraticgrid.hl7.services.orders.model.primatives.Identifier;
import org.socraticgrid.hl7.services.orders.model.status.UpdateStatus;

/**
 * Used by workflow and fulfillment systems to update order processing.
 * 
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Jan-2014 9:12:40 AM
 */
@WebService(name = "fulfillmentupdate", targetNamespace = "org.socraticgrid.hl7.services.orders")
public interface FulfillmentUpdateIFace {

	public <T extends Order> boolean proposeOrderReplacement(
			@WebParam(name = "orderId") Identifier orderIdentifier,
			@WebParam(name = "order") OrderModel<T> order);

	public boolean submitResultAgmentation(
			@WebParam(name = "orderId") Identifier resultIdentifier,
			@WebParam(name = "agumentations") List<ResultAgumentation> agumentations);

	public UpdateStatus updateOrderStatus(
			@WebParam(name = "orderId") Identifier orderIdentifier,
			@WebParam(name = "status") Code status);

	public UpdateStatus updateResult(
			@WebParam(name = "orderId") Identifier orderIdentifier,
			@WebParam(name = "result") Result result);

	public UpdateStatus updateResultStatus(
			@WebParam(name = "orderId") Identifier resultIdentifier,
			@WebParam(name = "status") Code status);

}