class Teacher
{
  int a=10;
}
class Student extends Teacher
{
  int a=20;
  void display()
  {
    System.out.println(" The Value of a is : "+super.a);
  }
}
class Result extends Student
{
  int a=30;
  void display()
  {
    System.out.println(" The Value of a is : "+a);
    System.out.println(" The Value of a is : "+super.a);
	super.display();
  }
  public static void main(String arg[])
  {
    Result r = new Result();
	r.display();
  }
}