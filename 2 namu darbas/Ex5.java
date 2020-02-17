public class Ex5 {

    public static void main(String[] args) {
        System.out.println("Enter and integer between 1 and 7 :");
        int number = Integer.parseInt(System.console().readLine());
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("The number you entered is not an integer between 1 and 7");
        }
    }
}
