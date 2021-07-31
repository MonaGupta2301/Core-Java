class Monika
{
   public static void main(String arg[])
   {
	  try
	  {
	   System.out.println("Sum is :"+arg[0]);
	   System.out.println("Sum is :"+arg[2]);
	   System.out.println("Sum is :"+arg[1]);
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
		    System.out.println(" The Index Of Arraye is out of bound");
	  }
   }
}