package state_machine.core;

public class Transition {

	private State[] states = new State[2];
	private Event event;

	/**
	 * A transition for two states, identified by a specific event.
	 * 
	 * @param state1
	 * @param state2
	 * @param event
	 * @author Davide
	 */
	public Transition(State state1, State state2, Event event) {
		states[0] = state1;
		states[1] = state2;
		this.event = event;
	}

	/**
	 * Returns the first state of the transition. Identified by the first element of
	 * a states' pair.
	 * 
	 * @return states[0]
	 */
	public State getFirstState() {
		return states[0];
	}

	/**
	 * Returns the second state of the transition. Identified by the second element
	 * of a states' pair.
	 * 
	 * @return states[1]
	 */
	public State getSecondtState() {
		return states[1];
	}

	/**
	 * Returns the event to which the transition is associated.
	 * 
	 * @return event
	 */
	public Event associatedEvent() {
		return event;
	}

	public String toString() {
		return "transition from: " + states[0].toString() + "to: " + states[1].toString() + "for the event: "
				+ event.toString();
	}

}
