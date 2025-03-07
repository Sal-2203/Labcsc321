//Saul Zuniga
//Midterm
//

import java.util.Scanner;

public class Exam1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: 1-20");
		int y = input.nextInt();
		int x = 11;

		if(y==x)
		{
			System.out.println("You guessed the correct number you win 5 big Booms!");
			System.out.println("BOOM! BOOM! BOOM! BOOM! BOOM!");
		}
		else 
		{
			System.out.println("You didnt enter the correct number");
			System.out.println("Womp Womp");
		}
	}
}



