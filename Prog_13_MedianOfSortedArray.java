package All_Logical_Questions.Arrays;

/* Find the median of a sorted array.
   
   Test Case: 1

   Array size: 6
   Elements are: 1, 2, 3, 4, 5, 6
   Median is: 3.5
  
   Test Case: 2
  
   Array size: 5
   Elements are: 1, 2, 3, 4, 5
   Median is: 3.0
*/
import java.util.*;

public class Prog_13_MedianOfSortedArray 
{
	public static void medianOfSortedArray(int arr[])
	{
		System.out.print("Elements are: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] +" ");
		}
		
		int length = arr.length;
		double median;
		
		if(length % 2 == 0) {
			median = ( arr[length/2 - 1] + arr[length / 2] ) / 2.0;
		} else {
			median = arr[length / 2];
		}
		
		System.out.println("\nMedian is: "+ median);
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
		
		medianOfSortedArray(arr);
		
		sc.close();
	}
}
