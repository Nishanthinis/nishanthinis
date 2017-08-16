package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class H128 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;
		int n=s.nextInt();
		int []a=new int[n];
		int []a1=new int[n];
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int l=n-1;
		Arrays.sort(a);
		for(i=0;i<n/2;i++,l--){
		System.out.print(a[l]+" "+a[i]+" ");
}
		if(n%2==1){
			System.out.print(a[i]);
		}
}
}