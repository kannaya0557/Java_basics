package java_Intro;

public class Operators {
public static void main(String args[])
{
	
	
	int a=10;
	int b=30;
	int result = (a>b)?a:b;
	System.out.println("The greatest value :"+result);
	
	result=(a>b)?(a+b):(a-b);
	System.out.println(result);
	
}
}
