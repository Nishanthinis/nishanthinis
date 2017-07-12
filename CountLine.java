package guvi;
import java.util.Scanner;
public class CountLine {
	public static void main(String[] args){
		String s1;
		int count=0;
		Scanner s=new Scanner(System.in);
		s1=s.nextLine();
		System.out.println("enter the paragraph:");
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)=='.'){
				count++;
			}
			
		}
		System.out.println(count);
	}

}
