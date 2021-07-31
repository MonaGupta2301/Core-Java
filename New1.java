import java.lang.Throwable;
class  InvalidAgeException
{
	   InvalidAgeException(String s)
	   {
		     super(s);
	   }
}
class Except13
{
	  static void validate(int age)throws InvalidAgeException
	  {
		    if(age>18)
			{
				  throw new InvalidAgeException("Create By Me....");
			}
			else
			{
				  System.out.println(" WelCome to Vote ");
			}
	  }		
	 public static void main(String arg[])
	 {
		  try
		  {
			    validate(15);
		  }
		  catch( Exception e)
		  {
 			   System.out.println(" Exception Occured :"+e);
		  }
				  System.out.println(" Rest of the Code Executed....");
	 }
}