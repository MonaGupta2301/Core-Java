//wap to demo of member inner class that is invoked inside the class
 class Outer
 {
	   private int data=10;
	   class Inner
	   {
		    void display()
			{
                  System.out.println(" Mona Gutpa");
			}	
	   }
 }
 class Test
 {
	   public static void main(String m[])
		{
		    Outer obj = new Outer();
			Outer.Inner ob = obj.new Inner();
			ob.display();
	        //obj.new Inner().display();
		}
	   
}