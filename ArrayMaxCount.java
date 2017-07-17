package guvi;

public class ArrayMaxCount {

	public static void main(String[] args) {
		int[] a={1,2,3,2,4,2};
   for(int i=0;i<6;i++){
			for(int j=i+1;j<6;j++)
			if(a[i]==a[j]){
				System.out.println(a[i]);
			}
			
		}
	}
}

			
			
			
		

