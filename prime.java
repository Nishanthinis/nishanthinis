package first;
import java.util.Scanner;
public class prime {
	public static void main(String[] args){
		int num,i,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num:");
		num=s.nextInt();
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("prime num");
		}
		else
		{
			System.out.println("not prime");
		}
	
	}
}
