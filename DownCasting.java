//Wap to demo of DownCasting
class Animal
{
  void msg()
  {
     System.out.println(" INSide the Animal Class...");
  }
}
class Dogs extends Animal
{
  static void display(Animal a) //a=new Dogs();
  {
	  Dogs d1 =(Dogs)a;
	  System.out.println("Downcasting Perform...");
	  d1.msg();
  }
  public static void main(String arg[])
  {
    Animal d = new Dogs(); //upcasting
    Dogs.display(d);
  }
}