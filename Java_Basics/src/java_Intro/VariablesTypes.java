package java_Intro;
class test
{
	static int sam=69;
}
public class VariablesTypes extends test{
int x=10;
static int sam=69+143;
public static void main(String args[])
{
	System.out.println("Main Class variable "+VariablesTypes.sam);
	System.out.println("test Class Variable "+test.sam);
	System.out.println("Anounms Object :"+new VariablesTypes().x);
	VariablesTypes vt=new VariablesTypes();
	System.out.println("Object Reference "+vt.x);
	System.out.println(sam+2);
}
}
