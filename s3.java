//Wap to demo of Factorial of a number using  Annonomous inner class
abstract class Factorial
{
	   abstract void find_fact(int n);
}
class Test1
{
	public static void main(String agr[])
	{
		int m=5;
		Factorial f = new Factorial()
		{
			  int fact=1,i;
			  void find_fact(int num)
			  {
				     for(i=1;i<=num;i++)
					 {
						   fact=(fact*i);
					 }
					 System.out.println(" Factorial of a number is : " +fact);
			  }
		};
		f.find_fact(m);
	}
}