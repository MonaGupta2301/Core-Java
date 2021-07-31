//Wap to demo of Static
class mmm
{
   public int x=20;
   public static int y=29;
   public void sub()
   {
      System.out.println("\n The Value of X is : "+x);
	  System.out.println("\n The Value of y is : "+y);
   }
   public static void sum()
   {
	  mmm n =new mmm(); 
      System.out.println("\n The Value of X is : "+n.x);
	  System.out.println("\n The Value of y is : "+y);
	  System.out.println("\n Sub After Static Method ");
      n.sub();	  
   }
   public static void main( String args[])
   {
      mmm m =new mmm();
	  m.sub();
	  mmm.sum();
   }
}