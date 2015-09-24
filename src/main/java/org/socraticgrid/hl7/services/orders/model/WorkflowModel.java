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

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

import org.socraticgrid.hl7.services.orders.model.workflows.StaticWorkflow;



public class WorkflowModel<T extends Workflow>  implements Serializable {
private static final long serialVersionUID = 1L;
	
	
	@XmlElements(value = { 
            @XmlElement(name="static", 
                        type=StaticWorkflow.class)
        
    })
	private T workflow;
	
	public T getType() {
		return workflow;
	}
	public void setType(T workflow) {
		this.workflow = workflow;
	}
	
	
	public WorkflowModel()
	{
		
	}
	
	public WorkflowModel(T workflow)
	{
		this.workflow = workflow;
	}

}
