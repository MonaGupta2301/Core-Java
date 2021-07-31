//super keyword is used to invoked the parent class constructor
class Teacher
{
  Teacher()
  {
     System.out.println(" Constructor of Teacher Class ");	 
  }
}
class Student extends Teacher
{
   void method()
   {
      System.out.println(" Method of Student Class ");
	  
   }
   public static void main(String arg[])
   {
      Teacher s = new Student();
      s.method();
	  
	  
   }
}