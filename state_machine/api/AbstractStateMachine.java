package state_machine.api;

import java.util.List;

import state_machine.core.Event;
import state_machine.core.State;
import state_machine.core.Transition;

/**
 * An abstract class that defines a generic state machine.
 * 
 * @param states
 * @author Davide
 */

public abstract class AbstractStateMachine {
	protected List<State> states;
	protected List<Transition> transitions;
	protected State currentState;

	/**
	 * Returns the current state of the machine.
	 * 
	 * @return currentState
	 */
	public abstract State currentState();

	/**
	 * Changes the state of the machine based on a specific event.
	 * 
	 * @param event
	 * @throws TransitionException
	 */
	public abstract void change(Event event) throws TransitionNotFoundException;

	/**
	 * Adds a transition to the machine if not already present.
	 * 
	 * @param transition
	 */
	public abstract void addTransition(Transition transition);
	
	/**
	 * Adds a state to the machine if not already present.
	 * 
	 * @param state
	 */
	public abstract void addState(State state);

	/**
	 * Checks if a state given as a parameter is the current one.
	 * 
	 * @param state
	 * @return boolean
	 */
	public abstract boolean isCurrentState(State state);
}
