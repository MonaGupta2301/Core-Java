/*A class which is declared inside the class but outside the method is known as Member Inner Class
 Invokation of member inner class*/
 //wap to demo of member inner class that is invoked inside the class
 class Outer
 {
	   private int data=10;
	   class Inner
	   {
		    void display()
			{
                  System.out.println(" Memeber Inner Class ");
			}	
            public static void main(String arg[])
			{

			}				
	   }			
			void show()
			{
				  Inner ob = new Inner();
	              ob.display();			  
			}
			public static void main(String m[])
			{
				   Outer obj = new Outer();
				   obj.show();
			}
	   
 }