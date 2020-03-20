public class Ex9 {

    public static void main(String[] args) {
        System.out.println("Input a year");
        int yearNum = Integer.parseInt(System.console().readLine());
        if (yearNum % 4 != 0) {
            System.out.println(yearNum + " is not a leap year");
        } else if (yearNum % 4 == 0 && yearNum % 100 != 0) {
            System.out.println(yearNum + " is  a leap year");
        } else if (yearNum % 100 == 0 && yearNum % 400 == 0) {
            System.out.println(yearNum + " is  a leap year");
        } else {
            System.out.println(yearNum + " is not a leap year");
        }
    }
}
