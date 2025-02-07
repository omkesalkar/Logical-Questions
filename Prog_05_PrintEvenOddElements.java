package All_Logical_Questions.Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Write a java program to print all even elements and odd elements separately from an array.[Searching and retrieving]
Input as  : 1 2 3 4 5 6 7
Even elements are : 2 4 6
Odd elements are : 1 3 5 7
*/
public class Prog_05_PrintEvenOddElements 
{
	public static void printEvenOddElements(int[] arr)
	{
		System.out.print("Even elements are: ");
		for(int x : arr)
		{
			if(x % 2 == 0)
				System.out.print(x +" ");
		}
		
		System.out.print("\nOdd elements are: ");
		for(int x : arr)
		{
			if(x % 2 == 1)
			{
				System.out.print(x +" ");
			}
		}
		
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try( sc; )
		{
			System.out.print("Enter the number of element in the array: ");
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			
			System.out.print("Enter the element in the array: ");
			for(int i=0; i<arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			printEvenOddElements(arr);
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
	}

}
