package guvi;

public class CountNumber {

	public static void main(String[] args) {
	String s1="nishnathiniisgoodgirl";
	char [] ch=s1.toCharArray();
	String rev="";
	int count=0;
	for(int i=0;i<s1.length();i++){
		rev=rev+s1.charAt(i);
		count++;
	}
	System.out.println(+count);
	}

}
