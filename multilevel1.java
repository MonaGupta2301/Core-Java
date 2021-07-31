//Wap to demo of Heirchical level Inheritance
class Square
{
	void Area_Square()
	{
        System.out.println(" Area of Square is : "+(2*2));
	}
}
class Square1 extends Square
{
	void Area_Square()
	{
        System.out.println(" Area of Square is : "+(3*3));
	}
}
class Text extends Square1
{
   public static void main(String arg[])
   {
     Text t =new Text();
     t.Area_Square();
     t.Area_Square();
   }
}
