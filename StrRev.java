package string;
import java.util.Scanner;
public class StrRev {
	public static void main(String[] args){
		String s1;
		String rev=" ";
		Scanner a=new Scanner(System.in);
		s1=a.nextLine();
		for(int i=s1.length()-1;i>=0;--i)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		a.close();

}
}
