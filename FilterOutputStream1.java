import java.io.*;
public class FilterOutputStream1
{
	 public static void main(String arg[])
	 {
		try
		{
		    File data =new File("E:\\Testout1.txt");
			FileOutputStream fout=new FileOutputStream(data);
			FilterOutputStream filter = new FilterOutputStream(fout);
			String s="Degree College Of Physical Education HVPM Amravati";
			byte b[]=s.getBytes();
			filter.write(b);
            System.out.println("Success...");	
		}
        catch(Exception e)
		{
            System.out.println();
		}			
	 }
}