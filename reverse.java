package first;

public class reverse {public static void main(String[] args)
	{
    String stroriginal="HelloWorld";
    System.out.println("original String:"+stroriginal);
    stroriginal=new StringBuffer(stroriginal).reverse().toString();
    System.out.println("reversed String:"+stroriginal);
}

}
