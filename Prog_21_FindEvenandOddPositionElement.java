package All_Logical_Questions.Arrays;

/*Write java method named findEvenandOddPositionElement that 
print all the elements which is present at even index and also in odd index.*/

import java.util.*;

public class Prog_21_FindEvenandOddPositionElement
{
	public static void findEvenandOddPositionElement(int[] arr)
	{
		System.out.print("Even index position elements: ");
		for(int i=0; i<arr.length; i+=2)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		System.out.print("Odd index position elements: ");
		for(int i=1; i<arr.length; i+=2)
		{
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
			
			System.out.print("Enter the elements in the array: ");
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			findEvenandOddPositionElement(arr);	
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
