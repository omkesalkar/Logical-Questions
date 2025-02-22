package All_Logical_Questions.Arrays;

/*Reverse the array and print it.
Enter the number of element in the array: 5
Enter the elements in the array: 1 2 3 4 5
Test case- 01:- 
Original Array: 1 2 3 4 5 
Reverse Array: 5 4 3 2 1 
*/

import java.util.*;

public class Prog_14_ReverseArray 
{
	public static void reverseArray(int arr[])
	{
		System.out.print("Original Array: ");
		for(int ele : arr) {
			System.out.print(ele +" ");
		}
		
		System.out.print("\nReverse Array: ");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i] +" ");
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
		
		reverseArray(arr);
		sc.close();
	}
}
