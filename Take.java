import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.SequenceInputStream;
class Take
{
	  public static void main(String arg[])
	  {
		     try
			 {
				    int i=0;
				    FileOutputStream fout1=new FileOutputStream("D:\\Test123.txt");
				    FileOutputStream fout2=new FileOutputStream("D:\\Test1234.txt");
					FileInputStream fin1=new FileInputStream("D:\\Test123.txt");
					FileInputStream fin2=new FileInputStream("D:\\Test1234.txt");
					SequenceInputStream f=new SequenceInputStream(fin1,fin2);
					String s="Mona Gupta";
					byte b[]=s.getBytes();
					fout1.write(b);
					String s1="Prabhu Gupta";
			       	byte c[]=s1.getBytes();
					fout2.write(c);
                    while((i=f.read())!=-1)
					{
                          System.out.print((char)i);
					}			
                    fout1.close();
                    fout2.close();					
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