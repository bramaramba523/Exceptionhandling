package javaEx1;

import java.util.Scanner;

public class IoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner scan=new Scanner("Hello");
			System.out.println(""+scan.nextInt());
			System.out.println("Exception Output"+" "+scan.IoException());			
			scan.close();
		}

	}


