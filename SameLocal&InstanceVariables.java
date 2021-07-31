//Wap to Demo of This keyword
class Minu
{
   int age;
   double per;
   String name ;
   void display(int age,double per,String name)
   {
     age=age;
	 per=per;
	 name=name;
   }
   void show()
   {
     System.out.println("\n Age is -->"+age+"\n Persentage-->"+per+"\n name -->"+name);
   }
   public static void main(String arg[])
   {
     Minu m =new Minu();
	 m.display(10,87.65,"Mona");
	 m.show();
   }
}