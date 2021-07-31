class MO 
{ 
        protected static class Inner
		{
			 void print()
			 {
				   System.out.println(" Mona Gupta");
			 }
		}
        public static void main(String arg[])
		{
			MO.Inner  i  = new MO.Inner();
			i.print();
			System.out.println("123456");
		}
}