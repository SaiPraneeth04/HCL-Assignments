package javaassignments;

import java.util.Scanner;

public class reverseastring {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();  
        System.out.println("The original string is: " + str);
        System.out.println("The reversed string is: " + reverseString(str, "", str.length()-1));
        sc.close();
    }
    
    private static String reverseString(String s, String r, int i) {
        if(i < 0) {
            return r;
        }
        return reverseString(s, r + s.charAt(i), i - 1);  
    }
}
