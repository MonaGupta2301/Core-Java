//Wap to find Positive an Negative,Zero Numbers
import java.util.Scanner; 
class Even
{
  public static void main( String agrs[])
  {
     int num;
	 Scanner sc = new Scanner(System.in); 	
     System.out.println(" \n Enter Any Number :");
	 num = sc.nextInt();
	 if(num>0)
	 {
	   System.out.println(" \n Entered Number is positive :");
	 }
	 else if( num<0)
	 {
	   System.out.println(" \n Entered Number is Negative :");
	 }
	 else
	 {
	   System.out.println(" \n Entered Number is Zero :");
	 }
  }
}