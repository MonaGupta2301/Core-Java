//Wap todemo od Default built in Constructor in jvm 
class Demo
{
	final int x=110
	;
	double y;
	String s;
	void get()
	{
       System.out.println(" The Value of x is : "+x);
	   System.out.println(" The Value of y is : "+y);
       System.out.println(" The Value of s is : "+s);	   
    }
	public static void main(String arg[])
	{
	   Demo d = new Demo();
       d.get();	   
    }
}