//Wap to demo of FileInputStream class
import java.io.*;
class FileInputbuff
{
	  public static void main(String arg[])
	  {
		   try
		   {
			    int i=0;
			    FileOutputStream ft = new FileOutputStream("E:\\TYBSC.txt");
				BufferedOutputStream buff=new BufferedOutputStream(ft);
				String s=" Mona Rajesh Gupta TYBSC ";
				byte b[]=s.getBytes();
				ft.write(b);
				ft.close();
		   }
		   catch(Exception e)
		   {
			    System.out.println();
		   }
	  }
}