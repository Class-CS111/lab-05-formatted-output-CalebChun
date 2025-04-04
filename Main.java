// COLLABORATORS: <tutors, instructor, or anyone else who helped you>

// DESCRIPTION: <a sentence about what the purpose of this program is>

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION
	int initialCents = 141; 
        int remainingCents = initialCents;
    //CALCULATION SECTION
	int quarters = remainingCents / 25;
        remainingCents %= 25;
        int dimes = remainingCents / 10;
        remainingCents %= 10;
        int nickels = remainingCents / 5;
        remainingCents %= 5;
        int pennies = remainingCents;
    //OUTPUT SECTION
	System.out.println("You have "+quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels, and "+pennies+" pennies!");
  }

}
