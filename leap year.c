#include<stdio.h>
int main()
{
int a,b,c;
printf("enter the year:");
scanf("%d",&a);
if(a%400==0||(a%100!=0&&a%4==0))
{
printf("%d is leap year:",a);
}
else
{
printf("%d is not a leap year:",a);
}
}
