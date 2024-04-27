package java_Intro;
 class This {
int x=5;
	public void show()
{
	int x=10;
	System.out.println(x+" : local variable");
	System.out.println(this.x+" : instance variable");
	
}
	
void display()
{
	System.out.println("display method");
this.show();
}
	
	
	public static void main(String args[])
	{
		
		This obj=new This();
		obj.show();
		obj.display();
		
		
		
	}



}
