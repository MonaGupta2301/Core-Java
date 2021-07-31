//Wap to Overload The Static Method
class Mini
{
  static void Disp()
  {
    System.out.println(" We are in Display Method Which Does Not Have An Agrgument ");
  }
  static void Disp(String Name)
  {
    System.out.println(" We are in Display Method Which Have An Agrgument :"+Name);
  }    
  public static void main( String Arg[])
  {
	Mini.Disp(); 
    Mini.Disp("Interview");	
  }
}
/*
********OUTPUT**********

C:\java Programs>javac OverloadStaticMethod.java

C:\java Programs>java Mini
 We are in Display Method Which Does Not Have An Agrgument
 We are in Display Method Which Have An Agrgument :Interview

C:\java Programs>*/