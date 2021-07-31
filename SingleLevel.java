//Wap to demo of Single level Inheritance
class Base
{
    void print()
	{
	   System.out.println("Single Level Inheritance  .");
	}
}
class Derived extends Base
{
	public static void main(String arg[])
	{
      Derived d = new Derived();
      d.print();
    }
}
/*
********OUTPUT*********

C:\java Programs>javac SingleLevel.java

C:\java Programs>java Derived
Single Level Inheritance  .

C:\java Programs>*/