//Wap to demo of Addition of two number using FileOutputStream Class
import java.io.FileOutputStream;
import java.util.Scanner;
class Three
{
	 public static void main(String arg[])
	 {
		 try
         {		   
		      int p,q;
			  FileOutputStream ft = new FileOutputStream("E:\\Addition.txt");
			  Scanner s =new Scanner(System.in);
			  System.out.println(" \n Enter First Number : ");
			  p=s.nextInt();
			  System.out.println(" \n Enter Second Number : ");
			  q=s.nextInt();
			  
			  String s1 = "\n Enter First Number : ";
			  byte x[]=s1.getBytes();
			  ft.write(x);
			  
			  String a1=String.valueOf(p);
			  byte b[]=a1.getBytes();
			  ft.write(b);
			  
			  String s2 = "\n Enter Second Number : ";
              byte x1[]=s2.getBytes();
			  ft.write(x1);
			  
			  String a2=String.valueOf(q);
			  byte b1[]=a2.getBytes();
			  ft.write(b1);
			  
			  String s3 = "\n Addition Of Two Number is  : ";
              byte z1[]=s3.getBytes();
			  ft.write(z1);
			  
			  int c = p+q;
			  String a3=String.valueOf(c);
			  byte c1[]=a3.getBytes();
			  ft.write(c1);
              ft.close(); 			  
			  System.out.println(" Well All Done...");
         }
        catch(Exception e)
		{
                System.out.println("Okay,,");
		}			
	}
}