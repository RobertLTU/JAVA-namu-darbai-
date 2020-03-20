/* 3 uzduotis
*/

public class Ex3 {
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