class Abc
{
   public static void main(String arg[])
   {
       try
	   {
		    int a=88/4;
             try 
     	   {
                 int m=77/0;
	       }
            catch(ArithmeticException e)
	       {
                System.out.println(" Compile Time ArithmeticException ====> "+e);
	        }
			finally
			{
	             System.out.println("+ + + + Nested Finally 1 + + + + ");
			}
	        try
	        {
                  int v[] = new int[9];
				  v[9]=67;
	        }
            catch(ArrayIndexOutOfBoundsException d)
	        {
                  System.out.println(" Compile Time ArrayIndexOutOfBoundsException ====> "+d);
	        }
			finally
			{
	             System.out.println("+ + + + Nested Finally 2 + + + + ");
			}
	   }
       catch( Exception w)
	   {
               System.out.println(" Compile Time Exception ====> "+w);
	   }	
       finally
		{
	             System.out.println("+ + + + Finally 1 + + + + ");
		}	   
	   
	                  System.out.println(" <===== Rest Of The Code Executed ====> ");
	
   }
}