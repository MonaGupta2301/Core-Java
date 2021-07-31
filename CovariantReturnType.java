//Wap to deo of Covariant Return Type
class Animal
{
  Animal get()
  {
	  System.out.println(" Inside the Animal Class ");
	  return this;
  }
}
class Dog extends Animal
{
  Dog get()
  {
	  System.out.println(" Inside the Dog Class ");
	  return this;
  }
  public static void main(String arg[])
  {
	 new Dog().get();
  }
}