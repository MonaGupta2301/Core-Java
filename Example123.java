/*Wap to create a file Having name TYBSC and write your detatils in it like name,email,and add etc using OutputStream
and Access that data using inputStream on console*/
import java.io.*;
class Example123
{
	       void display()
		   {
			  class Inside
			  {
				  void show()
				  {
					  try
					  {
					      int i=0;
	                      FileInputStream fin = new FileInputStream("E:\\TYBSCdetails.txt");
                          BufferedInputStream fout = new BufferedInputStream(fin);                         
						 while((i=fin.read())!=-1)
			              {
                                System.out.print((char)i);
			               }
						   fout.close();
						   fin.close();
					  }
                     catch(Exception e)
					 {
                           System.out.println();
					 }						 
				  }
			  }
			  Inside i1=new Inside();
			  i1.show();
		   }
	 public static void main(String arg[])
	 {
		  try
		  {
			  Example123  e1 =new Example123();
			  PrintStream p = new PrintStream("E:\\TYBSCdetails.txt");
			  System.setOut(p);
			  System.out.println("Student Name      : Mona Rajesh Gupta");
			  System.out.println("Student Email      : guptamona252@gmail.com");
			  System.out.println("Student Address   : Itwara Bazar Amravati ");
              e1.display();			
              p.close();			  
		  }
		  catch(Exception e)
		  {
			   System.out.println();
		  }
	 }
}