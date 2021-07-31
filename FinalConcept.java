//wap to Demo of Final keyword
class Prabhu
{
   static final int x;
   final int y= 20;
   static
   {
	   x=10;
   }
   void Demo()
   {
      System.out.println(" The Value of X is :"+x);
	  System.out.println(" The Value of Y is :"+y);
   }
   public static void main(String args[])
   {
       Prabhu p = new Prabhu();
       p.Demo();	   
   }
}
/*
*********OUTPUT*********
C:\java Programs>javac FinalConcept.java

C:\java Programs>java Prabhu
 The Value of X is :10
 The Value of Y is :20

C:\java Programs>*/