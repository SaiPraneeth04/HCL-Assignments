package javaassignments;
import java.util.Scanner;
public class removeduplicatecharacters {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        System.out.println("The Original string is : " + str);
        String res = removeDupliChar(str);
        System.out.println("String after removing duplicates : " + res);
        sc.close();
    }
    
    private static String removeDupliChar(String s) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];  
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }
        return result.toString();
    }
}
