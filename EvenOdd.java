//Wap to find Even an Odd Numbers
import java.util.Scanner; 
class Even
{
  public static void main( String agrs[])
  {
     int num;
	 Scanner sc = new Scanner(System.in); 	
     System.out.println(" \n Enter Any Number :");
	 num = sc.nextInt();
	 if((num/2)*2==num)
	 {
	   System.out.println(" \n Entered Number is Even :");
	 }else
	 {
	   System.out.println(" \n Entered Number is Odd :");
	 }
  }
}