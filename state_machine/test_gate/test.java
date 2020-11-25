package state_machine.test_gate;

import java.util.Scanner;

import state_machine.api.TransitionNotFoundException;
import state_machine.core.FiniteStateMachine;
import state_machine.core.State;
import state_machine.core.Transition;

public class test {

	public static void main(String... Args) throws TransitionNotFoundException {
		State lock = new State("lock");
		State unlock = new State("unlock");
		String input = "";

		FiniteStateMachine machine = new FiniteStateMachine(lock, unlock);
		Transition unlocked = new Transition(lock, unlock, new Event_unlock());
		Transition locked = new Transition(unlock, lock, new Event_lock());
		machine.addTransition(locked);
		machine.addTransition(unlocked);
		System.out.println("gate initial state : " + machine.currentState());

		Scanner scanner = new Scanner(System.in);
		System.out.println("do you want to open or close the gate?");
		System.out.println("1. open -> o");
		System.out.println("2. close -> c");
		System.out.println("Press q to quit.");

		while (input != "q") {
			input = scanner.nextLine();
			if (input.equals("o")) {

				Event_unlock event_unlock = (new Event_unlock());
				System.out.println(event_unlock.toString());
				if (machine.isCurrentState(lock))System.out.println("unlocking the gate...");
				else if (machine.isCurrentState(unlock))System.out.println("the gate is already unlocked.");
				machine.change(event_unlock);

				System.out.println("gate state : " + machine.currentState());
			}
			if (input.equals("c")) {

				Event_lock event_lock = (new Event_lock());
				System.out.println(event_lock.toString());
				if (machine.isCurrentState(unlock))System.out.println("locking the gate...");
				else if (machine.isCurrentState(lock))System.out.println("the gate is already locked.");
				machine.change(event_lock);
				System.out.println("Turnstile state : " + machine.currentState());
			}
			if (input.equals("q")) {
				System.out.println("end of program");
				System.exit(0);
			}
		}
		scanner.close();

	}
}
