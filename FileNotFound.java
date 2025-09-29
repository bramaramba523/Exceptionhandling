package javaEx1;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class FileNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	//File obj=new File(src desti)

	File file=new File("D:/Q 2123.doc");
	//FileReader obj=new FileReader(fileobj)
	FileReader fr=new FileReader(file);
	System.out.println("File exist");
}
catch(Exception e)
{
	System.out.println("file does not exist");
	
}
	}
}