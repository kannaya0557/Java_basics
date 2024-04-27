package java_Intro;

public class Array
{
public static void main(String args[])
{
	int arr[]=new int[]{2,3};
	int arr1[]={3,4,5,8};
	System.out.println("Using enhanced for loop");
	for(int arr2:arr)
	{
		System.out.println(arr2);
	}
	System.out.println("Using For Loop");
	for(int i=0;i<=arr1.length-1;i++)
	{
	System.out.println(arr1[i]);
	}
	
	}
}
