//Multiple Try Catch
class MultipleCatch
{
	  public static void main(String arg[])
	  {
		    try
			{
				System.exit(0);
				int a=88/0;
			}
			catch(ArithmeticException e)
			{
				  System.out.println(e);
			}/*
			catch(NullPointerException d)
			{
				System.out.println(d);
			}*/
		   catch(ArrayIndexOutOfBoundsException g)
		   {
			   System.out.println(g);
		   }
		   catch(Exception s)
		   {
			   System.out.println(s);
		   }
		   finally
		   {
			   System.out.println(" Got the Concept...??");
		   }
		   System.out.println(" Try Catch Concept...");
	  }
}