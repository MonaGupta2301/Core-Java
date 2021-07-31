class Minu
{
	final void run()
    {
        System.out.println(" * * * * * * * Hello World * * * * * * ");
    }
}
class FinalMethod extends Minu
{
    final void run()
    {
        System.out.println(" 444* * * * * * * Hello World * * * * * * ");
    }
     public static void main(String arg[])
    {
        FinalMethod fm = new FinalMethod();
        fm.run();
       //fm.run(10);
    }   
}

