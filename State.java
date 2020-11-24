package state_machine.core;

/**
 * The state the machine is in.
 * 
 * @author Davide
 *
 */
public class State {
	private String name;

	public State() {
		this.name = "State";
	}

	public State(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return name;
	}

	public int hashCode() {
		return name.hashCode();
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof State) || o == null)
			return false;

		State s = (State) o;
		if (name.equals(s.name))
			return true;
		return false;
	}
}
