//Wap to demo of Console Class
import java.io.Console;
class ReadPass
{
	  public static void main(String arg[])
	  {
		  Console s1= System.console();
		  System.out.println(" Enter Your password :");
		  char[] s=s1.readPassword("Mona",s1);
		  String s2=String.valueOf(s);
		  System.out.println(" Password is : "+s2);
	  }
}