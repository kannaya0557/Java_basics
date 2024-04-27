package java_Intro;
class Employee
{
	int empId=552;
	void show()
	{
		System.out.println("Employee");
	}
	
	
}
class Inheritence extends Employee
{
	int StId=557;
	int empId=1;
	
	void show()
	{
		System.out.println("Student");
	}
	void display()
	{
		int empId=2;
		System.out.println("student");
		System.out.println(empId);
		System.out.println(this.empId);
		System.out.println(super.empId);
		System.out.println(StId);
		show();
		this.show();
		super.show();
	}
	public static void main(String args[])
	{
		Inheritence obj=new Inheritence();
		System.out.println(obj.empId);
		System.out.println(obj.StId);
		obj.display();
		obj.show();
		
		
	}
	
	
}
