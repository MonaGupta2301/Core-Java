import java.io.FileInputStream;
class Mona12345
{
	public static void main(String arg[])
	{
         try
		 {
			  int i=0;
			   FileInputStream fin=new FileInputStream("E:\\Demo1.txt");
			   byte[] buffer = new byte[10];
			   fin.read(buffer,0,6);
			   for(byte b : buffer)
			   {
					  if(b==7)
					  {
						  break;
					  }
                     System.out.print((char)b);
			   }
			   fin.close();
		 }
		 catch(Exception e)
		 {
			   System.out.println();
		 }
	}		
}
