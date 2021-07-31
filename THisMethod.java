//Wap to Demo of This keyword
class Minu
{
   int age;
   double per;
   String name ;
   Minu(int age,double per,String name)
   {
     this.age=age;
	 this.per=per;
	 this.name=name;
   }
   Minu()
   {
      this(10,87.65,"Mona");
      System.out.println("\n Age is -->"+age+"\n Persentage-->"+per+"\n name -->"+name);
    
   }
   public static void main(String arg[])
   {
     Minu m =new Minu();
     //m.display();
	 //m.show();
   }
}
/* 
***********OUTPUT**********
C:\java Programs>javac ThisConcept.java

C:\java Programs>java Minu

 Age is -->10
 Persentage-->87.65
 name -->Mona

C:\java Programs>*/