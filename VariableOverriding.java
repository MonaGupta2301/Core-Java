// Variable overriding
//Complile Time Polymorphism
class A
{
  protected int a=10;
}
class B extends A
{
  int a=20;
  void Display()
  {
	  System.out.println(" The Value of a is : "+a);
  }
  public static void main(String arg[])
  {
	B b = new B();
	b.Display();
  }
}