package Program;
import java.util.Scanner;
public class DigCha {

	public static void main(String[] args) {
		String a;
		Scanner s=new Scanner(System.in);
		int d=0,al=0,b=0;
		a=s.nextLine();
		for(int i=0;i<a.length();i++){
			if(Character.isDigit(a.charAt(i))){
				d++;
			}
			if(Character.isAlphabetic(a.charAt(i))){
				al++;
			}
			else
			{
				b++;
			}
		}
		System.out.println("digits="+d+"alpha="+al+"b="+b);
		s.close();
	}

}
