abstract class Mona
{
  Mona()
  {
	  System.out.println("Mona.......");
  }
  {
    System.out.println(" Abstract Class ");	
  }
  abstract void run();
}
class Prabhu extends Mona
{
  Prabhu()
  {
	  System.out.println(" Prabhu's Constructors");
  }
  void run()
  {
    System.out.println("The value of x is :");
  }
  public static void main(String arg[])
  {
    Prabhu m = new Prabhu();
	m.run();
  }
}