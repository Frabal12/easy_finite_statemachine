package state_machine.api;

/**
 * Exception raised if the requested transaction is not found on the state
 * machine .
 * 
 * @author Davide
 */
public class TransitionNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3192788721151974052L;

	public TransitionNotFoundException(String message) {
		super(message);
	}

	public TransitionNotFoundException() {
	}

}
