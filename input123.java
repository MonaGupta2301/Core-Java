import java.io.FileOutputStream;
class Dem1
{
	public static void main(String arg[])
	{
		 try
		 {
			    FileOutputStream  f1 = new FileOutputStream("D:\\Test1.txt");
			    FileOutputStream  f2= new FileOutputStream("D:\\Test2.txt");
				String s=" Ujjain The The City of Mahakal...MP-13 Madya Pradesh ";
				byte b[]=s.getBytes();
				f1.write(b);
				String s1=" Indore the Clean And Green City...Madya Pradesh ";
		        byte c[]=s1.getBytes();
				f2.write(c);
				f1.close();
				f2.close();
				
		 }
		 catch(Exception e)
		 {
			  System.out.println();
		 }
	}
}