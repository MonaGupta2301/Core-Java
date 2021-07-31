//This is use to pass as an argument in Method
class Minu
{
   void m(Minu n)
   {
      n.d();
      System.out.println(" We are in M Method");
   }
   void p()
   {
      m(this);
      System.out.println(" We are in P Method");
   }
    void d()
   {
      System.out.println(" We are in D Method");
   }
   public static void main(String args[])
   {
      Minu m = new Minu();
	  m.p();
   }
}