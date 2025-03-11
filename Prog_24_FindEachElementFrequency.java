package All_Logical_Questions.Arrays;

//Implement a Java program to find the frequency of each element in an integer array and display the results.

import java.util.*;

public class Prog_24_FindEachElementFrequency
{
	public static void findEachElementFrequency(int[] arr)
    {
        Arrays.sort(arr);
        
        int length = arr.length;
        int i = 0;
        
        System.out.println("Element Frequencies:");
        
        while (i < length)
        {
            int count = 1; // Initialize count for the current element
            
            // Count occurrences of the same element
            while (i+1 < length && arr[i] == arr[i + 1])
            {
                count++;
                i++;
            }
            
            System.out.println("Element "+arr[i] + " -> " + count +" time present in an array.");
            
            // Move to the next new element
            i++;
        }
    }
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try(sc)
		{
			System.out.print("Enter the number of element in the array: ");
			int size = sc.nextInt();
			
			if(size < 0) {
				System.err.println("Enter value must be greater than zero...");
				return;
			}
			
			int[] arr = new int[size];
			
			System.out.print("Enter the element in the array: ");
			for(int i=0; i<size; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			findEachElementFrequency(arr);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
