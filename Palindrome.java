package guvi;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args){
		int n,sum=0,rev=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int temp=n;
		
		while(n!=0){
			int m=n%10;
			sum=sum+m;
			n=n/10;
	}
		//System.out.println(sum);
		int a=sum;
		while(sum!=0){
			int b=sum%10;
			rev=rev*10+b;
			sum=sum/10;
		}
		System.out.println(rev);
		if(rev==a){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
		
	}
}