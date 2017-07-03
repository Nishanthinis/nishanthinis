package guvi;
import java.util.Scanner;
public class AmtsrongNum {

	public static void main(String[] args) {
		int n1,c=0;
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		int temp=n1;
		while(n1!=0){
			int a=n1%10;
			n1=n1/10;
			c=c+(a*a*a);
		}
		if(temp==c){
			System.out.println("amstrong no");
		}
		else
		{
			System.out.println("not a amstrong no");
		}
s.close();
	}

}
