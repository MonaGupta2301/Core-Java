//wap to demo of Executed the non-static data member inside the static context
class A
{
	   int age=20;
	   String name="mona";
	   static String Institude="HVPM" ; //Ststic data Member
	   
	   public static void msg() // Static Method
	   {
		   A a=new A();
		   System.out.println(" Name is -->"+a.name+"  age -->"+a.age);
		   System.out.println(" Institude Name is -->"+Institude);
	   }
	   
	   public static void main(String arg[])
	   {
		    msg();
	   }
}
/*
***********OUTPUT**********

C:\java Programs>javac static1.java

C:\java Programs>java A
 Name is -->mona  age -->20
 Institude Name is -->HVPM

C:\java Programs>*/