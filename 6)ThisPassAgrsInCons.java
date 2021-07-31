//Wap to Pass the This keyword in parameterized consytructor
// What is the Agenda --> Mujhe Sonu K Data Memder ko Monu me Use karna hai.
class Monu
{
  Sonu s;
  Monu(Sonu n)
  {
    s=n;
  }
  void display()
  {
     System.out.println("This the value of x Whixh is the data of Class Sonu :"+(s.x));
  }
}
class Sonu
{
   int x =100;
   Sonu()
   {
     Monu m = new Monu(this);
	 m.display();
   }
   public static void main(String args[])
   {
     Sonu s1=new Sonu();
   }
}