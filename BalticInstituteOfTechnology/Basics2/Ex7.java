/*
A leap year occurs every four years within a century, and only on the century if it is divisible by 400.... 2000 is divisible by 400, whereas 1900 is not.
 */

public class Ex7 {

    public static void main(String[] args) {
        System.out.println("Input a month number 1 - 12: ");
        int monthNum = Integer.parseInt(System.console().readLine());
        System.out.println("Input a year");
        int yearNum = Integer.parseInt(System.console().readLine());
        switch (monthNum) {
            case 1:
                System.out.println("Sausis " + yearNum + " turi 31 d.");
                break;
            case 2:
                if (yearNum % 4 != 0) {
                    System.out.println("Vasaris " + yearNum + " turi 28 d.");
                } else if (yearNum % 4 == 0 && yearNum % 100 != 0) {
                    System.out.println("Vasaris " + yearNum + " turi 29 d.");
                } else if (yearNum % 400 == 0) {
                    System.out.println("Vasaris " + yearNum + " turi 29 d.");
                } else {
                    System.out.println("Vasaris " + yearNum + " turi 28 d.");
                }
                break;
            case 3:
                System.out.println("Kovas " + yearNum + " turi 31 d.");
                break;
            case 4:
                System.out.println("Balandis " + yearNum + " turi 30 d.");
                break;
            case 5:
                System.out.println("Geguze " + yearNum + " turi 31 d.");
                break;
            case 6:
                System.out.println("Birzelis " + yearNum + " turi 30 d.");
                break;
            case 7:
                System.out.println("Liepa " + yearNum + " turi 31 d.");
                break;
            case 8:
                System.out.println("Rugpjutis " + yearNum + " turi 31 d.");
                break;
            case 9:
                System.out.println("Rugsejis " + yearNum + " turi 30 d.");
                break;
            case 10:
                System.out.println("Spalis " + yearNum + " turi 31 d.");
                break;
            case 11:
                System.out.println("Lapkritis " + yearNum + " turi 30 d.");
                break;
            case 12:
                System.out.println("Kovas " + yearNum + " turi 31 d.");
                break;
        }
    }
}
