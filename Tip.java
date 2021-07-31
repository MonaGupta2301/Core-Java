// Wap For Assingment num two
//Tip.java
import java.util.Scanner;
class Tip
{
   double cost;
   final double x=0.1 , y=0.15 , z=0.2;
   void tip(double cost)
   {
      System.out.print(" Meel     : $"+cost+"\n\n");
      System.out.print(" 10% Tip  : $"+(x*cost)+"\n\n");
      System.out.print(" 15% Tip  : $"+(y*cost)+"\n\n");
      System.out.print(" 20% Tip  : $"+(z*cost)+"\n\n");
   }
   public static void main(String args[])
   {
      double meel;
	  Tip t = new Tip();
	  Scanner s = new Scanner(System.in);
	  System.out.print(" Pelase Enter the cost of meel : ");
	  meel=s.nextDouble();
	  t.tip(meel);
   }
}

/*
  output:
   
  C:\java Programs>javac Tip.java

  C:\java Programs>java Tip
 Pelase Enter the cost of meel : 236.56
 Meel     : $236.56

 10% Tip  : $23.656000000000002

 15% Tip  : $35.484

 20% Tip  : $47.312000000000005


C:\java Programs>   

   
 */