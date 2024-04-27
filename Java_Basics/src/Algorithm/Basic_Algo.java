package Algorithm;

public class Basic_Algo {
public static int FindLargestNumber(int[] array)
{
	int max=array[0];
	for(int i=0;i<array.length;i++)
	{
		if(array[i]>max)
		{
			max=array[i];
		}
	}
	return max;
}


public static void main(String args[])
{
	
	int array[]= {2,8,12,45,34,89,56};
	int largest=FindLargestNumber(array);
	System.out.println("The largest number is :"+largest);
	
	
}

}
