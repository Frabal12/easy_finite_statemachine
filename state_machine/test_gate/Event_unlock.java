package state_machine.test_gate;

import state_machine.core.Event;

public class Event_unlock extends Event {

	public Event_unlock() {
		super("Event_unlock");
	}

	protected Event_unlock(String name) {
		super(name);
	}
}
