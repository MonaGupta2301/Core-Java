//wap to demo o// WAP to Demo Of Area Of Rectangle
class input
{   
 
    public void Sum(double l, double b)
	{
	    System.out.println("\n Sum of int is  : "+(l+b));
	}
	public void Sum(int a,int b)
	{
		System.out.println("\n Sum of float is : "+(a*b));
	}
	public static void main( String agrs[])
	{
		input i = new input();
		i.Sum(2.2,3.3);
		i.Sum(2,3);
	}
}