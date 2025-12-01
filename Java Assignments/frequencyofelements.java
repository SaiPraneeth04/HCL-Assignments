package javaassignments;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class frequencyofelements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		frequenceOfElements(arr);
		
	}
	public static void frequenceOfElements(int[] arr)
	{
		Map<Integer, Integer> freqMap = new HashMap<>();
		for(int element : arr)
		{
			if(freqMap.containsKey(element))
			{
				freqMap.put(element, freqMap.get(element)+1);
			}
			else
			{
				freqMap.put(element,1);
			}
		}
		System.out.println("The Element frequency : ");
		for(Map.Entry<Integer,Integer> entry : freqMap.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
