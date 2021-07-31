//THis is use to invoke the current class method
class Mona
{
   void m()
   {
   	  System.out.println(" We are in M Method");
   }
   void n()
   {
      this.m();
	  System.out.println(" We are in N Method");
   }
   void p()
   {
      this.n();
	  System.out.println(" We are in P Method");
   }
   public static void main(String Arg[])
   {
     Mona m =new Mona();
	 m.p();
   }
}