package ExceptionHandling;

import java.util.Scanner;

//1. Creating the User Defined Exception
//We extend the 'Exception' class to make it a Checked Exception
class InvalidAgeException extends Exception {
public InvalidAgeException(String message) {
   // Pass the message to the parent Exception class constructor
   super(message);
}
}

//2. Main Class to demonstrate the usage
public class VotingDemo {

// Method to check age validity
// We must use 'throws' here because InvalidAgeException is a checked exception
public static void checkEligibility(int age) throws InvalidAgeException {
   if (age < 18) {
       // IF age is less than 18, we explicitly THROW our custom exception
       throw new InvalidAgeException("Candidate is not eligible to vote");
   } else {
       System.out.println("Candidate is eligible to vote");
   }
}

public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter your age: ");
   
   try {
       int age = scanner.nextInt();
       
       // Calling the method that might throw an exception
       checkEligibility(age);
       
   } catch (InvalidAgeException e) {
       // This block executes ONLY if the exception is thrown
       System.out.println("Exception Caught: " + e.getMessage());
   } catch (Exception e) {
       // Generic catch block for other errors (like entering "abc" instead of numbers)
       System.out.println("Invalid Input: Please enter a numeric value.");
   } finally {
       scanner.close();
       System.out.println("--- Validation Complete ---");
   }
}
}
