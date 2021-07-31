abstract class Shap
{
  abstract void Show();
}
class Rectangle extends Shap
{
	void Show()
	{
	  System.out.println(" Inside the Rectangle Class");	
	}
}
class Circle extends Shap
{
	void Show()
	{
	  System.out.println(" Inside the Circle Class");	
	}
	public static void main(String arg[])
	{
	  Circle s = new Circle();
	  s.Show();
	  
	  Shap s1 = new Rectangle();
	  s1.Show();
	}
}