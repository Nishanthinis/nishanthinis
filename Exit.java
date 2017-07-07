package Program;
import java.util.Scanner;
public class Exit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		char key=s.next().charAt(0);
		if(key=='Q'||key=='q')
		{
	      System.exit(0);
		}
		else
		
		System.out.println("hi");
		s.close();
		}

}