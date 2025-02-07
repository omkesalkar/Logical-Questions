package All_Logical_Questions.Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Write a java program to count how many even elements and how many odd elements are present in an array.[Searching Operation]
  Input as : 1 2 3 4 5
  Even count : 2
  Odd count : 3
*/

public class Prog_04_CountEvenOddInArray 
{
	public static void countEvenOdd(int[] arr)
	{
		int even = 0, odd = 0;
		
		for(int x : arr)
		{
			if(x % 2 == 0) even++;
			odd++;
		}
		System.out.println("Even count: "+ even);
		System.out.println("Odd count: "+ odd);
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
			
			countEvenOdd(arr);
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
	}

}
