package All_Logical_Questions.Arrays;

import java.util.*;

/*Print all elements in reverse order of an Array.
    Input as: 1 2 3 4 5
    Output as: 5 4 3 2 1
*/

public class Prog_09_ReverseArray 
{
	public static void reverseElement(int[] arr)
	{
		System.out.print("Array after Reverse Elements: ");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i] +" ");
		}
		
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
			
			int[] arr = new int[size];
			
			System.out.print("Enter the element in the array: ");
			for(int i=0; i<arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			reverseElement(arr);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
