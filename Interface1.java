interface Mona
{ 
  int x;
  static
  {
	 x = 20;
  }
  void show();
}
class Display implements Mona
{
  public void show()
  {
    System.out.println(" The value of x is : "+x);
  }
  public static void main(String arg[])
  {
    Display d = new Display();
    d.show();
  }
}