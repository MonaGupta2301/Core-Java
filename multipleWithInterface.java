//Multiple inheritance with the help of interface
interface Base1
{
  void Run();
}
interface Base2
{
  void Run_Fast();
}  
class Multiple implements Base1,Base2
{
  public void Run()
  {
     System.out.println(" Start Running....");
  }
  public void Run_Fast()
  {
      System.out.println(" Run Fast..");
  }
  public static void main(String arg[])
  {
     Multiple m = new Multiple();
	 m.Run();
	 m.Run_Fast();
  }
}