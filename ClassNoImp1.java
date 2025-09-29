package javaEx1;

public class ClassNoImp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class<?> cls=Class.forName("newpack.area");
	System.out.println("Class not found"+cls.getName());
	
}
catch(ClassNotFoundException e)
{
	System.out.println("class not found"+e.getMessage());
	e.printStackTrace();
}
	}

}
