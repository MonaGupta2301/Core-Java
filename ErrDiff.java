import java.util.Scanner;
class Demo3
{
	public static void main(String arg[])
	{
	    Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st Number  : ");
        int a=s.nextInt();
        System.out.println("Enter 2st Number  : ");
        int b=s.nextInt();
        if(b==0)
		{
             System.err.println("\n2nd Number is Zero Answer Cant Find....");
		}			
		else if(a<b)
		{
			  int c=(a/b);
			 System.err.println("\nBeacuse a Is Less than b And Both are Integer Thats why answer is : "+c);
		}
		else if(a==b)
		{
			  System.err.println("Anser is 1 ");
		}
		else
		{
			 int x=a/b;
			 System.out.println("Anser is :"+x);
		}
	}
}