class Outer1
{
       private int Role_Number=123;
	   void Display()
	   {
		   double per =98.76;
		    class Inner
			{
				   void msg()
				   {
					     System.out.println(" Your Roll_Number is :"+Role_Number);
					     System.out.println(" Your Percentage is :"+per);
				   }
			}
			Inner i =new Inner();
			i.msg();
	   }
	   public static void main(String arg[])
	   {
		     Outer1 out=new Outer1();
			 out.Display();
	   }
}