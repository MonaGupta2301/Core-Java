// Wap to demo of Static binding
class Animal
{
  void display()
  {
    System.out.println(" Animal Eating....");
  }
}
class Dog extends Animal
{
  void display()
  {
    System.out.println(" Dogs Eating....");
  }
  public static void main(String arg[])
  {
     Dog d = new Dog();
	 d.display();
  }
}