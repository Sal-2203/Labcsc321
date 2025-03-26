//Saul Zuniga
//
//
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double hypotenuse(int b, int h);
int main(void)
{
	int base;
	int height;
	double result;

	printf("Enter the base: ");
	scanf("%d",&base);

	printf("ENter the height");
	scanf("%d",&height);

	result = hypotenuse(base, height);

	printf("The hypotenuse = %lf \n",result);
	
	return EXIT_SUCCESS;
}

double hypotenuse(int b, int h)
{
	double c = sqrt(b*b + h*h);
	return c;
}

