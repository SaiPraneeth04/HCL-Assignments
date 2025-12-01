package javaassignments;
import java.util.*;
public class linearsearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search : ");
		int element = sc.nextInt();
		int result = linearSearch(arr, n, element);
		if(result == -1)
		{
			System.out.println("The element not found");
		}
		else
		{
			System.out.println("The element position : " + result);
		}
	}	
	private static int linearSearch(int[] arr, int n, int element)
	{
		int position = -1;
		for(int i=0; i<n; i++)
		{
			if(arr[i] == element)
			{
				position = i+1;
			}
		}
		return position;
	}
}
