//wap to demo o// WAP to Demo Of Area Of Rectangle
class input
{   
    public double length,bredth;
    public void getdata(double l,double b)
	{
	   length=l;	   
	   bredth=b;
	}
	public void computdata()
	{
		System.out.println("\n Area Of Rectangle Is : "+(length*bredth));
	}
	public static void main( String agrs[])
	{
		double len,bred;
		input i = new input();
		input v = new input();
		i.getdata(1.2,2.3);
		v.getdata(2.2,3.3);
		i.computdata();
		v.computdata();
	}
}