package java_Intro;

public class Constructors {

public	Constructors()
	{
	
		System.out.println("non parametized constructors");
		
	}

public Constructors(int x)
{

	this();
	System.out.println("Parametrized Constructors");
	System.out.println(x);

}

	public static void main(String args[])
	{
Constructors obj=new Constructors();
	obj=new Constructors(10);
	}
}
