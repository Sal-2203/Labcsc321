//saul
//

import java.util.Scanner;

public class szuniga4
{
	public static void main(String[] args)
	{
		int x = 0;

		System.out.println("Chose a option");
		System.out.println("Option 1 Dark Souls");
		System.out.println("Option 2 Red Dead Redemption");
		System.out.println("Option 3 God of war");
		System.out.println("Option 4 Minecraft");

		Scanner input = new Scanner(System.in);

		x = input.nextInt();


		if(x==1)
		{
			System.out.println("You chose option " + x + "Dark souls");
		}
		else if(x==2)
                {
                        System.out.println("You chose option " + x + "Read dead redemption");
                }
		else if(x==3)
                {
                        System.out.println("You chose option " + x + "God of war");
                }
		else 
		{
			System.out.println("You chose option " + x + "Minecraft");
		}
	}
}

