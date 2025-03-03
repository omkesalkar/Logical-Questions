package All_Logical_Questions.Arrays;

/*Write a Java method named modifyArrayElement that modifies the given array
  by replacing every occurrence of oldElement with newElement.
arr = [1, 2, 3, 4, 5, 2, 3]
oldElement = 3
newElement = 10
After modification, arr should be [1, 2, 10, 4, 5, 10]*/
import java.util.*;

public class Prog_19_ModifyArrayElement
{
	public static void modifyArrayElement(int arr[], int oldEle, int newEle)
	{
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == oldEle) {
				arr[i] = newEle;
			}
		}
		
		System.out.println("After modification, Array should be "+ Arrays.toString(arr));
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try(sc)
		{
			System.out.print("Enter the number of element in the array: ");
			int size = sc.nextInt();
			
			if(size < 0) {
				System.err.println("Number of elements must be greater than zero...");
				return;
			}
			
			int[] arr = new int[size];
			
			System.out.print("Enter the elements in the array: ");
			for(int i=0; i<arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			System.out.print("Enter Old replacing element: ");
			int oldEle = sc.nextInt();
			
			System.out.print("Enter New Updating element: ");
			int newEle = sc.nextInt();
			
			modifyArrayElement(arr, oldEle, newEle);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
