//Wap to demo of read(byte arr[],int offset,int length)
import java.io.*;
import java.io.FileInputStream;
class Demo1234
{
	  public static void main(String arg[])
	  {
		    try
			{
		        int i[] = new int[100];
				int j[]=0;
		        FileInputStream fin= new FileInputStream("E:\\Demo1.txt");
		     	BufferedInputStream f = new BufferedInputStream(fin);
		     	while((j[]=f.read())!=-1)
			   {
				     i=j;
					 f.read(i,0,8);
			   }
			}
			catch(Exception e)
			{
				 System.out.println();
			}
			
	  }
}