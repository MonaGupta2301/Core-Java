//wap to demo of FileOuputStreamClass
import  java.io.FileOutputStream;
class Example
{
	  public static void main(String arg[])
	  {     
	        try
			{
		          FileOutputStream f = new FileOutputStream("E:\\Demo.txt");
			      f.write(78);
			      f.write(32);
			      f.close();
			      System.out.println(" Success");
			}
			catch(Exception e)
			{
				  System.out.println(" Good Job ");
			}
	  }
}