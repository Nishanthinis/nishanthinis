package Program;
import java.util.Scanner;
public class Lcm {

	public static void main(String[] args) {
		int a,b,x,y,m,hcf,lcm;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		a=x;
		b=y;
		while(b!=0){
		m=b;
		b=a%b;
		a=m;
		}
		hcf=a;
		lcm=(x*y)/hcf;
		System.out.println("Lcm="+lcm);
		System.out.println("Hcf="+hcf);
	}

}
