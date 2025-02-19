package All_Logical_Questions.Arrays;

/*Search for a given Element in an Array if present print its location. */

import java.util.*;

public class Prog_12_SearchElementIndex {
	public static void searchElementIndex(int[] arr, int target) 
	{	
		boolean Found = false;

		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] == target) {
				System.out.println("Element found at index: " + arr[i]);
				Found = true;
			}
		}
		
		if(!Found) 
		{
			System.out.println("Element NOT found");
		}
	}

	public static void main(String[] args) {
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

		System.out.print("Enter Searching Element: "); // Input the element to search
		int element = sc.nextInt();

		searchElementIndex(arr, element);

		sc.close();
	}
}
