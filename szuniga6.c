//Saul Zuniga LAb6
//
//

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	int x = 5;
	int y = 10;
	double a = 5;
	double b = 10;

	int q = x+y*x/y-x;
	int w = -x-y/x*y+x;
	int e = x+y-x/y;
	double r = a+b*a/b-a;
        double t = -a-b/a*b+a;
        double u = a+b-a/b;

	printf("%d\n",q);
	printf("%d\n",w);
	printf("%d\n",e);
	printf("%f\n",r);
	printf("%f\n",t);
	printf("%f\n",u);

	return EXIT_SUCCESS;
}
