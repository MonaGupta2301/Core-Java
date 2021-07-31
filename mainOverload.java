//Wap To Overload Main()
class Mona
{
   public static void main(int a)
   {
       System.out.println(" A is :"+a);
   }
   public static void main(String agrs[])
   {
       System.out.println("in main");
	   main(10);
   }
}
/*
*********OUTPUT*************

C:\java Programs>javac methodOverloading.java

C:\java Programs>java Mona
 Sum is : 300
 Sum is : 56.0

C:\java Programs>*/
