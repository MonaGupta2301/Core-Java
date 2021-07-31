import java.io.FileInputStream;
class Mona12345
{
	public static void main(String arg[])
	{
         try
		 {
			   FileInputStream fin=new FileInputStream("E:\\Demo1.txt");
			   byte[] buffer = new byte[10];
			   int b;
			   int i=fin.read(buffer,0,6);
			   //System.out.println(" Number of bytes read :"+i);
			   while(( b=fin.read())!=0)
			   {
				      char c=(char)b;
					  if(b==0)
					  {
						  break;
					  }
					  System.out.print(c);
			   }
			   fin.close();
		 }
		 catch(Exception e)
		 {
			   System.out.println();
		 }
	}		
}
