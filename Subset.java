package guvi;

public class Subset {
	public static void main(String[] args) {
	int i,j,count=0;
	int []a={1,2,5,6,7,0};
	int []b={2,8,5,3,7,6};
	for(i=0;i<a.length;i++){
		for(j=0;j<b.length;j++){
			if(a[i]==b [j]){
				count++;
			}
		}
	}
		if(count==b.length){
				System.out.println("a is subset of b");
			}
			else{
				System.out.println("a is not subset of b");
			}
			
		
	
	}

}
