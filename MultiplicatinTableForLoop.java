//Wap to find Multiplication table of Given Numbers
import java.util.Scanner;
class Mona1
{  
    public static void main(String agrs[])
	{
	   int i,num;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("\n Enter Any Num :");
       num=sc.nextInt();	
	   for(i=1;i<=10;i++)
	   {
		 System.out.println("\n"+(i*num));
	   }
    }
}