import java.io.*;
public class FilterInputStream1
{
	 public static void main(String arg[])
	 {
		try
		{
		    File data =new File("E:\\Testout1.txt");
			FileInputStream fout=new FileInputStream(data);
	        FilterInputStream filter = new BufferedInputStream(fout);
			int k=0;
			while((k=filter.read()) != -1)
			{
				 System.out.print((char)k);
			}
		}
		catch(Exception e)
		{
			System.out.println();
		}
	 }
}
			