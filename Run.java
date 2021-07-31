import java.lang.Runnable;
class Run implements Runnable
{
	  public void run()
	  {
	      System.out.println(" Thread Executing ...");
	  }
	   public static void main(String arg[])
	   {
		     Run r=new Run();
			 Thread t = new Thread(r);
			 t.start();
	   }
}