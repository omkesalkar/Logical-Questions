package All_Logical_Questions.Arrays;

//Write java method named findPrimePositionElement that print all the elements which is present at prime index.

import java.util.*;
public class Prog_23_FindPrimePositionElement
{
	public static boolean isPrime(int num) 
	{
		if(num < 2) return false; // 0 and 1 are not prime
		if (num == 2) return true; // 2 is the only even prime number
		
		for(int i=2; i*i<=num; i++)  // Efficient way to check prime
		{
			if(num % i == 0) // Fixed the condition
				return false;
		}
		
		return true;
	}
	
	public static void findPrimePositionElement(int[] arr)
	{
		System.out.print("Elements at prime index positions: ");
		for(int i=0; i<arr.length; i++)
		{
			if(isPrime(i))
				System.out.print(arr[i]+" ");
		}
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
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			findPrimePositionElement(arr);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
