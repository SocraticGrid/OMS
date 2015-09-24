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
package org.socraticgrid.hl7.services.orders.logging;


public class LogEntryLevels {
	EventLevel minLevel;
	EventLevel maxLevel;
	
	public LogEntryLevels ()
	{
		
	}
	
	public LogEntryLevels (EventLevel min, EventLevel max)
	{
		this.maxLevel=max;
		this.minLevel=min;
	}

	/**
	 * @return the minLevel
	 */
	public EventLevel getMinLevel() {
		return minLevel;
	}

	/**
	 * @param minLevel the minLevel to set
	 */
	public void setMinLevel(EventLevel minLevel) {
		this.minLevel = minLevel;
	}

	/**
	 * @return the maxLevel
	 */
	public EventLevel getMaxLevel() {
		return maxLevel;
	}

	/**
	 * @param maxLevel the maxLevel to set
	 */
	public void setMaxLevel(EventLevel maxLevel) {
		this.maxLevel = maxLevel;
	}
	
}
