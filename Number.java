package guvi;
import java.util.Scanner;
public class Number {
	public static void main(String[] args){
		int n;
		int m=0;
	    int	count=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n==0){
			System.out.println("sum of number is 1");
			
		}
		while(n!=0){
			m=n%10;
			n=n/10;
			count++;
			
		}
		System.out.println(+count);
	}

}
