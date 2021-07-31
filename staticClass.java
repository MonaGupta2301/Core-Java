class Base
{
    static int data = 10;
	static void dis()
	{
	    System.out.println(" Data is ==>"+data);
	}
}
class Derived extends Base
{
    static int data2=20;
	static void dis2()
	{
	     System.out.println(" Data2 is ==>"+data2);
	}
	public static void main(String arg[])
	{
		 //Base b =new Derived();
		 dis();
		 dis2();
	}
}