// WAP To Demo of Addition Of Two Number By Extracting Value From The Keyboard
import java.util.Scanner;
class Input
{
   public static void main( String args[])
   {
     int a,b,c;
	 Scanner s = new Scanner(System.in);
	 System.out.println("\n Enter The Value Of First Number : ");
	 a=s.nextInt();
	 System.out.println("\n Enter The Value Of Second value :");
     b=s.nextInt();
     c=a+b;
	 System.out.println("\n Addition od Two NumberIs : "+c);
   }
}