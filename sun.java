class Sun
{
     public static void main(String arg[])
	 {
		   System.out.println(" Welcome in java");
		   System.err.println(" Welcome in java");
		   try
		   {
		   int i = System.in.read();
		   System.out.println((char)i);
		   }
		   catch(Exception e)
		   {
			    System.out.println(" All_Done");
		   }
	 }
}