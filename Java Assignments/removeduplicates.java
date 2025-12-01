package javaassignments;
import java.util.Scanner;
import java.util.Arrays;
public class removeduplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements : ");
		int n = sc.nextInt();
		System.out.println("Enter the Elements");
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		removeDuplicates(arr, n);
	}
	private static void removeDuplicates(int[] arr, int n)
	{
		Arrays.sort(arr);
		int i = 0;
		for(int j=1; j<n; j++)
		{
			if(arr[i] != arr[j])
			{
				i++;
				arr[i] = arr[j];
			}
		}
		arr[i] = arr[n-1];
		System.out.println("The Unique Elements are : ");
		for(int k=0; k<i; k++)
		{
			System.out.print(arr[k]+" ");
		}
	}
}
