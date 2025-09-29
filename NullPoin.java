package javaEx1;

public class NullPoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	String a=null,b="Hello";
	System.out.println(a.charAt(0));
	System.out.println(b.charAt(0));
	
}
catch(NullPointerException e)
{
	System.out.println("Null Pointer"+e);
}
	}

}
