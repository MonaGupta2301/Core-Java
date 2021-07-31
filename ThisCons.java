class Mona
{
   int id ;
   String name ;
   Mona()
   {
     System.out.println(" Default Constructor ");
   }
   Mona(int id,String name )
   {
	 this();
     this.id=id;
	 this.name=name;
   }   
   void display()
   {
	 System.out.println(" id --> "+id+" Name --> "+name);
   }
   public static void main(String agr[])
   {
      Mona m = new Mona(111,"Mona");
      Mona m2 = new Mona(222,"Neha");
	  m.display();
	  m2.display();
   }
}