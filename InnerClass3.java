//wap to demo of member inner class that is invoked inside the class
 class Outer
 {
	   private static int data=10;
	   class Inner
	   {
		    void display()
			{
                  System.out.println(" Data is : "+data);
			}
			public static void main(String m[])
			{
	        	new Inner().display();
			}	
	   }			
	   
 }