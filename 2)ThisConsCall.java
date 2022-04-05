//Thise can be use for the Current ckass constructor
class Test
{
  int x,y;
  Test()
  {
    System.out.println(" We Are In Default Consturctor ");  
  }
  Test(int a,int b)
  {
    this();
	x=a;
    y=b;	
  }
  void add()
  {
    System.out.println(" Additon of Two number is :"+(x+y));
  }
  public static void main(String arg[])
  {
     Test t = new Test(16,87);
	 t.add();
  }




}
