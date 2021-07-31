//Lets prove it that this keyword reffer the current object
class Mona
{
   void display()
   {
      System.out.println("\n The Value of This of class Mona is : " +this);
   }
   void show()
   {
	System.out.println("\n The Value of This of class Mona is : " +this);   
   }
   public static void main(String args[])
   {
      Mona m = new Mona();
      Mona m1=new Mona();	  
	  System.out.println("\n The Value of Object of Class Mona is : "+m);
      m.display();
	  System.out.println("\n The Value of Object of Class Mona is : "+m1);
      m1.show();
   }
}
