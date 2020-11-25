package state_machine.core;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * An event that acts as a trigger for a specific transition. The event is
 * identified by a type and saves the moment it was generated.
 * 
 * @author Davide
 */
public class Event {

	private String type;
	private Date time;
	private GregorianCalendar calendar = new GregorianCalendar();

	public Event() {
		type = "Event";
		time = calendar.getTime();
	}

	public String eventType() {
		return type;
	}

	public Date generTime() {
		return time;
	}

	public Event(String type) {
		this.type = type;
		time = calendar.getTime();
	}

	public String toString() {
		return "the event of the type: [" + type + "] is generated on: " + time;
	}

	public int hashCode() {
		return this.type.hashCode();
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Event) || o == null)
			return false;

		Event e = (Event) o;
		if (type.equals(e.type))
			return true;
		return false;
	}

}
