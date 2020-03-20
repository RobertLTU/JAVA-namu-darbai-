public class Uzduotis3 {

    public static void main(String[] args) {
 double a = 0;
        double b = 0;
        String contBreak;
        String stopCalc = "n";
        do {
            System.out.println("Enter number a :");
            a = Double.valueOf(System.console().readLine());
            System.out.println("Enter number b :");
            b = Double.valueOf(System.console().readLine());

//      KODEL NESUVEIKIA SITAS VARIANTAS ???
//        System.out.println("Enter number a :");
//        a = Double.parseDouble(System.console().readLine())

//        System.out.println("Enter number b :");
//        b = Double.parseDouble(System.console().readLine())

            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
            System.out.println("Press \"n\" if you wish to stop the calculation");
            contBreak = System.console().readLine();
            
        } while (!contBreak.equals("n"));
    }
}
