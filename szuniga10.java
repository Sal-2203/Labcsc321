//Saul Zuniga 
//
//
import java.util.Scanner;

public class szuniga10
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		double a=0;

		System.out.print("Enter the height of cylinder");
		int h=input.nextInt();

		System.out.print("Enter the radius of cylinder");
                int r=input.nextInt();

		a = cylinderArea(h,r);

		System.out.println("The are of a cylinder is: " + a);

	}

	static double cylinderArea(double h, double r)
	{
		double v= Math.PI * Math.pow(r, 2) * h;
		return v;
	}
}
