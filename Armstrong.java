//Wap to Find Out The Enterd Number is armstrong Or Not
import java.util.Scanner;
class Armstrong
{
    public static void main(String agrs[])
	{
	   int r,temp,n;
	   int sum=0;
	   Scanner s =new Scanner(System.in);
	   System.out.println("\n Enter Number : ");
	   n=s.nextInt();
	   temp=n;
	   while(n>0)
	   {
	      r=n%10;
		  n=n/10;
		  sum=(sum+(r*r*r));
	   }
	   if(temp==sum)
	   {
	       System.out.println("\n Enter Number is Armstrong  ");	       
	   }
	   else
	   {
	 	   System.out.println("\n Enter Number is not a Armstrong Number  ");  
	   }
	}
}