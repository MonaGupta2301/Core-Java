class Demo
{
  public static void main(String arg[])
  {
	  StringBuffer s= new StringBuffer();
   
      System.out.println("Current Capacity is :"+(s.capacity()));   
      System.out.println("After Append Hello s is:"+(s.append("Hello")));   
      System.out.println("Capacity Aftter Appending Hello is :"+(s.capacity())); 

      System.out.println("Now Appending :Mona Rajesh Gupta Leaves in Amravati: "+s.append("Mona Rajesh Gupta Leaves in Amravati"));   	  
      System.out.println("updated Capacity is :"+(s.capacity()));
 
      s.ensureCapacity(10);
      System.out.println(s.capacity()); 
  
      s.ensureCapacity(50);
	  System.out.println(s.capacity()); 
  
  
  }
}
