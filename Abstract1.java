abstract class Shape
{
	   int x=100;
	   static abstract void msg();
	   void Normal_Method()
	   {
		     System.out.println("The value of x in Normal_Method :"+x);
	   }
}
class Shape2 extends Shape
{
	void msg()
	{
		 System.out.println(" The value of x in Abstract Method Msg :"+x);
	}
    public static void main(String arg[])
	{
        System.out.println(" Abstraction...");
        new Shape2().msg();
        new Shape2().Normal_Method();		
	}		
}