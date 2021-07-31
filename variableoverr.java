class Demo1
{
    int data=10;	  
}
class Demo2 extends Demo1
{
	  int data=20;
	  public static void main(String arg[])
	  {
		  Demo1 d = new Demo2();
		  System.out.println(" Data is ==>"+d.data);
	  }
}