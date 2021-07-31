// Wa[ to demo of  Constructor 
class Mona
{
   int x,y;
   Mona()
   {
     x=10;
     y=10;	 
   }
   public void show()
   {
     System.out.println(" Addition of x and y is : "+(x+y));
   }
   public static void main( String arg[])
   {
      Mona m=new Mona();
	  m.show();
   }

}