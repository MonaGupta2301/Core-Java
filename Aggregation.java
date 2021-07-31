class Employee
{
   int id;
   String name;
   Address address;
   public Employee(int id,String name,Address address)
   {
      this.id=id;
	  this.name=name;
	  this.address=address;
   }
   void display()
   {
     System.out.println(" id is --> "+id+" Name is -->"+name);
     System.out.println(" City is --> "+address.city+" State is -->"+address.state+" Country is -->"+address.country);
   }
   
   public static void main(String arg[])
   {
      Address a1= new Address("Amravati","Maharashtra","India");
      Address a2= new Address("Betul","Madya_Pradesh","India");
      Employee e1=new Employee(1234,"Seeta",a1);
      Employee e2=new Employee(3445,"Ram",a2);
	  e1.display();
	  e2.display();
   }
}