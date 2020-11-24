package state_machine.test_turnstile;

import java.util.Scanner;

import state_machine.api.TransitionNotFoundException;
import state_machine.core.FiniteStateMachine;
import state_machine.core.State;
import state_machine.core.Transition;

public class test {

	public static void main(String... Args) throws TransitionNotFoundException {
		State lock= new State("lock");
		State unlock= new State("unlock");
		
		FiniteStateMachine machine = new FiniteStateMachine(lock,unlock);
		Transition unlocked=new Transition(lock,unlock,new CoinEvent());
		Transition locked=new Transition(unlock,lock,new PushEvent());
		machine.addTransition(locked);
		machine.addTransition(unlocked);
		
		
        System.out.println("Turnstile initial state : " + machine.currentState());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which event do you want to fire?");
        System.out.println("1. Push [p]");
        System.out.println("2. Coin [c]");
        System.out.println("Press [q] to quit tutorial.");
        
		
		while(true) {
            String input = scanner.nextLine();
            if (input.trim().equalsIgnoreCase("p")) {
                System.out.println("input = " + input.trim());
                System.out.println("Firing push event..");
                machine.change(new CoinEvent());
                System.out.println("Turnstile state : " + machine.currentState());
            }
            if (input.trim().equalsIgnoreCase("c")) {
                System.out.println("input = " + input.trim());
                System.out.println("Firing coin event..");
                machine.change(new PushEvent());
                System.out.println("Turnstile state : " + machine.currentState());
            }
            if (input.trim().equalsIgnoreCase("q")) {
                System.out.println("input = " + input.trim());
                System.out.println("Bye!");
                System.exit(0);
            }
		}
	}
}
