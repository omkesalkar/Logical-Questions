package All_Logical_Questions.Arrays;

import java.util.*;

public class Prog_28_MergeTwoSortedArrayInSingleArray 
{
	public static void mergeTwoArray(int[] arr1, int[] arr2)
	{
		int[] newArr = new int[arr1.length + arr2.length];
		
		for(int i=0; i<arr1.length; i++)
		{
			newArr[i] = arr1[i];
		}
		
		for(int i=0; i<arr2.length; i++)
		{
			newArr[arr1.length + i] = arr2[i];
		}
		
		Arrays.sort(newArr);
		
		System.out.println("Updated Sorted array: "+ Arrays.toString(newArr));
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of element in the first array: ");
		int firstArraySize = sc.nextInt();
		
		System.out.print("Enter the number of element in the second array: ");
		int secondArraySize = sc.nextInt();
		
		if(firstArraySize <= 0 || secondArraySize <= 0)
		{
			System.err.println("Number of element must be greater than zero...");
			return;
		}
		
		int[] arr1 = new int[firstArraySize];
		int[] arr2 = new int[secondArraySize];
		
		System.out.print("Enter the elements in the first array: ");
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
			
		System.out.print("Enter the elements in the second array: ");
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		mergeTwoArray(arr1, arr2);
	}
}
