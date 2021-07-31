//Wap to demo of to write thr multiplication table of the inputed number 
import java.io.FileOutputStream;
class Ex3
{
	    public static void main(String arg[])
		{
			   try
			   {
			   FileOutputStream ft=new FileOutputStream("E:\\MultiplicationTable.txt");
			   ft.write(65);
			   ft.write(66);
			   System.out.println(" Sure All Done..");
			   }
			   catch(Exception e)
			   {
				     System.out.println();
			   }
		}
}