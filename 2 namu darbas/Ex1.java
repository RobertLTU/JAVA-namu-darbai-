/* Homework_2 excercise_1
Write a Java program to get a number from the user and print whether it is positive or negative.
Test Data
Input number: 35
Expected Output :
Number is positive
*/

public class Ex1 {
	public static void main (String[] args) {
	System.out.println("Please enter your number :"); 
	int userNumber = Integer.valueOf(System.console().readLine());
	if (userNumber < 0) {
		System.out.println("Number is negative");
	} else if (userNumber > 0) {
	System.out.println("Number is positive");
	} else {
	System.out.println("Your number is ZERO!");
	}
	}
}