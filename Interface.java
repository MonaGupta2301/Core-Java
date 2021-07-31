//Wap to demo of interfase
interface Bike
{
  void run();
}
class Honda implements Bike
{
	public void run()
	{
      System.out.println(" Running Safely...");
 	}
	public static void main(String agr[])
	{
		Honda h = new Honda();
		h.run();
	}
}