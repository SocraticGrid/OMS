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
package org.socraticgrid.hl7.services.orders.model.primatives;

public class Ratio {

	Quantity numerator = new Quantity();
	Quantity demoninator = new Quantity();

	public Ratio() {
	}

	public Ratio(Quantity numerator, Quantity demoninator) {
		super();
		this.numerator = numerator;
		this.demoninator = demoninator;
	}

	/**
	 * @return the numerator
	 */
	public Quantity getNumerator() {
		return numerator;
	}

	/**
	 * @param numerator
	 *            the numerator to set
	 */
	public void setNumerator(Quantity numerator) {
		this.numerator = numerator;
	}

	/**
	 * @return the demoninator
	 */
	public Quantity getDemoninator() {
		return demoninator;
	}

	/**
	 * @param demoninator
	 *            the demoninator to set
	 */
	public void setDemoninator(Quantity demoninator) {
		this.demoninator = demoninator;
	}

}
