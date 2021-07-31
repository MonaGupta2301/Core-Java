//Wap to demo of instnceof operator or keyword
class Animal
{
   void msg()
   {
     System.out.println("Animals Are Eating...");
   }
}
class Dogs extends Animal
{
  public static void main(String arg[])
  {
    Dogs d =null;
	//String x=null;
	System.out.println(d instanceof Dogs);
  }
}
   