package guvi;

public class ArrayUnique {

	public static void main(String[] args) {
		int[] a={1,4,3,6,9,5};
		for(int i=0;i<6;i++){
			if(i==a[i]){
				System.out.println(i);
			}
		}
	}

}
