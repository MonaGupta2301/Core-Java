//Wap to demo of  of FileOutputStream
import java.io.FileOutputStream;
class Example3
{
	  public static void main(String arg[])
	  {
		    try
			{
				
		          FileOutputStream f = new FileOutputStream("E:\\Mona.txt");
			      String s="My Name is Mona Gupta And I AM From Amravati...........";
			      byte b[] = s.getBytes();
			      f.write(b);
			      f.close();
			     System.out.println(" OKay..");
			     System.out.println(" Okay..");
			}
			catch(Exception e)
			{
				 System.out.println(" Fine...");
			}
	  }
}