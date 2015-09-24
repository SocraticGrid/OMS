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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

import org.socraticgrid.hl7.services.orders.model.types.order.LabOrder;
import org.socraticgrid.hl7.services.orders.model.types.order.MedicationOrder;
import org.socraticgrid.hl7.services.orders.model.types.order.NursingOrder;
import org.socraticgrid.hl7.services.orders.model.types.order.NutritionOrder;


@XmlAccessorType(XmlAccessType.FIELD)

public class OrderModel<T extends Order>  implements Serializable {
private static final long serialVersionUID = 1L;
	
	
	@XmlElements(value = { 
            @XmlElement(name="lab", 
                        type=LabOrder.class),
            @XmlElement(name="medication", 
                        type=MedicationOrder.class),
            @XmlElement(name="nursing", 
                        type=NursingOrder.class),
            @XmlElement(name="nutrition",
            	type=NutritionOrder.class)
    })
	private T orderType;
	
	public T getType() {
		return orderType;
	}
	public void setType(T orderType) {
		this.orderType = orderType;
	}
	
	
	public OrderModel()
	{
		
	}
	
	public OrderModel(T orderType)
	{
		this.orderType = orderType;
	}
}
