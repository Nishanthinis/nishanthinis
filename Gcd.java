package guvi;
import java.util.Scanner;
public class Gcd {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n1,n2;
	System.out.println("enter the firdt n1");
	n1=s.nextInt();
	System.out.println("enter the second n2");
	n2=s.nextInt();
	while(n1!=n2){
		if(n1>n2){
			n1=n1-n2;
		}
		else
		{
			n2=n2-n1;
		}
		System.out.println("GCD = "+n1);
		
	}
	
	}

}
