#include<stdio.h>
#include<string.h>
void main()
{
	int n,i,j;
	char name[50][50],temp[50];
	printf("Enter how many names:\t");
	scanf("%d",&n);
	printf("Enter the names\n");
	for(i=0;i<n;i++)
	{
		fflush(stdin);
		printf("Name %d\t",i+1);
		gets(name[i]);
	}
	for(i=1;i<n;i++)
	{
		for(j=0;j<n-i;j++)
		{
			if(strcmp(name[j],name[j+1])>0)
			{
				strcpy(temp,name[j]);
				strcpy(name[j],name[j+1]);
				strcpy(name[j+1],temp);
			}
		}
	}
	printf("The names in order\n");
	for(i=0;i<n;i++)
	{
		puts(name[i]);
		
	}
}
