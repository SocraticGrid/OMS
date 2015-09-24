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

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 16-Dec-2013 3:54:56 PM
 */
public class LogEntry implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date when;
	private LogEntryType type;
	private EventLevel eventLevel;
	private String event;
	private String eventText;
	private String context;
	private String user;

	public LogEntry(){
		when = new Date(System.currentTimeMillis());
		type = LogEntryType.General;
		
	}


	public java.util.Date getWhen()
	{
		return when;
	}

	public void setWhen(java.util.Date when)
	{
		this.when = when;
	}

	public LogEntryType getType()
	{
		return type;
	}

	public void setType(LogEntryType type)
	{
		this.type = type;
	}

	public String getEvent()
	{
		return event;
	}

	public void setEvent(String event)
	{
		this.event = event;
	}

	public String getEventText()
	{
		return eventText;
	}

	public void setEventText(String eventText)
	{
		this.eventText = eventText;
	}

	public String getContext()
	{
		return context;
	}

	public void setContext(String context)
	{
		this.context = context;
	}


	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}


	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}


	/**
	 * @return the eventLevel
	 */
	public EventLevel getEventLevel() {
		return eventLevel;
	}


	/**
	 * @param eventLevel the eventLevel to set
	 */
	public void setEventLevel(EventLevel eventLevel) {
		this.eventLevel = eventLevel;
	}

}