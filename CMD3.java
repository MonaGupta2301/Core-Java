class CMD3
{
   int n ;
   public int display(int s)
   {
     n=s;
	 return(n*n);
   }
   public static void main(String arg[])
   {
     CMD3 obj = new CMD3();
	 String c1;
	 c1=arg[0];
	 int v = Integer.parseInt(c1);
	 System.out.println(" Square is :"+obj.display(v));
   }
}