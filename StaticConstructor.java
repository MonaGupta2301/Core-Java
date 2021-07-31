//wap to demo can this keyword is used to refer the satatic member.
class M6
{
	static int age;
    void add(int age)
	{
		this.age=age;
		System.out.println(" Static method Abstarct class Printing the age :"+age);
	}
	public static void main(String arg[])
	{  
	    M6 ne=new M6();
        ne.add(10);	
	}
}