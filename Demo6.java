import java.io.*;
public class Demo6
{
	 public static void main(string arg[]) throws IOException
	 {
		   InputStream input=new FileInputStream("E:\\DOS.txt");
		   DataInputStream inst=new DataInputStream(input);
		   int count=input.available();
		   byte[] arr = new byte[count];
		   inst.read(arr);
		   for(byte bt : arr)
		   {
			    char k=(char)bt;
				System.out.print(k);
		   }
		   input.close();
		   inst.close();
		   System.out.println(" Success....");
	 }
}