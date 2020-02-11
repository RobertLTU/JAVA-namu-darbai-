/* HW 1.7 
7. Write a Java program that takes a number as input and prints its multiplication table upto 10.*/

class homework1ex7
{
public static void main(String[] args)
	{
	System.out.println("Enter the base number: ");
	String baseString = System.console().readLine();
	int baseNumber = Integer.parseInt(baseString);
	System.out.println(baseString + " x 1 = " + (baseNumber * 1));
	System.out.println(baseString + " x 2 = " + (baseNumber * 2));
	System.out.println(baseString + " x 3 = " + (baseNumber * 3));
	System.out.println(baseString + " x 4 = " + (baseNumber * 4));
	System.out.println(baseString + " x 5 = " + (baseNumber * 5));
	System.out.println(baseString + " x 6 = " + (baseNumber * 6));
	System.out.println(baseString + " x 7 = " + (baseNumber * 7));
	System.out.println(baseString + " x 8 = " + (baseNumber * 8));
	System.out.println(baseString + " x 9 = " + (baseNumber * 9));
	System.out.println(baseString + " x 10 = " + (baseNumber * 10));
	}
}
