import java.io.*;
class Demo2
{
	 public static void main(String arg[])
	 {
		 try
		 {
		    PrintStream p = new PrintStream("D:\\Mona123.txt");
            System.setOut(p);
		    System.out.println("Mona Gupta Welcom In java ");
		 }
		 catch(Exception e)
		 {
			  System.out.println();
		 }
	 }
}