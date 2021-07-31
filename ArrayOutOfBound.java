//Wap to solve NullPointerException
class NullPointer
{
   public static void main(String arg[])
   {
	  int a[]=new int[8];
	  try
	  {
	    a[10]=67;
		System.out.println(a[10]);
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
		 System.out.println(e);
	  }
	  System.out.println(" ArrayIndexOutOfBoundsException Problem Solved");
   }
}