#include<stdio.h>
main()
{
int x,y,z;
printf ("enter the three value:");
scanf ("%d,%d,%d",&x,&y,&z);
if(x>=y&&x>=z)
 printf("x is greater:",x);
if(y>=x&&y>z)
 printf("y is greater :",y);
if(z>=x&&z>y)
 printf("z is greater:",z);
return 0;
}
