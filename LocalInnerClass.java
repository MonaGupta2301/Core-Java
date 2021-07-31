class OuterFinal
{
    private int data=100;
	void display()
	{
		final int value=56;
		class Local
		{
		           final void msg()
			      {
                        System.out.println(" Instaance Variables "+data);
                        System.out.println(" Local variable  "+value);
			      }		
		}				  
	    	Local i = new Local();
	    	i.msg();
	}
	public static void main(String arg[])
	{
		 OuterFinal o = new OuterFinal();
		 o.display();
	}
}