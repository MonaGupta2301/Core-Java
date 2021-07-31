class Threading extends Thread
{
	public void run()
	 {   
	     try
		   {
		        for(int i=0;i<=4;i++)
		       {
			       Thread.sleep(500);
				   System.out.println(i);
		       }
	       }
		   catch(Exception e)
		   {
			     System.out.println(e);
		   }
	 }
     public static void main(String arg[])
	 {
            Threading t = new Threading();
			Threading t1 = new Threading();
			Threading t3 = new Threading();
			 t.start();
			 t3.start();			 
		     try
			{
			  t3.join(1000);	
			}
			catch(Exception e)
			{
				  System.out.println();
			}
			t1.start();
			 
	 }		
}