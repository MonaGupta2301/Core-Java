class M1
{
	M1()
	{
	        System.out.println(" Constructor od M1...");	
	}
    static void msg()
	{
		System.out.println(" Static method...");
	}
}
class M2 extends M1
{
	  M2()
	  {
		  System.out.println(" Constructor od M2...");	
	  }
	  
	  M2(int n)
	  {
		  this();
		  System.out.println(" Constructor od M2..."+n);	
	  }
     public static void main(String arg[])
	 {
		  new M2(23).msg();
	 }
}