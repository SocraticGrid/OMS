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
package org.socraticgrid.hl7.services.orders.model.mapper;

import org.socraticgrid.hl7.services.orders.model.entity.ClinicalPractitioner;
import org.socraticgrid.hl7.services.orders.model.entity.Code;
import org.socraticgrid.hl7.services.orders.model.entity.Identifier;
import org.socraticgrid.hl7.services.orders.model.entity.Quantity;
import org.socraticgrid.hl7.services.orders.model.primatives.Period;

/**
 * @author Basit Azeem Sheikh
 */
public class ModelEntityMapper {
	// To avoid Instantiation
	private ModelEntityMapper() {
		// Do Nothing
	}

	public static Identifier getIdentifierEntity(
			org.socraticgrid.hl7.services.orders.model.primatives.Identifier identifierModel) {
		Identifier identifierEntity = new Identifier();
		if (identifierModel != null) {
			identifierEntity.setValue(identifierModel.getValue());
			identifierEntity.setLabel(identifierModel.getLabel());
			identifierEntity.setSystem(identifierModel.getSystem());
			identifierEntity.setUse(identifierModel.getUse());
			identifierEntity.setStartDate(identifierModel.getPeriod()
					.getStart());
			identifierEntity.setEndDate(identifierModel.getPeriod().getEnd());
		}
		return identifierEntity;
	}

	public static org.socraticgrid.hl7.services.orders.model.primatives.Identifier getIdentifierModel(
			Identifier identifierEntity) {
		org.socraticgrid.hl7.services.orders.model.primatives.Identifier identifierModel = new org.socraticgrid.hl7.services.orders.model.primatives.Identifier();
		if (identifierEntity != null) {
			identifierModel.setValue(identifierEntity.getValue());
			identifierModel.setLabel(identifierEntity.getLabel());
			identifierModel.setSystem(identifierEntity.getSystem());
			identifierModel.setUse(identifierEntity.getUse());
			identifierModel.setPeriod(new Period(identifierEntity
					.getStartDate(), identifierEntity.getEndDate()));
		}
		return identifierModel;
	}

	public static Code getCodeEntity(
			org.socraticgrid.hl7.services.orders.model.primatives.Code codeModel) {
		Code codeEntity = new Code();
		if (codeModel != null) {
			codeEntity.setCode(codeModel.getCode());
			codeEntity.setCodeSystem(codeModel.getCodeSystem());
			codeEntity.setLabel(codeModel.getLabel());
			codeEntity.setText(codeModel.getText());
		}
		return codeEntity;
	}

	public static org.socraticgrid.hl7.services.orders.model.primatives.Code getCodeModel(
			Code codeEntity) {
		org.socraticgrid.hl7.services.orders.model.primatives.Code codeModel = new org.socraticgrid.hl7.services.orders.model.primatives.Code();
		if (codeEntity != null) {
			codeModel.setCode(codeEntity.getCode());
			codeModel.setCodeSystem(codeEntity.getCodeSystem());
			codeModel.setLabel(codeEntity.getLabel());
			codeModel.setText(codeEntity.getText());
		}
		return codeModel;
	}
	
	public static Quantity getQuantityEntity(org.socraticgrid.hl7.services.orders.model.primatives.Quantity quantityModel) {
		Quantity quantityEntity = new Quantity();
		if(quantityModel!=null) {
			quantityEntity.setCode(quantityModel.getCode());
			quantityEntity.setComparator(quantityModel.getComparator());
			quantityEntity.setSystem(quantityModel.getSystem());
			quantityEntity.setUnits(quantityModel.getUnits());
			quantityEntity.setValue(quantityModel.getValue());
		}
		return quantityEntity;
	}
	
	public static org.socraticgrid.hl7.services.orders.model.primatives.Quantity getQuantityModel(Quantity quantityEntity) {
		org.socraticgrid.hl7.services.orders.model.primatives.Quantity quantityModel = new org.socraticgrid.hl7.services.orders.model.primatives.Quantity();
		if(quantityEntity!=null) {
			quantityModel.setCode(quantityEntity.getCode());
			quantityModel.setComparator(quantityEntity.getComparator());
			quantityModel.setSystem(quantityEntity.getSystem());
			quantityModel.setUnits(quantityEntity.getUnits());
			quantityModel.setValue(quantityEntity.getValue());
		}
		return quantityModel;
	}

	public static ClinicalPractitioner getClinicalPractitionerEntity(
			org.socraticgrid.hl7.services.orders.model.ClinicalPractitioner clinicalPractitionerModel) {
		ClinicalPractitioner clinicalPractitionerEntity = new ClinicalPractitioner();
		if (clinicalPractitionerModel != null) {
			clinicalPractitionerEntity
					.setIdentity(getIdentifierEntity(clinicalPractitionerModel
							.getId()));
			clinicalPractitionerEntity.setName(clinicalPractitionerModel
					.getName());
		}
		return clinicalPractitionerEntity;
	}

	public static org.socraticgrid.hl7.services.orders.model.ClinicalPractitioner getClinicalPractitionerModel(
			ClinicalPractitioner clinicalPractitionerEntity) {
		org.socraticgrid.hl7.services.orders.model.ClinicalPractitioner clinicalPractitionerModel = new org.socraticgrid.hl7.services.orders.model.ClinicalPractitioner();
		if (clinicalPractitionerEntity != null) {
			clinicalPractitionerModel
					.setId(getIdentifierModel(clinicalPractitionerEntity
							.getIdentity()));
			clinicalPractitionerModel.setName(clinicalPractitionerModel
					.getName());
		}
		return clinicalPractitionerModel;
	}

}