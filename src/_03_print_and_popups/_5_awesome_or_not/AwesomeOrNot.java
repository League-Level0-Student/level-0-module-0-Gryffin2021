package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {
	
	// 1. Make a main method that includes everything below
	public static void main(String[] args) {
		
	
	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
		int rng =0;
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
		rng = ran.nextInt(4);
		// 3. Print your variable to the console
		System.out.println(rng);
		// 4. Get the user to enter something that they think is awesome
		String input = JOptionPane.showInputDialog("What do you think is awesome?");
		// 5. If your variable is  0
		if(rng == 0) {
			
			JOptionPane.showMessageDialog(null, "That is AWESOME!");
			}
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
if(rng == 1) {
			
			JOptionPane.showMessageDialog(null, "That is ok.");
			}
			// -- tell the user whatever they entered is ok.
if(rng == 2) {
	
	JOptionPane.showMessageDialog(null, "That is boring.");
	}
		// 7. If your variable is  2
	
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
if(rng == 3) {
	
	JOptionPane.showMessageDialog(null, "That sucks you stupid pleb!");
	}
			// -- invent your own message to give to the user (be mean).
	}
}
