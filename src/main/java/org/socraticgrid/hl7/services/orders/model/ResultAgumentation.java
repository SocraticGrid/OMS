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

import org.socraticgrid.hl7.services.orders.model.primatives.Code;

public class ResultAgumentation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String agumeentationWSource;
	private Code augmentationType;
	private String summaryText;
	private String detailtext;
	/**
	 * @return the agumeentationWSource
	 */
	public String getAgumeentationWSource() {
		return agumeentationWSource;
	}
	/**
	 * @param agumeentationWSource the agumeentationWSource to set
	 */
	public void setAgumeentationWSource(String agumeentationWSource) {
		this.agumeentationWSource = agumeentationWSource;
	}
	/**
	 * @return the augmentationType
	 */
	public Code getAugmentationType() {
		return augmentationType;
	}
	/**
	 * @param augmentationType the augmentationType to set
	 */
	public void setAugmentationType(Code augmentationType) {
		this.augmentationType = augmentationType;
	}
	/**
	 * @return the summaryText
	 */
	public String getSummaryText() {
		return summaryText;
	}
	/**
	 * @param summaryText the summaryText to set
	 */
	public void setSummaryText(String summaryText) {
		this.summaryText = summaryText;
	}
	/**
	 * @return the detailtext
	 */
	public String getDetailtext() {
		return detailtext;
	}
	/**
	 * @param detailtext the detailtext to set
	 */
	public void setDetailtext(String detailtext) {
		this.detailtext = detailtext;
	}
	
	
}
