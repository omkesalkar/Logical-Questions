package All_Logical_Questions.Arrays;

import java.util.*;

/*Write a program to store array dynamically by reading the size and elements from the user.
Input as: 
Enter size of the array:6
Enter 6 elements: 1 2 3 4 5 6
Output is: 
Array elements are: 1 2 3 4 5 6
*/

public class Prog_01_StoreArrayElementByReadingSize 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try( sc; )  //try with resource from (java-7 feature)
		{
			//Reading the size of array
			System.out.print("Enter size of the array: ");  
			int size = sc.nextInt();
			
			//create an array with the help of user-defined size
			int arr[] = new int[size];    
			
			//Taking elements from user
			System.out.print("Enter "+ size +" elements: ");   
			for(int i=0; i<arr.length; i++)
			{
				arr[i] = sc.nextInt();		//storing element in array
			}
			
			//printing array element by using for-each loop(java-5 feature)
			System.out.print("Array elements are: "); 
			for(int x : arr)
			{
				System.out.print(x +" ");
			}
			
		}
		catch(Exception e)  //Handling the exception by using try-catch
		{
			e.printStackTrace();
		}
		
	}
}
