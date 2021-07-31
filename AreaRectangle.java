// WAP to Demo Of Area Of Rectangle
import java.util.*;
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
		Scanner s = new Scanner(System.in);
		System.out.println("\n Enter The Value Of Length :");
		len=s.nextDouble();
		System.out.println("\n Enter The Value Of Bredth :");
		bred=s.nextDouble();
		i.getdata(len,bred);
		i.computdata();
		
	}
}