//Wap for Assignment 3
//Wap to convert to tempreature
import java.util.Scanner;
class Temp
{
  double Celsius;
  double cal;
  void Fer(double Celsius)
  {
    cal=((Celsius*(9/5.0))+32);
	System.out.print("\n Fahrenheit : "+cal+"F");
  }
  public static void main( String args[])
  {
    double c;
	Temp t = new Temp();
	Scanner s = new Scanner(System.in);
	System.out.print("\n Enter The Temperature : ");
	c=s.nextDouble();
	t.Fer(c);
  }
} 
/*
 output 
 
  C:\java Programs>javac Temparature.java

C:\java Programs>java Temp

 Enter The Temperature : 21.5

 Fahrenheit : 70.7F
C:\java Programs>javac Temparature.java

C:\java Programs>java Temp

 Enter The Temperature : 38.6

 Fahrenheit : 101.48F
C:\java Programs>
*/