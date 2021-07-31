//Wap to demo of to string method
class Method
{ 
   int Roll;
   String Name;
   String City;
   
   Method(int Roll,String Name,String City)
   {
     this.Roll=Roll;
     this.Name=Name;
     this.City=City;
   }
   
   public String toString()
   {
	   return Roll+" "+Name+" "+City;	
   }
   
   public static void main(String arg[])
   {
      Method m1 = new Method(123,"Rohan","Indore");
	  Method m2 = new Method(321,"sohan","Hydrabad");
	  
	  System.out.println(m1);//m1.toString
	  System.out.println(m2);//m2.toString
   }
}