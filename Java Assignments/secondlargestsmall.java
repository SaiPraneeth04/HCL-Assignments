package javaassignments;

import java.util.Scanner;

public class secondlargestsmall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		secondLargest(arr, n);
		secondSmallest(arr, n);
	}
	private static void secondLargest(int[] arr, int n)
	{
		int max1 = 0, max2 = 0;
		if(arr[0] > arr[1])
		{
			max1 = arr[0];
			max2 = arr[1];
		}
		else
		{
			max1 = arr[1];
			max2 = arr[0];
		}
		for(int i=2; i<n; i++)
		{
			if(arr[i] > max1) 
			{
				max2 = max1;
				max1 = arr[i];
			}
			else if(arr[i] > max2)
			{
				max2 = arr[i];
			}
		}
		System.out.print("The second largest element in the array is : " + max2);
	}
	private static void secondSmallest(int[] arr, int n)
	{
		int min1 = 0, min2 = 0;
		if(arr[0] < arr[1])
		{
			min1 = arr[0];
			min2 = arr[1];
		}
		else
		{
			min1 = arr[1];
			min2 = arr[0];
		}
		for(int i=2; i<n; i++)
		{
			if(arr[i] < min1) 
			{
				min2 = min1;
				min1 = arr[i];
			}
			else if(arr[i] < min2)
			{
				min2 = arr[i];
			}
		}
		System.out.print("\nThe second smallest element in the array is : " + min2);
	}
}
