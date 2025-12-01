package javaassignments;
import java.util.*;
public class countwordsinstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String str = sc.nextLine();
		System.out.println("The sentence is :" + str);
		System.out.println("The number of words are : " + countWords(str));
	}

	public static int countWords(String str) {
		if (str == null || str.isEmpty()) {
			return 0;
		}

		int count = 0;
		boolean isWord = false;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				if (!isWord) {
					count++;
					isWord = true;
				}
			} else {
				isWord = false;
			}
		}

		return count;
	}
}
