package string;
import java.util.Scanner;
public class RevDigits {

	public static void main(String[] args) {
	int n,m,rev=0;
	System.out.println("enter the digits:"); 
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	while(n!=0){
	m=n%10;
	rev=(rev*10)+m;
	n=n/10;
	}
	System.out.println(+rev);
	s.close();
	}
}
