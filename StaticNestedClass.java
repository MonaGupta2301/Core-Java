class Outer
{
	 static int data=20;
	 static void print()
	 {
		 System.out.println(" Level Up...");
	 }
     static class Inner
	 {
	     void Display()
		 {
			 System.out.println(" The value of Data is :"+data);
			 print();
		 }
	 }
	 public static void main(String arg[])
	 {
          Outer.Inner oi=new Outer.Inner();
          oi.Display();		  
     }
}