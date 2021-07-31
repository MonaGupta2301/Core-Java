//Wap to demo of Method Overriding.
class Bank
{
  int getRateOfInterest()
  {
     return 0;
  }
}
class SBI extends Bank
{
  int getRateOfInterest()
  {
     return 0;
  }
}
class ICICI extends Bank
{
  int getRateOfInterest()
  {
     return 0;
  }
}
class Axis extends Bank
{
  int getRateOfInterest()
  {
     return 0;
  }
}
class Main
{
  public static void main(String arg[])
  {
    SBI sbi = new SBI();
	sbi.getRateOfInterest();
  }
}





