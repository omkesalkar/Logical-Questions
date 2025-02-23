package All_Logical_Questions.Arrays;

/*Check the given array is sorted(it can be Ascending order or descending order) or not if sorted then return true if not sorted then return false. 
     int[] a = {13, 4, 23,  2, 2, 4}
     Output : Is sorted : false

     int[] a = {3,5,6,7,8}
     Output : Is sorted : true

     int[] a = {8,6,5,3,1}
     Output: Is sorted : true

    int[] a = {3,5,6,7,8,1,3,5}
     Output: Is sorted : false
*/

import java.util.*;

public class Prog_15_CheckSortedArray 	
{
	public static void checkSortedArray(int arr[])
	{
		boolean ascending = true, descending = true;
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] < arr[i-1])
			{
				ascending = false;
			} 
			
			if(arr[i] > arr[i - 1])
			{
				descending = false;
			}
		}
		
		if(ascending || descending)
		{
			System.out.println("Is Sorted: "+ ascending);
		} else {
			System.out.println("Is Sorted: "+ descending);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of element in the array: ");
		int size = sc.nextInt();

		if (size <= 0) {
			System.err.println("Number of element must be greater than zero...");
			System.exit(0);
		}

		int[] arr = new int[size]; // create an array with user defined input size

		System.out.print("Enter the elements in the array: "); // take elements and stored in array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		checkSortedArray(arr);
		
		sc.close();
	}

}
