package All_Logical_Questions.Arrays;

import java.util.*;

/*Find Maximum Element in an Array.
      Input as: 6 3 2 1 5 5 4
     Output as: Max is: 6
*/

public class Prog_06_FindMaxElementInArray 
{
	public static void maxElement(int[] arr)
	{
		int max = 0;
		for(int x : arr)
		{
			if(x > max)
				max = x;
		}
		
		System.out.println("Maximum element in the array: "+ max);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try( sc; )
		{
			System.out.print("Enter the number of element in the array: ");
			int size = sc.nextInt();
			
			int arr[] = new int[size];
			
			System.out.print("Enter the element in the array: ");
			for(int i=0; i<arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			maxElement(arr);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
