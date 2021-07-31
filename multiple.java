//Wap to demo of multiple inheritance
class Base1
{
  void print()
  {
    System.out.println(" Multiple Inheritance does not support in java");
  }
}
class Base2
{
   void print1()
   {
     System.out.println(" Why Multiple Inheritance does not support in java");
   }
}
class Derive extends Base2
{
   void print()
   {
       System.out.println(" Multiple Inheritance does not support in java");
   }
}
class Main1
{
  public static void main(String arg[])
  {
     Derive d = new Derive();
	 d.print1();
  }
}