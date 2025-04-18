//Saul Zuniga 
//
//

#include <stdio.h>
#include <stdlib.h>

int loopRun(int a);

int main(void)
{
	int lp;

	printf("Enter the number of loops you want to run: ");
	scanf("%d", &lp);

	loopRun(lp);

	return EXIT_SUCCESS;


}

int loopRun(int a)
{
	for (int i=0; i<a; i++){
		printf("Saul Zuniga\n");
	}
}
