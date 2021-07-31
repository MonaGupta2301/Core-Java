class Teacher
{
  void msg()
  {
    System.out.println("  Mona....");
  }
}
class Student extends Teacher
{
  void msg()
  {
    System.out.println("  Gupta....");
  }
  public static void main(String arg[])
  {
     Teacher s = new Student();
	 s.msg();
  }
}