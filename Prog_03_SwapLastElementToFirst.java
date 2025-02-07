package All_Logical_Questions.Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Write a java program to swap the last and first element of a given array.
  [Swapping Operation]
  Input as: [1,2,3,4,5,6]
  Output as: 6 2 3 4 5 1
*/

public class Prog_03_SwapLastElementToFirst 
{
	public static void swapLastToFirst(int[] arr)
	{
		if(arr.length > 1)
		{
			int temp = arr[0];
			arr[0] = arr[arr.length-1];
			arr[arr.length - 1] = temp;
		}
		
		System.out.print("Array after swapping first and last element: ");
		for(int x : arr)
		{
			System.out.print(x +" ");
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try( sc; )
		{
			System.out.print("Enter the number of element in the array: ");
			int size = sc.nextInt();
			
			int arr[] = new int[size];
			
			System.out.print("Element the element of the array: ");
			for(int i=0; i<arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			swapLastToFirst(arr);
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
	}

}
