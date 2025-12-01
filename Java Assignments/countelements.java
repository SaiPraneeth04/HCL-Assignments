package javaassignments;
import java.util.*;
public class countelements {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("\nCounting elements...");
        countElements(arr);
    }
	public static void countElements(int[] arr) 
	{
        int positive = 0;
        int negative = 0;
        int zero = 0;
        
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] > 0) 
            {
                positive++;
            } 
            else if (arr[i] < 0) 
            {
                negative++;
            } 
            else 
            {
                zero++;
            }
        }
        
        System.out.println("Positive elements: " + positive);
        System.out.println("Negative elements: " + negative);
        System.out.println("Zero elements: " + zero);
    }
}
