public class Uzduotis3 {

    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        System.out.println("Enter number a :");
        a = Double.valueOf(System.console().readLine());
        System.out.println("Enter number b :");
        b = Double.valueOf(System.console().readLine());

//      KODEL NESUVEIKIA SITAS VARIANTAS su parseDouble???
//        System.out.println("Enter number a :");
//        a = Double.parseDouble(System.console().readLine())
        
//        System.out.println("Enter number b :");
//        b = Double.parseDouble(System.console().readLine())

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }
}