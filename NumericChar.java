package guvi;
import java.util.Scanner;
public class NumericChar {

	public static void main(String[] args) {
		String s1;
		Scanner s=new Scanner(System.in);
			s1=s.nextLine();
			char []ch=s1.toCharArray();
			int count=0;
			for(int i=0;i<s1.length();i++){
				if(((int)ch[i]>47)&& ((int)ch[i]<58)){
					count++;
				}
			
		}
			System.out.println(count);
	}

}
