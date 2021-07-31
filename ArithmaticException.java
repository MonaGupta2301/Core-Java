//Try catach to solve the unchecked exception handling
class ArthEx
{
	public static void main(String erg[])
	{
		int a;
		try
		{
			a=55/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Mona Gupta");
	} 
}