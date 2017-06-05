import java.io.*;
import java.util.Scanner;
public class positive
{
public static void main(String args[])
{
int a;
Scanner s=new Scanner(System.in);
a=s.nextInt();
if(a==0)
{
System.out.println("zero");
}
else if(a>0)
{
System.out.println("positive");
}
else
{
System.out.println("negative");
}
}
}
