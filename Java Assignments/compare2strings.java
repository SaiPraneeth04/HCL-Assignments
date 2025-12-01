package javaassignments;
import java.util.*;
public class compare2strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1 : ");
		String str1 = sc.nextLine();
		System.out.println("Enter the string 2 : ");
		String str2 = sc.nextLine();
		equalsMethod(str1, str2);
		compareMethod(str1, str2);
	}
	private static void equalsMethod(String s1 , String s2)
	{
		if(s1.equals(s2))
		{
			System.out.println("Two strings are equal (equals method)");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
	}
	private static void compareMethod(String s1, String s2)
	{
		int result = s1.compareTo(s2);
		if (result == 0) 
		{
            System.out.println("Strings are equal (compareTo method)");
        } 
		else if (result < 0) 
        {
            System.out.println("First string is lexicographically smaller");
        }
        else 
        {
            System.out.println("Second string is lexicographically smaller");
        }
	}
}
