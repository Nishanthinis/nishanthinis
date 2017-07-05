package guvi;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
	int n,i,table;	
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	for(i=1;i<=20;i++){
		table=n*i;
		System.out.println(n+ "*" +i+ "=" +table);
	}
s.close();
	}

}
