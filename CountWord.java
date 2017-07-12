package guvi;

public class CountWord {

	public static void main(String[] args) {
		String s1="nalan is very naughty boy";
		int word=1;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)==' '){
				word++;
			}
		}
			System.out.print(+word);
		
		

	}

}
