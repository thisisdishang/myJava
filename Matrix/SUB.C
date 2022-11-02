/* Date:08/05/2021
   C program to Substration Of Two Matrix */
#include<stdio.h>
#include<conio.h>
void main()
{
	int a[3][3],b[3][3],sub[3][3],i,j;
	clrscr();

	printf("Enter Element For Matrix A:-\n");
	for(i=0;i<3;i++)
	{
	 for(j=0;j<3;j++)
	 {
	 printf("Enter Element A[%d][%d]:",i,j);
	 scanf("%d",&a[i][j]);
	 }
	}

	printf("\nEnter Element For Matrix B:-\n");
	for(i=0;i<3;i++)
	{
	 for(j=0;j<3;j++)
	 {
	 printf("Enter Element B[%d][%d]:",i,j);
	 scanf("%d",&b[i][j]);
	 }
	}

	printf("\nMatrix A:-\n");
	for(i=0;i<3;i++)
	{
	 for(j=0;j<3;j++)
	 {
	  printf(" %2d ",a[i][j]);
	 }
	 printf("\n");
	}

	printf("\nMatrix B:-\n");
	for(i=0;i<3;i++)
	{
	 for(j=0;j<3;j++)
	 {
	  printf(" %2d ",b[i][j]);
	 }
	 printf("\n");
	}

	printf("\nSubstraction Of Matrix:-\n");
	for(i=0;i<3;i++)
	{
	 for(j=0;j<3;j++)
	 {
	  sub[i][j]=a[i][j]-b[i][j];
	  printf(" %2d ",sub[i][j]);
	 }
	 printf("\n");
	}
	getch();
}