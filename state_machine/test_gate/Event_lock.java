package state_machine.test_gate;

import state_machine.core.Event;

public class Event_lock extends Event {

	public Event_lock() {
		super("Event_lock");
	}

	protected Event_lock(String name) {
		super(name);
	}

}