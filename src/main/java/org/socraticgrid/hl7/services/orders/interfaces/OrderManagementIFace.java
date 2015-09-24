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

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.socraticgrid.hl7.services.orders.exceptions.OrderingException;
import org.socraticgrid.hl7.services.orders.model.Order;
import org.socraticgrid.hl7.services.orders.model.OrderModel;
import org.socraticgrid.hl7.services.orders.model.OrderSummary;
import org.socraticgrid.hl7.services.orders.model.Result;
import org.socraticgrid.hl7.services.orders.model.ResultAgumentation;
import org.socraticgrid.hl7.services.orders.model.Subject;
import org.socraticgrid.hl7.services.orders.model.operationresults.CancelOrderResult;
import org.socraticgrid.hl7.services.orders.model.operationresults.ChangeOrderResult;
import org.socraticgrid.hl7.services.orders.model.operationresults.CreateOrderResult;
import org.socraticgrid.hl7.services.orders.model.primatives.Identifier;

/**
 * General Interface to create and manage orders.
 * 
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Jan-2014 9:12:41 AM
 */
@WebService(name = "ordermanagement", targetNamespace = "org.socraticgrid.hl7.services.orders")
public interface OrderManagementIFace {

	@WebMethod
	public CancelOrderResult cancelOrderById(
			@WebParam(name = "orderId") Identifier orderId)
			throws OrderingException;

	@WebMethod
	public <T extends Order> CancelOrderResult cancelOrder(
			@WebParam(name = "order") OrderModel<T> order)
			throws OrderingException;

	@WebMethod
	public <T extends Order> ChangeOrderResult changeOrder(
			@WebParam(name = "orderId") Identifier orderId,
			@WebParam(name = "order") OrderModel<T> order)
			throws OrderingException;

	@WebMethod
	public <T extends Order> CreateOrderResult createOrder(
			@WebParam(name = "order") OrderModel<T> order)
			throws OrderingException;

	@WebMethod
	public List<OrderSummary> queryOrders(
			@WebParam(name = "subject") Subject subject);

	@WebMethod
	public OrderModel<? extends Order> retrieveOrder(
			@WebParam(name = "orderId") Identifier orderId);

	@WebMethod
	public List<Result> retrieveResults(
			@WebParam(name = "resultId") Identifier resultId) throws OrderingException;

	@WebMethod
	public List<ResultAgumentation> getResultAgumentatons(
			@WebParam(name = "resultId") Identifier resultId);

}