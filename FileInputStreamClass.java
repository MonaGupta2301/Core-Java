//Wap to demo of FileInputStream class
import java.io.FileInputStream;
class FileInputStreamex
{
	  public static void main(String arg[])
	  {
		   try
		   {
			    int i=0;
			    FileInputStream ft = new FileInputStream("E:\\Demo1.txt");
				while((i=ft.read())!=-1)
				{
					//char m =(char)(i);
				    System.out.print((char)i);
				}
				ft.close();
		   }
		   catch(Exception e)
		   {
			    System.out.println();
		   }
	  }
}