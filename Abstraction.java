/*Abstraction is nothing but the process which is used to hide the 
implementation details and shoes the functionality details*/
abstract class Bike
{
   static int x=199;
   Bike()
   {
	  System.out.println(" Mona Gupta ...");
   }
   static void Disp()
   {
	   System.out.println(" The value of X is : "+x);
   }
   static 
   {
	   System.out.println(" Neha Sahu ...");
   }
   abstract void Run();
}
class Honda extends Bike
{
  Honda()
  {
	  System.out.println(" Prabhu Gupta ...");
  }
  void Run()
  {
     System.out.println(" Bike Is Running ,,, ");
  }
  public static void main(String arg[])
  {
     Honda h = new Honda();
	 h.Run();
	 Bike.Disp();
  }
}