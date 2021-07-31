//Wap to Find Out The Enterd Number s Palimdrome Or Not
import java.util.Scanner;
class Palimdrom
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
		  sum=((sum*10)+r);
	      n=n/10;
	   }
	   if(temp==sum)
	   {
	       System.out.println("\n Enter Number is palimdrom  ");	       
	   }
	   else
	   {
	 	   System.out.println("\n Enter Number is not a Palimdrom Number  ");  
	   }
	}
}