import java.io.SequenceInputStream;
import java.io.FileInputStream;
class Demo5
{
	public static void main(String arg[])
	{
     	try
      	{	
            FileInputStream fin1=new FileInputStream("D:\\Test1.txt");
            FileInputStream fin2=new FileInputStream("D:\\Test2.txt"); 
	        SequenceInputStream f = new SequenceInputStream(fin1,fin2); 
	        int i=0;
	        while((i=f.read())!=-1)
	       {
		         System.out.print((char)i);
	       }
	        fin1.close();
	        fin2.close();
	        f.close();
		}
	   catch(Exception e)
	   {
		     System.out.println();
	    }
	}
}