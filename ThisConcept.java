//Wap to Demo of This keyword
class Minu
{
   int age;
   double per;
   String name ;
   void display(int age,double per,String name)
   {
     this.age=age;
	 this.per=per;
	 this.name=name;
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
/*
**********OUTPUT**********
C:\java Programs>javac ThisConcept.java

C:\java Programs>java Minu

 Age is -->10
 Persentage-->87.65
 name -->Mona

C:\java Programs>*/