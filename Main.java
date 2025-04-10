// COLLABORATORS: <tutors, instructor, or anyone else who helped you>

// DESCRIPTION: <a sentence about what the purpose of this program is>

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION
	double initialCents = 168; 
        int remainingCents = (int)initialCents;
    //CALCULATION SECTION
	int quarters = remainingCents / 25;
        remainingCents %= 25;
        int dimes = remainingCents / 10;
        remainingCents %= 10;
        int nickels = remainingCents / 5;
        remainingCents %= 5;
        int pennies = remainingCents;
    //OUTPUT SECTION
    System.out.printf("$%.2f can be converted to %d quarters, %d dimes, %d nickels, and %d pennies.%n",
                    initialCents/100, quarters, dimes, nickels, pennies);

}
