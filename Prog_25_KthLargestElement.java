package All_Logical_Questions.Arrays;

//Implement a java program to find kth largest element in an unsorted array and print it. 

import java.util.*;

public class Prog_25_KthLargestElement 
{
	public static int findKthLargest(int[] arr, int k)
	{
		Arrays.sort(arr);
		
		return arr[arr.length - k];
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try( sc )
		{
			System.out.print("Enter the number of element in the array: ");
			int size = sc.nextInt();
			
			if(size < 0) {
				System.err.println("Number of element must be greater than zero...");
				return;
			}
			
			int arr[] = new int[size];
			
			System.out.print("Enter "+ size +" elements in the array: ");
			for(int i=0; i<arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			System.out.print("Enter the value of k: ");
	        int k = sc.nextInt();
	        
	        if(k>0 && k<=size)
	        {
	        	int result = findKthLargest(arr, k);
	        	System.out.println("The "+ k +"th largest element is: "+ result);
	        }
	        else
	        {
	        	System.err.println("Invalid value of K");
	        }
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
