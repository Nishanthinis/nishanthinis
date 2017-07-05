package guvi;
import java.util.Scanner;
public class SumOdd {

	public static void main(String[] args) {
	int n,sum=0;
	Scanner s=new Scanner(System.in);
	for(int i=1;i<=15;i++){
		sum=sum+i;
	}
	System.out.println(+sum);
	for(int i=15;i<=45;i++){
		if(i%2!=0){
			System.out.print( " "+i);
		}
	}

	}

}
