//Wap to demo of Instance Initializer block
class Mona
{
  Mona()
  {
     System.out.println(" Mona Gupta In Constructor ");
  }
  void run()
  {
	 {
     System.out.println(" Mona Gupta Inside the instance initializer block ");  
     }
  }
  public static void main(String arg[])
  {
    Mona m = new Mona();
	m.run();
  }
}