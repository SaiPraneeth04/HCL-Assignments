package javaassignments;

import java.util.Scanner;

public class replace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string ");
		String str = sc.nextLine();
		System.out.println("Enter the replace string :");
		String rep = sc.nextLine();
		System.out.println("String after replacing " + (replaceChar(str, rep)));
		
	}
	
	private static String replaceChar(String str, String rep)
	{
		return str.replace(str, rep);
	}
}
