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

import org.socraticgrid.hl7.services.orders.model.CatalogItem;
import org.socraticgrid.hl7.services.orders.model.CatalogItemTree;
import org.socraticgrid.hl7.services.orders.model.CatalogItemType;
import org.socraticgrid.hl7.services.orders.model.Order;
import org.socraticgrid.hl7.services.orders.model.OrderModel;
import org.socraticgrid.hl7.services.orders.model.primatives.Identifier;

/**
 * Interface to query and navigate the order catalog.
 * 
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Jan-2014 9:12:41 AM
 */
@WebService(name = "ordercatalogquery", targetNamespace = "org.socraticgrid.hl7.services.orders")
public interface OrderCatalogQueryIFace {

	public CatalogItem getItemDetail(
			@WebParam(name = "itemId") Identifier itemId);

	public <T extends Order> OrderModel<T> getItemPrototype(
			@WebParam(name = "itemId") Identifier itemId);

	public List<CatalogItemType> queryItemTypes(
			@WebParam(name = "query") String query);

	public CatalogItemTree queryItemTree(
			@WebParam(name = "itemId") Identifier itemId);

}