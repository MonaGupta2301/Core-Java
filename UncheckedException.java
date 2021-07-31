import  java.io.IOException;
class Mona
{
	void m()
	{
		throw new IOException(" Solve the Error");
	}
	void n()
	{
		 m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(IOException e)
		{
			 System.out.println("mona"+e);
		}
	}
   public static void main( String aed[])
   {
	    Mona m =new Mona();
		m.p();
        System.out.println(" <===== Rest Of The Code Executed ====> ");
   }
}