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

import javax.jws.WebParam;
import javax.jws.WebService;

import org.socraticgrid.hl7.services.orders.model.CatalogItem;
import org.socraticgrid.hl7.services.orders.model.primatives.Identifier;
import org.socraticgrid.hl7.services.orders.model.status.UpdateStatus;

/**
 * Interface to query and navigate the order catalog.
 * 
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Jan-2014 9:12:41 AM
 */
@WebService(name = "ordercatalogmanagement", targetNamespace = "org.socraticgrid.hl7.services.orders")
public interface OrderCatalogManagementIFace {

	public CatalogItem getCatalogItem(
			@WebParam(name = "itemId") Identifier itemId);

	public UpdateStatus updateCatalogItem(
			@WebParam(name = "catalogItem") CatalogItem catalogItem);

	public UpdateStatus deleteCatalogItem(
			@WebParam(name = "itemId") Identifier itemId);

	public UpdateStatus createCatalogItem(
			@WebParam(name = "catalogItem") CatalogItem catalogItem);

}