package demoInherrit2;

import java.util.Scanner;

public class UseParty2 {

	public static void main(String[] args) {
		int guests;
		int choice;
		
		Party1 aParty = new Party1();
		DinnerParty2 aDinnerParty = new DinnerParty2();
		
		Scanner keyB = new Scanner(System.in);
		
		System.out.print("Enter number of guests for the party >>");
		guests = keyB.nextInt();
		aParty.setGuests(guests);
		System.out.println("The party has " + aParty.getGuests() + " guests");
		
		aParty.displayInvitations();
		
		System.out.print("Enter number of guests for the Dinner party>>");
		guests = keyB.nextInt();
		aDinnerParty.setGuests(guests);
		
		System.out.print("Enter the menu option -- 1 for chicken or 2 for vegetarian >> ");
		choice = keyB.nextInt();
		aDinnerParty.setDinnerChoice(choice);
		System.out.println("Menu Option " + aDinnerParty.getDinnerChoice() + " will be served");
		
		aDinnerParty.displayInvitations();

	}

}

	 

 
