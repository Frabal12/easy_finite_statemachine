
package state_machine.core;

import java.util.ArrayList;

import state_machine.api.AbstractStateMachine;
import state_machine.api.TransitionNotFoundException;

public class FiniteStateMachine extends AbstractStateMachine {

	/**
	 * A Finite-state machine. The states argument must be an array of states, the
	 * first state of the array being the initial state of the machine.
	 * 
	 * @param states
	 * @author Davide
	 */
	public FiniteStateMachine(State... states) {
		this.states = new ArrayList<State>();
		for (int i = 0; i < states.length; i++)
			this.states.add(states[i]);
		transitions = new ArrayList<Transition>();
		currentState = states[0];
	}

	public State currentState() {
		return currentState;
	}

	public void change(Event event) throws TransitionNotFoundException {
		for (Transition t : transitions) {
			if (t.associatedEvent().equals(event)) {
				if (currentState.equals(t.getFirstState()))
					currentState = t.getSecondtState();
				return;
			}
		}
		throw new TransitionNotFoundException();
	}

	public void addTransition(Transition transition) {
		if (!transitions.contains(transition))
			transitions.add(transition);
	}

	public void addState(State state) {
		if (!states.contains(state))
			states.add(state);
	}

	public boolean isCurrentState(State state) {
		if (state.equals(currentState))
			return true;
		return false;
	}
}
