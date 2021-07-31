//wap to demo of ioException
import java.io.*;
class Mona1
{
   void Message() throws IOException
   {
	     throw new IOException(" Mona Gupta Throws An Explicitly Exception ");
   }
}
class Test
{
   public static void main(String arg[]) 
   {
	   try
	   {
	      Mona1 m = new Mona1();
		  m.Message();
	   }
	   catch(IOException e)
	   {
		   System.out.println(" Exception handled....");
	   }
		  System.out.println(" Normal Flow...");
   }
}