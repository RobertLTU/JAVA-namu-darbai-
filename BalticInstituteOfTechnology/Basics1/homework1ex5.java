/* HW 1.5 */
class homework1ex5
{
public static void main(String[] args)
	{
	System.out.println("Enter the first number: ");
	String firstString = System.console().readLine();
	int firstNumber = Integer.parseInt(firstString);
	System.out.println("Enter the second number: ");
	String secondString = System.console().readLine();
	int secondNumber = Integer.parseInt(secondString);
	System.out.println(firstString + " x " + secondString + " = " + firstNumber * secondNumber);
	}
}