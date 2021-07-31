//wap to find the age of a person
import java.util.Scanner;
class Age
{
   public static void main(String arg[])
   {
	   try
	   {
	         int n;
	         Scanner s = new Scanner(System.in);
	         System.out.println(" Enter the Number Between 1 to 100 :");
	         n=s.nextInt();
	                if(n<0 || n>100)
	                {
		                     System.out.println(" Please Enter the Valid Number Between  0 to 100");
	                }
	                else
	                {
		                     if(n>=0 && n<=100)
		                    {
			                     System.out.println(" Okay....");
		                    }  
	                }
	   }
	   catch(Exception e)
	   {
		      System.out.println("Please Enter Only integer number between 1 to 100");
	   }
	   System.out.println(" Mona Gupta ");
   }
}