class Run implements Runnable
{
	  public void run()
	  {
	      System.out.println(" Thread Executing ...");
	  }
	   public static void main(String arg[])
	   {
		     Runn r=new Runn();
			 Thread t = new Thread(r);
			 r.start();
	   }
}