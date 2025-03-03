package All_Logical_Questions.Arrays;

/*Write a java program to print all unique elements from a given array.
Input: arr = [1,2,1,3,4,6,2,5,4]
Output: 3 6 5
*/
import java.util.*;

public class Prog_18_UniqueElement 
{
	public static void uniqueElement(int[] arr) 
	{
		System.out.print("Unique Elements: ");
		for (int i=0; i<arr.length; i++) 
		{
			int count = 0;

			for (int j=0; j<arr.length; j++) 
			{
				if (arr[i] == arr[j]) 
				{
					count++;
				}
			}

			if (count == 1) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	    
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of element in the array: ");
		int size = sc.nextInt();
		
		if(size <= 0) {
			System.err.println("Number of element must be greater than zero...");
			return;
		}
		
		int[] arr = new int[size];
		
		System.out.print("Enter the element in the array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		uniqueElement(arr);
	}
}
