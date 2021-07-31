//wap to demo of  Multithreading
class Mona extends Thread 
{
	 public void run()
	 { 
	       for(int i =0;i<5;i++)
		   {
		        try
		        {
			         Thread.sleep(500);
		        }
				catch(Exception e)
				{
					System.out.println(e);
				}
				System.out.println(i);
		   }
	 }
      public static void main(String srg[])
	  {  
		    Mona m = new Mona();
		    Mona m1 = new Mona();
			m.start();
			Mona m2 = new Mona();
			m1.start();
	  }
}