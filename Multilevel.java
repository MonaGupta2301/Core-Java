//Wap to demo of MultiLevel level Inheritance
class Base
{
    void print()
	{
	   System.out.println(" We are in base Class.");
	}
}
class Inter extends Base
{
	void Display()
	{
        System.out.println(" We are in Intermediate Class.");
	}
}
class Derived extends Inter
{
  public static void main(String arg[])
  {
    Derived d = new Derived();
	System.out.println(" We Are in Derived Class .");
    d.print();
	d.Display();
  }
}
/*
**********OUTPUT***********

C:\java Programs>javac multilevel.java

C:\java Programs>java Derived
 We Are in Derived Class .
 We are in base Class.
 We are in Intermediate Class.

C:\java Programs>*/