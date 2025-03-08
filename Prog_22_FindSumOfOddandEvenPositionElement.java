package All_Logical_Questions.Arrays;

/*Write java method named findSumOfOddandEvenPositionElement that 
print the all odd positions sum and also even position sum.*/

import java.util.*;
public class Prog_22_FindSumOfOddandEvenPositionElement 
{
	public static void findSumOfOddandEvenPositionElement(int[] arr)
	{
		int evenSum = 0, oddSum = 0;
		
		for (int i=0; i<arr.length; i++)
		{
            if (i % 2 == 0)
            {
                evenSum += arr[i]; 
            } 
            else 
            {
                oddSum += arr[i]; 
            }
        }

        System.out.println("Sum of even position elements: " + evenSum);
        System.out.println("Sum of odd position elements: " + oddSum);	
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
			
			int[] arr = new int[size];
			
			System.out.print("Enter the element in the array: ");
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt(); 
			}
			
			findSumOfOddandEvenPositionElement(arr);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
