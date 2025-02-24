package All_Logical_Questions.Arrays;
/*Write a java program to count how many elements are present more than one time.
Input  : arr = [1,2,1,3,4,6,2,5,4]
Output : 3 elements are present more than one time
*/
import java.util.*;

public class Prog_16_DuplicateElement 
{
	public static void duplicateElement(int[] arr)
	{
		HashMap<Integer, Integer> hm = new HashMap<>();
		int duplicateCount = 0;
		
		//Count frequency of each element
		for(int num : arr) {
			hm.put(num, hm.getOrDefault(num, 0) + 1);
		}
		
		//Count elements that appear more than once
		for(int freq : hm.values()) {
			if(freq > 1) {
				duplicateCount++;
			}
		}
		
		if(duplicateCount > 0) {
			System.out.println(duplicateCount +" elements are present more than one time");
		} else {
			System.out.println("Not a single element is present more than one time");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
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
		
		duplicateElement(arr);
	}
}
