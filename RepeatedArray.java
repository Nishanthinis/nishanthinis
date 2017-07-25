package guvi;
import java.util.Scanner;
public class RepeatedArray {

	public static void main(String[] args) {
		int n,i,j,k=0;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<a.length;i++){
			a[i]=s.nextInt();
		}
		for(i=0;i<1;i++){
			for(j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					k=a[i];
				}
			}
			System.out.println(k);
		}
		
		
	

	}

}
