package Program;
import java.util.Scanner;
public class SumAll {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		System.out.println(+sum);
		s.close();
		
	}

}
