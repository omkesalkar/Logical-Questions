package All_Logical_Questions.Arrays;

import java.util.*;

/* Write a java program to find the middle elements of a given array. 
 * If array is odd then print only the middle element, 
 * if array is even then print both the middle elements. [searching based on index]           
Input as : 1 2 3 4 5  
Output is : 3
Input is :1 2 3 4 5 6 
Output is :3 4
*/

public class Prog_02_FindMiddleElementOfArray 
{
	public static void findMiddleElements(int[] arr) 
	{
		int length = arr.length;

		if (length % 2 == 1) 
		{ // Odd length array
			System.out.println(arr[length / 2]);
		} 
		else 
		{ // Even length array
			System.out.println(arr[length / 2 - 1] + " " + arr[length / 2]);
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements in the array:");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		findMiddleElements(arr);
		sc.close();
	}

}
