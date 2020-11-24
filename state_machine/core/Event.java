package state_machine.core;

/**
 * An event that acts as a trigger for a specific transition. The event is
 * identified by a type and saves the moment it was generated.
 * 
 * @author Davide
 */
public class Event {

	private String type;
	private long time;

	public Event() {
		type = "Event";
		time = System.currentTimeMillis();
	}

	public String eventType() {
		return type;
	}

	public long generTime() {
		return time;
	}

	public Event(String type) {
		this.type = type;
		time = System.currentTimeMillis();
	}

	public String toString() {
		return "the event of the type: " + type + "is genereted on: " + time;
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
