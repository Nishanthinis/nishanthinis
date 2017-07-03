package guvi;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		int n1;
		int n2;
		Scanner s=new Scanner(System.in);
		System.out.println("entre the no of n1:");
		n1=s.nextInt();
		System.out.println("enter the no of n2:");
		n2=s.nextInt();
	for(int i=n1;i<n2;i++)
	{
		if(i%2!=0)
		{
			System.out.println(+i);
		}
	}s.close();
		}

	}


