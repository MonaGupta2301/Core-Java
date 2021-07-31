//Wap to demo of DataOutputStream class
import java.io.*;
 class DOS
{
	 public static void main(String arg[])throws Exception
	 {
		   FileOutputStream fout=new FileOutputStream("E:\\DOS.txt");
 		   DataOutputStream dos =new DataOutputStream(fout);
		   dos.writeInt(100);
		   dos.flush();
		   dos.close();
		   System.out.println("Success");
	 }
}