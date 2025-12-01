package javaassignments;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class frequencyofcharecter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		Map<Character , Integer> freqMap = new HashMap<>();
		char[] charArr = str.toCharArray();
		for(char c : charArr)
		{
			if(freqMap.containsKey(c))
			{
				freqMap.put(c, freqMap.get(c)+1);
			}
			else
			{
				freqMap.put(c, 1);
			}
		}
		System.out.println("Character frequence in the string : \n" + str);
		for(Map.Entry<Character, Integer> entry : freqMap.entrySet())
		{
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}

}
