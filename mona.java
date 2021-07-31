class Mona
{
   String city,state;
   Input input;
   
   public Mona(String city,String state,Input input)
   {
      this.city=city;
	  this.state=state;
	  this.input=input;
   }
   
   void Display()
   {
      System.out.print(" Name is --> "+input.name+"\n Percent is --> "+input.per+"\n");
      System.out.print(" Roll_num is --> "+input.Roll_no+"\n city is --> "+city+"\n");
	  System.out.print(" State is --> "+state);
	  input.disp();
   }
   public static void main(String arg[])
   {
      Input i = new Input("Mona",3,78.90);
      Input i1 = new Input("Neha",5,88.64);
	  Mona m = new Mona("Mumbai","Maharashtra",i);
	  Mona m1 = new Mona("Betul","Madya_Pradesh",i1);
	  m.Display();
	  m1.Display();
   }
}