#include<stdio.h>
#include<conio.h>
void main()
{
	int m1[10][10],m2[10][10],mul[10][10],r1,r2,c1,c2,i,j,k;
	clrscr();

	printf("Enter rows and columns for the first matrix:");
	scanf ("%d %d",&r1,&c1);
	printf("Enter rows and columns for the second matrix:");
	scanf ("%d %d",&r2,&c2);

	while(c1!=r2)
	{
	 printf("Error!!!!! Enter rows and columns again.\n");
	 printf("Enter rows and columns for the first matrix:");
	 scanf ("%d %d",&r1,&c1);
	 printf("Enter rows and columns for the second matrix:");
	 scanf ("%d %d",&r2,&c2);
	}

	printf("\nEnter Element for First Matrix:\n");
	for(i=0;i<r1;i++)
	{
	  for(j=0;j<c1;j++)
	  {
	   printf("Enter A[%d][%d]:",i,j);
	   scanf("%d",&m1[i][j]);
	  }
	}

	printf("\nEnter Element for Second Matrix:\n");
	for(i=0;i<r2;i++)
	{
	  for(j=0;j<c2;j++)
	  {
	   printf("Enter B[%d][%d]:",i,j);
	   scanf("%d",&m2[i][j]);
	  }
	}

	for(i=0;i<r1;i++)
	{
	 for(j=0;j<c2;j++)
	 {
	  mul[i][j]=0;
	  for(k=0;k<r2;k++)
	  {
	   mul[i][j]=mul[i][j]+(m1[i][k]*m2[k][j]);
	  }
	 }
	}
	printf("\nFirst Matrix:\n");
	for(i=0;i<r1;i++)
	{
	 for(j=0;j<c1;j++)
	 {
	  printf("%d\t",m1[i][j]);
	 }
	 printf("\n");
	}
	printf("\nSecond Matrix:\n");
	for(i=0;i<r2;i++)
	{
	 for(j=0;j<c2;j++)
	 {
	  printf("%d\t",m2[i][j]);
	 }
	 printf("\n");
	}
	printf("\nMultiplication Of Matrix:\n");
	for(i=0;i<r1;i++)
	{
	 for(j=0;j<c2;j++)
	 {
	  printf("%d\t",mul[i][j]);
	 }
	 printf("\n");
	}

	getch();
}