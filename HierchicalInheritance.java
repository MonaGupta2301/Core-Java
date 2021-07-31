//Wap to demo of Heirchical  Inheritance
class Area
{
    double len,bred,Side;
    void Getdata()
	{
	   len=10.2;
       bred=11.3;
       Side=2.4;	   
	}
}
class Square extends Area
{
	void Area_Square()
	{
        System.out.println(" Area of Square is : "+(Side*Side));
	}
}
class Rectangle extends Area
{
    void Area_Rectangle()
	{
	    System.out.println(" Area of Rectangle is : "+(len*bred));
	}
}
class main
{
   public static void main(String arg[])
   {
      Square s = new Square();
	  //s.Getdata();
	  s.Area_Square();
	  Rectangle r = new Rectangle();
	  r.Getdata();
      r.Area_Rectangle();
   }
}
/*
***************OUTPUT***********


C:\java Programs>javac HierchicalInheritance.java

C:\java Programs>java main
 Area of Square is : 0.0
 Area of Rectangle is : 115.26

C:\java Programs>*/