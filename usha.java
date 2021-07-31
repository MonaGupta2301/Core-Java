import java.io.*;    
class p
{  
     public static void main(String[] args) throws IOException
    {  
			InputStream input = new FileInputStream("E:\\DOS.txt");  
			DataInputStream inst = new DataInputStream(input);  
			int count = input.available();  
			byte[] ary = new byte[count];  
			inst.read(ary);  
			for (byte bt : ary)
			{  
				char k = (char) bt;  
				System.out.print(k+"-");  
			}  
	}  
}