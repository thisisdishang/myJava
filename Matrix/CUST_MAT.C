/* Date:08/05/2021
   Cutomize matrix */
#include<stdio.h>
#include<conio.h>
void main()
{
	int a[10][10],b[10][10],sum[10][10],sub[10][10],trans[10][10],i,j;
	int r,c;
	clrscr();

	printf("Enter Number of Rows(out of 10):");
	scanf("%d",&r);
	printf("Enter Number of Columns(out of 10):");
	scanf("%d",&c);

	printf("\nEnter Matrix A Element:\n");
	for(i=0;i<r;i++)
	{
	 for(j=0;j<c;j++)
	 {
	   printf("Enter Array Element A[%d][%d]:",i,j);
	   scanf("%d",&a[i][j]);
	 }
	}

	printf("\nEnter Matrix B Element:\n");
	for(i=0;i<r;i++)
	{
	 for(j=0;j<c;j++)
	 {
	   printf("Enter Array Element B[%d][%d]:",i,j);
	   scanf("%d",&b[i][j]);
	 }
	}

	printf("\n Matrix A:-\n");
	printf("~~~~~~~~~~~~~\n");
	for(i=0;i<r;i++)
	{
	 for(j=0;j<c;j++)
	 {
	   printf(" %2d ",a[i][j]);
	 }
	 printf("\n");
	}

	printf("\n Matrix B:-\n");
	printf("~~~~~~~~~~~~~\n");
	for(i=0;i<r;i++)
	{
	 for(j=0;j<c;j++)
	 {
	   printf(" %2d ",b[i][j]);
	 }
	 printf("\n");
	}

	printf("\nSum Of Two Matrices:\n");
	printf("~~~~~~~~~~~~~~~~~~~~~~\n");
	for(i=0;i<r;i++)
	{
	 for(j=0;j<c;j++)
	 {
	  sum[i][j]=a[i][j]+b[i][j];
	  printf(" %2d ",sum[i][j]);
	 }
	 printf("\n");
	}

	printf("\nSubstraction Of Two Matrices:\n");
	printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	for(i=0;i<r;i++)
	{
	 for(j=0;j<c;j++)
	 {
	  sub[i][j]=a[i][j]-b[i][j];
	  printf(" %2d ",sub[i][j]);
	 }
	 printf("\n");
	}

	printf("\nTranspose Of Matrix A:\n");
	printf("~~~~~~~~~~~~~~~~~~~~~~~~\n");
	for(i=0;i<r;i++)
	{
	 for(j=0;j<c;j++)
	 {
	 trans[j][i]=a[i][j];
	 }
	}

	for(i=0;i<c;i++)
	{
	 for(j=0;j<r;j++)
	 {
	  printf(" %2d ",trans[i][j]);
	 }
	 printf("\n");
	}
	getch();
}