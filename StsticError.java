//Wap to Overload The Static Method
class Error
{
  static void Disp()
  {
    System.out.println(" We are in Static Display Method ");
  }
  void Disp()
  {
    System.out.println(" We are in Non Static Display Method ");
  }    
  public static void main( String Arg[])
  { 
    Error E =new Error();
	E.Disp();
  }
}