//Wap to demo of ObjectOutputStream Class
import java.io.*;
class ObjOtpStm
{
    public static void main(String arg[])
	{
	   try
      {  /*
	       //  For Object -->
		   
		   Small s=new Small(23,"MJ_Colony");
		  
		  FileOutputStream fout=new FileOutputStream("Stream.txt");
		  
		  ObjectOutputStream obj=new ObjectOutputStream(fout);
		  
		  obj.writeObject(s);
		  
		  obj.flush();
		  obj.close();
		  */
		  //For primitive data type
		   Small n = new Small(33,"MG_Colony");
		  
		  FileOutputStream fout=new FileOutputStream("Stream.txt");
		  
		  ObjectOutputStream obj=new ObjectOutputStream(fout);
		  obj.writeObject(n);
		  obj.flush();
		  obj.close();
		  System.out.println("Sure Done..");
	  }
	  catch(Exception e)
     {
	     System.out.println();
      }
  }
}