class Outer2 
{
	   static class Inner2 
	   {
		   static void disp()
		   {
                System.out.println(" Display Method in Inner class");
		   }			   
	   }
	   public static void main(String arg[])
	   {
		    Outer o = new Outer();
			Inner n = new Inner2();
		    n.disp();
	   }
}