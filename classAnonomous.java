//Wap to demo of Anonomous Object
/* A class Which is declared inside the class ,ouside the method And Does not Contain name
is known as Annonomous Class*/
abstract class Person
{
     abstract void Eat();
}
class Emp
{
	   public static void main(String arg[])
	   {
		       Person p = new Person()
			   {
				   void Eat()
					{
                        System.out.println("Got it...");
					}						 
			   }
			   p.Eat();
	   }
}