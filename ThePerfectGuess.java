//Wap to Develop the Perfect Guess
import java.util.Scanner;
import java.util.Random;
class Guess
{
   public static void main( String Agrs[])
   {
      int RandomSelect,UserSelect;
	  int user=0,ran=0,guess=0;
	  Scanner s = new Scanner(System.in);
      Random r = new Random();
	  RandomSelect=r.nextInt(100);
	  System.out.println(" The Perfect Guess " );
	  System.out.println(" ********************************** ");
	  System.out.println(" Rules : Compiler Selected number of its own\n now you have to guess that number  ");
	  UserSelect = 0;
	  while(RandomSelect != UserSelect)
	  {   
		  System.out.println(" Guess The Number between 1 to 100 : "); 
	      UserSelect=s.nextInt();
	      guess=guess+1;
		  if(RandomSelect>UserSelect)
		  {
              System.out.println(" ********************** ");			  
		      System.out.println(" Enter The Greater Number From Which You Entered");
		  }
		  else if(RandomSelect == UserSelect )
		  {	
      		break ;
		  }
		  else
		  {
              System.out.println(" ********************** ");
			  System.out.println(" Enter The Smaller Number From Which You Entered");
	      }
	  }
	  if(RandomSelect==UserSelect)
		  {
			  System.out.println(" You Guess it correct ");
			  System.out.println(" ********************** ");
			  System.out.println(" You Guess It in "+ guess + " guesses");			  
		  }
    }
}