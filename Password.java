package guvi;
import java.util.Scanner;
public class Password {
	public static void main(String[] args){
		String s1;
		int k=0,m=0;
		Scanner s=new Scanner(System.in);
		s1=s.nextLine();
		char[] ch=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
		k=k+(int)ch[i];
		
		m=k/s1.length();
		}
		System.out.println((int)m);
		
		
	}

}
