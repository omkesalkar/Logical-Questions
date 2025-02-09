package All_Logical_Questions.Arrays;

import java.util.*;

/*Find Minimum element in an array.
  Input as: 6 3 2 1 5 8 5 4
  Output as: Min is: 1
*/

public class Prog_07_FindMinElementInArray 
{
	public static void minElement(int[] arr)
	{
		int min = arr[0];   // Initialize `min` to the first element
		
		for(int x : arr)
		{
			if(x < min)  // Compare directly with `min`
			{
				min = x;
			}
		}
		System.out.println("Minimum element in the array: "+ min);
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
			
			int arr[] = new int[size];
			
			System.out.print("Enter the element in the array: ");
			for(int i=0; i<arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			minElement(arr);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
