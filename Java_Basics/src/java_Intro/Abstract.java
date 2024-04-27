package java_Intro;
abstract class a
{
	abstract void display();
	void show()
	{
		System.out.println("show method");
	}
a()
{
	System.out.println("welcome");
}
	
}
public class Abstract extends a{

	void display()
	{
	System.out.println("display");	
	}
	public static void main(String args[])
	{
		
		Abstract obj= new Abstract();
		obj.display();
		obj.show();
		
	}

	
	
}
