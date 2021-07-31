//Wap to demo of find wether the number is positive,negativeor zero
import java.util.Scanner;
abstract class Find
{
	  abstract void Find_out(int n);
}
class Test3
{
	int m;
	int input()
	{
		  Scanner s = new Scanner(System.in);
		  System.out.println(" Enetr any Number :");
		  m=s.nextInt();
		  return m;
	}
	public static void main(String arg[])
	{
		   int number;
		  Test3 t = new Test3();
		  Find f = new Find()
		  {
			    void Find_out(int num)
				{
                    if(num>0)
					{
						 System.out.println(" Number is  POSITIVE ");
					}
                    else if(num<0)
					{
						 System.out.println(" Number is  NEGATIVE ");
					}
                    else
					{
						 System.out.println(" Number is  ZERO ");
					}
				}					
		  };
		  number=t.input();
		  f.Find_out(number);
	}
}