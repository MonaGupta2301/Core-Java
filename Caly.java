//WAP TO Demo of Mini Calculator
import java.util.Scanner;
class Add
{
    public void sum(int a,int b)
	{
	   System.out.println("\n Sum Of Two Number Is : "+(a+b));
	}
    public void sum(double a,int b)
	{
	   System.out.println("\n Sum Of Two Number Is : "+(a+b));
	}
    public void sum(int a,double b)
	{
	   System.out.println("\n Sum Of Two Number Is : "+(a+b));
	}
    public void sum(double a,double b)
	{
	   System.out.println("\n Sum Of Two Number Is : "+(a+b));
	}
}
class Sub
{
    public void minus(int a,int b)
	{
	   System.out.println("\n Sum Of Two Number Is : "+(a-b));
	}
    public void minus(double a,int b)
	{
	   System.out.println("\n Sum Of Two Number Is : "+(a-b));
	}
    public void minus(int a,double b)
	{
	   System.out.println("\n Sum Of Two Number Is : "+(a-b));
	}
    public void minus(double a,double b)
	{
	   System.out.println("\n Sum Of Two Number Is : "+(a-b));
	}
}
class Multi
{
    public void mul(int a,int b)
	{
	   System.out.println("\n Sum Of Two Number Is : "+(a*b));
	}
    public void mul(double a,int b)
	{
	   System.out.println("\n Sum Of Two Number Is : "+(a*b));
	}
    public void mul(int a,double b)
	{
	   System.out.println("\n Sum Of Two Number Is : "+(a*b));
	}
    public void mul(double a,double b)
	{
	   System.out.println("\n Sum Of Two Number Is : "+(a*b));
	}
}
class Div
{
    public void divide(int a,int b)
	{
	   System.out.println("\n Sum Of Two Number Is : "+(a/b));
	}
    public void divide(double a,int b)
	{
	   System.out.println("\n Sum Of Two Number Is : "+(a/b));
	}
    public void divide(int a,double b)
	{
	   System.out.println("\n Sum Of Two Number Is : "+(a/b));
	}
    public void divide(double a,double b)
	{
	   System.out.println("\n Sum Of Two Number Is : "+(a/b));
	}
}
class Main
{
    public static void main(String agrs[])
	{
	  double num1,num2;
	  Add a = new Add();
	  Sub s = new Sub();
	  Multi m = new Multi();
	  Div d = new Div();
	  Scanner s = new Scanner (System.in);
	  char m;
	  System.out.println(" Enter 1st Number  : ");
	  num1=s.nextDouble();
	  System.out.println(" Enter 2st Number  : ");
	  num2=s.nextDouble();
	  System.out.println(" Enter Operstor  : ");
	  m=s.next().charAt(0);
	  switch(m)
      {
	    case '+' : 
	             {
					sum(a,b); 
		            break;
				 }
		case '-' : 
		         {
				    sub(a,b);
		            break;
				 }
		case '*' : 
		         {
					 mul(a,b);
		             break;
				 }
		case '/' :
		         {
					 divide(a,b);
                     break;
			     }
	   } 
    } 

}