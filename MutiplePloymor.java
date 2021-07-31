//Wap to demo of compile time polymorphism
class Mona
{
  void msg()
  {
     System.out.println("fbvjkghtkghkt,jm ");
  }
}
class Prabhu extends Mona
{
  void msg()
  {
     System.out.println("5445455965586");
  }
}
class Neha extends Prabhu
{
  public static void main(String arg[])
  {
     //Neha p = new Neha();
	// p.msg();
	 
	 Mona o,o1;
	 o= new Neha();
	 o.msg();
     o1= new Mona();
	 o1.msg();
	 }
}

