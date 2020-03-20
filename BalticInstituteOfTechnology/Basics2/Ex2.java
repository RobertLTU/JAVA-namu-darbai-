public class Ex2 {

    public static void main(String[] args) {
        System.out.println("Iveskite kintamaji a : ");
        double a = Double.parseDouble(System.console().readLine());
        System.out.println("Iveskite kintamaji b : ");
        double b = Double.parseDouble(System.console().readLine());
        System.out.println("Iveskite kintamaji c : ");
        double c = Double.parseDouble(System.console().readLine());
        double discr = b * b - 4 * a * c;
        if (discr > 0) {
            double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
            double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
            System.out.println("Lygtis turi 2 tikruosius sprendimus:\nx1 = " + x1 + "\nx2 = " + x2);
        } else if (discr == 0) {
            double x = -b / (2.0 * a);
            System.out.println("Yra tik vienas lygties sprendimas x = " + x);
        } else {
            System.out.println("Lygtis neturi realiu sprendimu!");
        }

    }
}
