package All_Logical_Questions.Arrays;

import java.util.*;

/*Calculate Sum of Array Elements.
   Input as: 1 2 3 4 5
   Output as: 15
*/
public class Prog_08_SumOfArray
{
	public static void sumOfArray(int[] arr)
	{
		int sum = 0;
		
		for(int x : arr )
		{
			sum += x;
		}
		
		System.out.println("Sum of the array: "+ sum);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try( sc; )
		{
			System.out.print("Enter the number of element in the array: ");
			int size = sc.nextInt();
			
			if(size <= 0) {
				System.err.println("Array size must be greater than zero");
			}
			
			int arr[] = new int[size];
			
			System.out.print("Enter the element in the array: ");
			for(int i=0; i<arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			sumOfArray(arr);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
