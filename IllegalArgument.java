package javaEx1;

public class IllegalArgument 
{
	public static void print(int a) {
		
	if(a>=18)
	{
		   System.out.println("Eligible to vote");
	}
	   else
	   {
		   throw new IllegalArgumentException("Not Eligible for voting");
		}
	}
	   public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(20);
	   }
	

}
