//Wap TO Complete The Assignment Number no.
//Price.java
import java.util.Scanner;
class price
{   
   double cost,p;
   final double tax=7.5;
   int num;
   void order(double cost,int num)
   {   
      System.out.print("\n Order      : "+ num +" x $"+ cost+"\n" );  
   }
   void Subtotal(double cost,int num)
   {
      System.out.print("\n Subtotal   : $"+(num*cost)+"\n");
   }
   void tax(double cost,int num)
   {
      p=((tax/100)*(num*cost));
      System.out.print("\n tax(7.5%)  : $"+p+"\n");
   }
   void total(double cost,int num)
   {   
      System.out.print("\n Total      : $"+((num*cost)+p));  
   }
   public static void main( String args[])
   {
      double Cost_Item ;
      int Num_of_item;
	  Scanner s = new Scanner(System.in);
	  price p = new price();
	  System.out.print("\n Enter The Cost of Item : ");
	  Cost_Item=s.nextDouble();
	  System.out.print("\n Enter The Number of Item : ");
	  Num_of_item=s.nextInt();
      p.order(Cost_Item , Num_of_item);
      p.Subtotal(Cost_Item , Num_of_item);	  
	  p.tax(Cost_Item , Num_of_item);
	  p.total(Cost_Item , Num_of_item);
   }
}
/*
  output:
   
  
C:\java Programs>java price

 Enter The Cost of Item : 23.65

 Enter The Number of Item : 3

 Order      : 3 x $23.65

 Subtotal   : $70.94999999999999

 tax(7.5%)  : $5.321249999999999

 Total      : $76.27124999999998
C:\java Programs>javac Price.java

C:\java Programs>java price

 Enter The Cost of Item : 99.99

 Enter The Number of Item : 3

 Order      : 3 x $99.99

 Subtotal   : $299.96999999999997

 tax(7.5%)  : $22.497749999999996

 Total      : $322.46774999999997
C:\java Programs>javac Price.java


*/