package demoInherrit2;

public class DinnerParty2 extends Party1{
	
	private int dinnerChoice;
	public int getDinnerChoice()
	{
		return dinnerChoice;
	}
   public void setDinnerChoice(int choice)
   {
	   dinnerChoice = choice;
   }
 
    
   public void displayInvitation()
   {
   System.out.println("Please come to my Override dinner Party!");    
   }
} 