//This is used to invoke the paramertiresed constructor
class Test
{
   int age;
   double per;;
   String name;
   Test(int a,double p)
   {
     age=a;
	 per=p;
   }
   Test(String n)
   {
    this(10,78.98);
	name=n;
   }
   void Disp()

   {
      System.out.println("\n ge is : "+age+"\n Percentage is : "+per+"\n Name is : "+name);
   }
   public static void main(String args[])
   {
      Test t =new Test("Mona");
	  t.Disp();
   }
}
