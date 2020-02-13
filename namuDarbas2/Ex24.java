/* Homework_2 excercise_4
Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

Test Data
Input a number: 25
Expected Output :
Input value: 25
Positive number
*/
class Ex24 {
	public static void main(String[] args) {
		System.out.println("Enter testing number: ");
		float testNumber = Float.parseFloat(System.console().readLine());
		if (testNumber < 0) {
			System.out.println("negative");
		} else if (testNumber == 0) {
			System.out.println("zero");
		} else if (testNumber > 0 && testNumber < 1) {
			System.out.println("small");
		} else if (testNumber >= 1 && testNumber <= 1000000) {
			System.out.println("positive");
		} else if (testNumber > 1000000) {
			System.out.println("large");
		}
	}
}