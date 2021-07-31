//Wap to Demo of Instant initializer block
class Gupta
{
  Gupta()
  {
    System.out.println(" Mona Gupta...");
  }
  Gupta(int a)
  {
	this();
	System.out.println(" Value of x is :"+a);
  }
  {
    System.out.println(" Prabhu Gupta...");
  }
  public static void main(String arg[])
  {
    Gupta g = new Gupta();
	Gupta n = new Gupta(10);
  }
}