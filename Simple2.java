class Simple2
{
     public static void main(String arg[])
	 {
		 int j=1,s=0;
		 while(j<10)
		 {
			    System.out.println(j+"+");
				s=s+j;
				j=j+j%3;
		 }
		 System.out.println("="+s);
	 }
}