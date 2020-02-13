/* Homework_2 excercise_3
Take three numbers from the user and print the greatest number. Go to the editor

Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87
*/

public class Ex23 {
	public static void main (String[] args) {
		System.out.println("Enter the first number: ");
		double firstNum = Double.parseDouble(System.console().readLine());
		System.out.println("Enter the second number: ");
		double secondNum = Double.parseDouble(System.console().readLine());
		System.out.println("Enter the third number: ");
		double thirdNum = Double.parseDouble(System.console().readLine());
		double maxNum = Math.max(firstNum, Math.max(secondNum, thirdNum));
		System.out.println("The max number is: " + maxNum);
	}
}