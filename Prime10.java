 package Logic;
import java.util.Scanner;
public class Prime10 {
		public static void main(String[] args) {
			int n1,n2,n3,flag=0,i,j;
			Scanner s=new Scanner(System.in);
			System.out.println("enter the lower limit");
			n1=s.nextInt();
			System.out.println("enter the upper limit");
			n2=s.nextInt();
			System.out.println("the prime number limits are");
			for(i=n1;i<n2;i++)
			{
				for(j=2;j<i;j++)
				{
					if(i%j==0)
					{
						flag=0;
						break;
					}
					else
					{
						flag=1;
					}
				}
				if(flag==1)
				{
					System.out.println(+i);
				}
			}
		

		}
}







