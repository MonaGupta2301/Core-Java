import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
class ByteArray
{
	   public static void main(String arg[])throws Exception
	   {
		      FileInputStream fin2=new FileInputStream("E:\\Demo.txt");
			  int b[]=new int[100];
			  int i=0;
			  for(byte j=0;((i=fin1.read())!=-1);j++)
			  {
				     b[j]=i;
    		   }
			   byte b1[]=(byte)b;
			   ByteArrayInputStream s = new ByteArrayInputStream(b1);
			   while((i=s.read())=-1)            
			   {
				     System.out.print((char)i);
			   }
	   }
}