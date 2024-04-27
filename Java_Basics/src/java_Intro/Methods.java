
package java_Intro;
import java.util.*;
	class sam
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		int check(int a ,int b)//return & argument
		{
			int result=(a>b)?a:b;
			return result; 
		}
	    int array(int[] a)//return & argument
	    {
	    	int sum=0;
	    	for(int b:a)
	    	{
	    		sum=sum+b;
	    	}
	    	 return sum;
	    }
	    int cube(int a)//return & argument
	    {
	    	int cub=a*a*a;
	    	return cub;
	    }
	  public String  display()//only return
	  {
		  System.out.println("Enter the String ");
		  String str=sc.next();
		  return str;
		  
	  }
	  public void add()//no argument & return
	  {
		  System.out.println("Enter First value :");
		  a=sc.nextInt();
		  System.out.println("Enter Second value :");
		  b=sc.nextInt();
		  int add=a+b;
		  System.out.println(add);
	  }
	}
public class Methods {
public static void main(String args[])
{
	sam vm=new sam();
	System.out.println("the greates number is :"+vm.check(3, 5));
	int a[]= {1,2,3,4,5};
	System.out.println("The sum of arrays : "+vm.array(a));
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value to find cube :");
    int cube=sc.nextInt();
    System.out.println("The cube value of "+cube+" = "+vm.cube(cube));
    System.out.println(" displayed the string : "+vm.display());
   vm.add();
   sc.close();
}
}
