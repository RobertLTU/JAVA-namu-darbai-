/* HW 1.6 */
class homework1ex6
{
public static void main(String[] args)
	{
	System.out.println("Enter the first number: ");
	int firstNumber = Integer.parseInt(System.console().readLine());
	System.out.println("Enter the second number: ");
	int secondNumber = Integer.parseInt(System.console().readLine());
	int resultSum = (firstNumber + secondNumber);
	int resultMinus = (firstNumber - secondNumber);
	int resultSub =(firstNumber * secondNumber);
	int resultDivide =(firstNumber / secondNumber);
	int resultModulo =(firstNumber % secondNumber);
	System.out.println(firstNumber + " + " + secondNumber + " = " + resultSum);
	System.out.println(firstNumber + " - " + secondNumber + " = " + resultMinus);
	System.out.println(firstNumber + " * " + secondNumber + " = " + resultSub);
	System.out.println(firstNumber + " / " + secondNumber + " = " + resultDivide);
	System.out.println(firstNumber + " mod " + secondNumber + " = " + resultModulo);
	}
}