package guvi;
import java.util.Scanner;
public class CountSpecial {
	public static void main (String[] args){
		String s1;
		int count=0;
		Scanner s=new Scanner(System.in);
		s1=s.nextLine();
		char[] ch=s1.toCharArray();
		for(int i=0;i<s1.length();i++){
			if(((int)ch[i]>=33)&&((int)ch[i]<=47)){
				
				count++;
			}
		}
		System.out.println(count);
	}

}
