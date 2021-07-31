//Wap to demo of to inherit the Static method.
class Mona
{
  static void Run()
  {
     System.out.println("  Hello World ");
  }
}
class Minu extends Mona
{
  public static void main(String arg[])
  {
    Minu m = new Minu();
	m.Run();
  }
}
/*
*********OITPUT**********

C:\java Programs>javac StaticMethodInherit.java

C:\java Programs>java Minu
  Hello World

C:\java Programs>*/