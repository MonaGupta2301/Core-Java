//Wap to demo of Method Overloading
class Mona
{
   protected int sum(int a,int b)
   {
     return(a+b);
   }
   
   protected double sum(double x,double y)
   {
     return(x+y);
   }
   public static void main(String arg[])
   {
     Mona m = new Mona();
	 System.out.println(" Sum is : "+m.sum(100,200));
	 System.out.println(" Sum is : "+m.sum(33.0,23.0));
   }
}
/*
*********OUTPUT***********

C:\java Programs>javac methodOverloading.java

C:\java Programs>java Mona
 Sum is : 300
 Sum is : 56.0

C:\java Programs>*/