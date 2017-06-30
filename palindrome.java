package first;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		int n,m,sum=0,r;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		n=s.nextInt();
		m=n;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
 			n=n/10;
		}
		if(sum==m)
		    {
				System.out.println("given number is palindrome");
		    }
			else
			{
		
				System.out.println("given number is not palindrome");
			}
		
s.close();
	}
}
