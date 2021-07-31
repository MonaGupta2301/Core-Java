//Wap to return this 
class Mona
{
   Mona A()
   {
     System.out.println("We Are in A method");
     return this;
   }
   void msg()
   {
     System.out.println(" We Are in Mesage Method ");
   }
}
class Text
{
   public static void main(String arg[])
   {
     new Mona().A().msg();  
   }
}