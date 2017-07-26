package guvi;

public class ArrNotTwice {

	public static void main(String[] args) {
	    int i,j;
		int count=0;
		int[] a={1,1,5,2,5,2,8};
		for(i=0;i<=6;i++){
			for(j=0;j<=6;j++){
				
				if(a[i]==a[j]){
				count=count+1;
					
				}
				if(count!=2)
				{
					int c=a[i];
				}
			
			}
			System.out.println(a[i]);
		}
	}
}
/*		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int b=0;
		int []a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]!=a[j]){
					b=a[i];
				}
			}
		}
		System.out.println(+b);
	}
}*/
