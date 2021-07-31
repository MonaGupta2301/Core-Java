//Wap to demo of FileOutputStreamClass Exapmle2
import java.util.Scanner;
import java.io.FileOutputStream;
class Example2
{
	public static void main(String arg[])
	{
		try
		{
	           byte[] b =new byte[3];
               FileOutputStream f = new FileOutputStream("E:\\Demo2.txt");
		       Scanner s = new Scanner(System.in);
		       System.out.println(" Enter Four Elements : ");
		      for(int i=0;i<3;i++)
			  {
				    b[i]=s.nextByte();
			  }
		       f.write(b,0,3);
		       f.close();
			   System.out.println(" Okay ");
	    }
		catch( Exception e)
		{
			   System.out.println("okay");
		}
    }
}