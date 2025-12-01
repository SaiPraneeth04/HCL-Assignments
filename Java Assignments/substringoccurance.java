package javaassignments;

import java.util.Scanner;

public class substringoccurance {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");
        String mainString = sc.nextLine();
        System.out.println("Enter the substring : ");
        String subString = sc.next();
        int count = countOccurrences(mainString, subString);
        System.out.println("Number of occurrences: " + count);
	}
	public static int countOccurrences(String mainString, String subString) 
	{
        int count = 0;
        int index = 0;
        
        while ((index = mainString.indexOf(subString, index)) != -1) 
        {
            count++;
            index += subString.length(); 
        }
        
        return count;
    }
}
