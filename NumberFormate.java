//Wap to solve NullPointerException
class NullPointer
{
   public static void main(String arg[])
   {
	  try
	  {
	    String s="mona";
		int i = Integer.parseInt(s);
		System.out.println(s);
	  }
	  catch(NumberFormatException e)
	  {
		 System.out.println(e);
	  }
	  System.out.println("NumberFormateException Problem Solved");
   }
}