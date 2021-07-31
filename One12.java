//Wap to demo of to write thr multiplication table of the inputed number 
import java.io.FileOutputStream;
import java.util.Scanner;
class Mona1234567
{
	    public static void main(String arg[])
		{
			   try
			   {
				         int n;
			             FileOutputStream ft=new FileOutputStream("E:\\Table.txt");
						 Scanner s = new Scanner(System.in);
						 System.out.println(" Enter Any Number : ");
						 n = s.nextInt();
						 for(int i=1;i<=10;i++)
						 {
							for(int j=1;j<=n ; j++)
							{
	                            byte b[] =new byte[4];
							    int mult=1;
							    mult=(i*j);
			                    String s1 = String.valueOf(mult);
							    b=s1.getBytes();
							    ft.write(b);
								String s2="\t";
								byte y[] =s2.getBytes();
							    ft.write(y);
						   }
								String s3="\n";
								byte z[] =s3.getBytes();
							    ft.write(z);
						 }
			             System.out.println(" Sure All Done..");
			   }
			   catch(Exception e)
			   {
				        System.out.println();
			   }
		}
}
/* output

C:\java Programs>javac One12.java

C:\java Programs>java Mona1234567
 Enter Any Number :
5
 Sure All Done..

C:\java Programs>*/