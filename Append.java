//Wap to demo of Append Class
class App
{ 
  public static void main(String arg[])
  {
     StringBuffer sb = new StringBuffer("Mona");
	 StringBuffer s = new StringBuffer();
	 System.out.println(s.capacity());
//	 System.out.println(sb.append("Gupta"));
	 System.out.println(sb.insert(2,"Gupta"));
  }
}