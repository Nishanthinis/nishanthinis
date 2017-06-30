package guvi;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
       System.out.println("enter the no:");
       a=s.nextInt();
       b=s.nextInt();
       System.out.println(Math.pow(a,b));
       
}


}