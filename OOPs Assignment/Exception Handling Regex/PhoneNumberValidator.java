package ExceptionHandling;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;

public class PhoneNumberValidator {
    public static void main(String[] args) {
        
        // 1. Define the input numbers to validate
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("001-765-989-3421"); // Valid Case 1
        phoneNumbers.add("+1-456-765-9345");  // Valid Case 2
        phoneNumbers.add("999-123-456-7890"); // Invalid Case (Wrong prefix)
        phoneNumbers.add("001-ABC-989-3421"); // Invalid Case (Contains letters)

        // 2. Define the Regular Expression
        // Breakdown:
        // ^             -> Start of the line
        // (001|\\+1)    -> Match either "001" OR "+1"
        // -             -> Match a hyphen
        // \\d{3}        -> Match exactly 3 digits
        // -             -> Match a hyphen
        // \\d{3}        -> Match exactly 3 digits
        // -             -> Match a hyphen
        // \\d{4}        -> Match exactly 4 digits
        // $             -> End of the line
        String regex = "^(001|\\+1)-\\d{3}-\\d{3}-\\d{4}$";

        // 3. Compile the Pattern
        Pattern pattern = Pattern.compile(regex);

        System.out.println("--- Phone Number Validation ---");

        // 4. Loop through numbers and validate
        for (String phone : phoneNumbers) {
            Matcher matcher = pattern.matcher(phone);
            
            if (matcher.matches()) {
                System.out.println(phone + "  ->  [VALID]");
            } else {
                System.out.println(phone + "  ->  [INVALID]");
            }
        }
    }
}
