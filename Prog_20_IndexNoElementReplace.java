package All_Logical_Questions.Arrays;
/*Write a Java method named replaceElement that replaces the element at the given position in the array with another given element.

Input:
arr = [1, 2, 3, 4, 5]
position = 2
newElement = 10

After modification, arr should be [1, 2, 10, 4, 5]*/

import java.util.*;
public class Prog_20_IndexNoElementReplace 
{
	public static void replaceElementByPosition(int[] arr, int position, int newEle)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(i == position)
			{
				arr[i] = newEle;
			}
		}
		
		System.out.println("After modification, Array should be "+ Arrays.toString(arr));
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		try( sc )
		{
			System.out.print("Enter the number of element in the array: ");
			int size = sc.nextInt();
			
			if(size <= 0) {
				System.err.println("Number of element must be greater than zero...");
				return;
			}
			
			int[] arr = new int[size];
			
			System.out.print("Enter the element in the array: ");
			for(int i=0; i<arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			System.out.print("Index position to replace element: ");
			int position = sc.nextInt();
			
			System.out.print("New element to add at '"+ position +"' index position: ");
			int newElem = sc.nextInt();
			
			replaceElementByPosition(arr, position, newElem);
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
