package javaassignments;
import java.util.*;
public class leftrotatearrbynnum {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter number of positions to rotate left: ");
        int rotations = sc.nextInt();
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        leftRotate(arr, rotations);
        
        System.out.println("Array after " + rotations + " left rotations: " + Arrays.toString(arr));
    }
    public static void leftRotate(int[] arr, int n) {
        int length = arr.length;
        n = n % length;  
        int[] temp = new int[n];
        for (int i = 0; i < n; i++)
        {
            temp[i] = arr[i];
        }
        for (int i = 0; i < length - n; i++) 
        {
            arr[i] = arr[i + n];
        }
        for (int i = 0; i < n; i++) 
        {
            arr[length - n + i] = temp[i];
        }
    }
}
