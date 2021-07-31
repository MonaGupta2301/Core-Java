// Wa[ to demo of  Constructor 
class Monaa
{
   int x,y;
   Monaa()
   {
	   System.out.println(" Wel comin java ");
   }
   Monaa(int x1,int y1)
   {
     x=x1;
     y=y1;	 
   }
   public void show()
   {
     System.out.println(" Addition of x and y is : "+(x+y));
   }
   public static void main( String arg[])
   {
      Monaa m=new Monaa(20,10);
	  Monaa n=new Monaa();
	  m.show();
   }
}