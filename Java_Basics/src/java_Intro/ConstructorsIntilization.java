package java_Intro;
class Emp
{
	int emp;
	float salary; 
	

	Emp(int emp,float salary)
	{
		this.emp=emp;
		this.salary=salary;
		//System.out.println(emp+"\t"+salary);
	}
}
public class ConstructorsIntilization {
public static void main(String args[])
{
	Emp e1=new Emp(0557,20000.00f);


System.out.println(e1.emp+"\t"+e1.salary);


}
}
