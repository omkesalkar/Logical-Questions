package All_Logical_Questions.Arrays;

/*Search for a given Element in an Array if present then print
 "Element found", if not present print "Element not found"
 Input as: 1 4 3 5 2 6 5
 Enter searching element: 5
 Output: Element found
 
 Input as: 1 4 3 5 2 6
 Enter searching element: 7
 Output: Element not found
*/
import java.util.*;

public class Prog_11_SearchElement 
{
	public static void searchElement(int[] arr, int target)
	{
		int count = 0;
		for(int ele : arr)     // Search for the element
		{
			if(target == ele) count++;
		}
		
		if(count > 0) {
			System.out.println("Element Found");
		} else {
			System.out.println("Element NOT Found");
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of element in the array: ");
		int size = sc.nextInt();
		
		if(size <= 0) {
			System.err.println("Number of element must be greater than zero...");
			System.exit(0);
		} 
		
		int[] arr = new int[size];  //create an array with user defined input size
		
		System.out.print("Enter the elements in the array: ");  //take elements and stored in array
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter Search Element: ");  // Input the element to search
		int element = sc.nextInt(); 
		
		searchElement(arr, element);
		
		sc.close();
	}

}
