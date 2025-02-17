package All_Logical_Questions.Arrays;

import java.util.*;

/*
Find the average of array elements.
Input:  1 2 3 4 5
Output: Average = 3.0
*/

public class Prog_10_FindAverageOfArray 
{
	public static void averageOfArray(int[] arr)
	{
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
		
		double average = sum / arr.length;
		System.out.println("Average of array: "+ average);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try( sc; )
		{
			System.out.print("Enter the number of element in the array: ");
			int size = sc.nextInt();
			
			if(size <= 0) {
				System.err.println("Array size must be greater than zero.");
				return;
			}
			
			int[] arr = new int[size];
			
			System.out.print("Enter the elements in the array: ");
			for(int i=0; i<arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			averageOfArray(arr);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
