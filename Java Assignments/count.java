package javaassignments;
import java.util.*;
public class count {
	public static void countCharacters(String str) {
        int digits = 0;
        int alphabets = 0;
        int specialChars = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isAlphabetic(ch)) {
                alphabets++;
            } else {
                specialChars++;
            }
        }
        
        System.out.println("Digits: " + digits);
        System.out.println("Alphabets: " + alphabets);
        System.out.println("Special Characters: " + specialChars);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        countCharacters(input);
    }
}
