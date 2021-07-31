class Access
{
            static int age;
            static String name;
            void student(int age,String name)
            {
                this.age=age;
				this.name=name;
				System.out.println("Refered");
             }
			 public static void main(String arg[])
			 {
			     Access a = new Access();
				 a.student(19,"Mona");
			 }
}