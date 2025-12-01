package javaassignments;
import java.util.*;
public class binarysearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements : ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search");
		int element = sc.nextInt();
		int result = binarySearch(arr, n, element);
		if(result == -1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element position is at " + result);
		}
	}
	private static int binarySearch(int[] arr, int n, int element)
	{
		Arrays.sort(arr);
		int low = 0;
		int high = n-1;
		while(low <= high)
		{
			int mid = low + (high - low)/2;
			if(arr[mid] == element)
			{
				return mid + 1;
			}
			else if(arr[mid] > element)
			{
				high = mid-1;
			}
			else if(arr[mid] < element)
			{
				low = mid+1;
			}
		}
		return -1;
	}
}
