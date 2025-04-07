package All_Logical_Questions.Arrays;

/*Write a program to insert one element in a desired index in an array and return resulting array.
arr = {1,2,3,4,5}


Test Case - 1
------------------
Enter index: 3
Enter element: 9
Output : [1, 2, 3, 9, 4, 5]*/
		
import java.util.*;

public class Prog_27_InsertOneElementInDesiredIndex 
{
	public static void insertOneElement(int[] arr)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter index: ");
		int index = scanner.nextInt();
		
		System.out.print("Enter element: ");
		int element = scanner.nextInt();
		
		if(index < 0 || index >= arr.length)
		{
			System.err.println("Invalid index. Must be between 0 and " + arr.length);
            return;
		}
		
		int[] newArr = new int[arr.length + 1];
		
		for(int i=0, j=0; i<newArr.length; i++)
		{
			if(i == index) {
				newArr[i] = element;
			} else {
				newArr[i] = arr[j++];
			}
		}
			
		System.out.println(Arrays.toString(newArr));
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try( sc )
		{
			System.out.print("Enter the number of element in the array: ");
			int size = sc.nextInt();
			
			if(size < 0) {
				System.err.println("Number must be greater than zero...");
				return;
			}
			
			int arr[] = new int[size];
			
			System.out.print("Enter the elements in the array: ");
			for(int i=0; i<arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			insertOneElement(arr);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
