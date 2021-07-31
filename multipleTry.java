//wap to demo of try catch
class Try1
{
	 public static void main(String arg[])
	 {	
		 try
		 {
			  int a[]=new int[10];
		      a[12]=10; 
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println(" Arrayr index Out of bound ");
			 try
			  {
			       int n=22/0;
			  }
			  catch(ArithmeticException e1)
		     {
			      System.out.println(" Arithmatic Exception ");
		     }
		 }
		 System.out.println(" Rest of the program executed successfully");
	 }
}