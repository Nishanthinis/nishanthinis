package guvi;

public class RemChar {
	public static void main(String[] args){
		String s1="Engineering";
		int i,j,n;
		int count=0;
		n=s1.length();
		String str="";
       for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(s1.charAt(i)==s1.charAt(j)||(i!=j )){
					count++;
				}
			
			}
       
			if(count==1){
					
					str=str+s1.charAt(i);
				}
			System.out.println(str);
		}
		

	}
}

	

