package javaEx1;

public class CustomExceptionExample extends Exception
{
	private static int accno[]= {1001,1002,1004,1005};
	private static String name[]= {"Ram","Prasun","Sam","Buddha"};
	private static double balanc[]= {100000.00,123333.00,999,673997.00};
	public CustomExceptionExample() {}
	public CustomExceptionExample(String str)
	{
		super(str);
	}
	

	public static void main(String[] args) {
	try
	{
		System.out.println("ACCNO"+"\t"+"NAME"+"\t"+"BALANCE");
		for(int i=0;i<5;i++) {
			System.out.println(accno[i]+"\t"+name[i]+"\t"+balanc[i]);
			if(balanc[i]<1000)
			{
				CustomExceptionExample me=new CustomExceptionExample("balance is less than 1000") ;
				throw me;
			}
		}}
	
catch(CustomExceptionExample me)
	{
	 me.printStackTrace();
	}
	}

}
