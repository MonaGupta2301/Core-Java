// Thise keyword isDiiferntiate
class Student
{
    int age;
	double per;
	String name;
    void get(int age,double per,String name)
	{
	  this.age=age;
	  this.per=per;
	  this.name=name;
	}
	void display()
	{
	  System.out.println("\n ge is : "+age+"\n Percentage is : "+per+"\n Name is : "+name);
	}
	public static void main(String args[])
	{
	   Student s =new Student();
	   s.get(23,65.78,"mona");
	   s.display();
	}
}