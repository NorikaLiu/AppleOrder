import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class People {
	
	
	public static void main (String[] args) {
		Scanner scnr = new Scanner(System.in);
		Queue<Order> line = new LinkedList<Order>();
		int counter = 0;
		System.out.println("What is your name ");
		String Personorder = scnr.next();
		System.out.println ("What type of apple will you like? Red or Green "); 
		String AppleName = scnr.next();
		System.out.println ("How long does it take?  1, 2, 3, 4, 5 "); 
		int AppleTime = scnr.nextInt();
		Order appl = new Order(Personorder, AppleTime, AppleName);
		line.add(appl);
		counter++;
		int time = 0;
		while (counter > 0 ) {
			System.out.println("Current Order: " + line.element().getNames() + "'s " + line.element().getApples() + " apple");
			System.out.print("Any more orders? Y or N");
			String decision = scnr.next();
			if (decision.equals("y")) {
				System.out.println("What is your name ");
				Personorder = scnr.next();
				System.out.println ("What type of apple will you like? "); 
				AppleName = scnr.next();
				System.out.println ("How long in the oven? (hours) 1, 2, 3, 4, 5 "); 
				AppleTime = scnr.nextInt();
				Order ap = new Order(Personorder, AppleTime, AppleName);
				line.add(ap);
				counter++;
			} 
			if  (line.element().getYear() == time ) {
				System.out.println("Order done: " + line.element().getNames() + "'s " + line.element().getApples() + " apple");
				line.remove();
				counter--;
				time = 0;
			} else {
				System.out.println("Waitime left: " + (line.element().getYear() - time));
			}
			time++;
	
		}
		System.out.println("No more Orders.");


	}

	
}
