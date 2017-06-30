package first;
import java.util.Scanner;
public class rev2 {
	public static void main(String[] args){
		int n,m,rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		n=s.nextInt();
		while(n>0)
		{
			m=n%10;
			rev=rev*10+m;
			n=n/10;
		}
		System.out.println("reverse number are:" +rev);
	}

}
