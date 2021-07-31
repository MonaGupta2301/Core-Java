class One
{
   Two d;
   One(Two obj)
   {
     d=obj;
   }
   void dis()
   {
     System.out.println(" Dta --> "+d.data);
   }
   
}
class Two
{
   int data =100;
   Two()
   {
      One o = new One(this);
	  o.dis();
   }
   public static void main(String arg[])
   {
     Two t = new Two();
   }
}