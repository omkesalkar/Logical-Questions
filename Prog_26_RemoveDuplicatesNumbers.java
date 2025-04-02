package All_Logical_Questions.Arrays;

/*Given a sorted array of integers, remove duplicates such that each element appears only once. Print the elements without duplicates.

Input: nums = [1, 1, 2, 2, 3, 4, 4, 5]
Output:
[1, 2, 3, 4, 5]*/

import java.util.*;

public class Prog_26_RemoveDuplicatesNumbers
{
	public static void removeDuplicateElements(int[] arr)
	{
		Arrays.sort(arr);
		
		int uniqueIndex = 0;
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] != arr[uniqueIndex])
			{
				uniqueIndex++;
				arr[uniqueIndex] = arr[i];  //Move unique element forward
			}
		}
		
		for(int i=0; i<=uniqueIndex; i++)
		{
			System.out.print(arr[i] +" ");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try( sc )
		{
			System.out.print("Enter the number of element in the array: ");
			int size = sc.nextInt();
			
			if(size <= 0)
			{
				System.err.println("Number of elements must be greater than zero...");
				return;
			}
			
			int arr[] = new int[size];
			
			System.out.print("Enter the elements in the array: ");
			for(int i=0; i<arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			removeDuplicateElements(arr);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
