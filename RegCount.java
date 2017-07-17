package guvi;
import java.util.Scanner;
import java.util.Arrays;
public class RegCount {

	public static void main(String[] args) {
		int[] a={1,5,3,7,8,5,5};
		int count=0;
		 Arrays.sort(a);
		System.out.println("modified array[]:");
		for(int i=0;i<7;i++){
			for(int j=i+1;j<7;j++){
				if(a[i]==a[j]){
					count++;
					System.out.println(a[i]);
				}
			}
			
		}
		
}
	}
