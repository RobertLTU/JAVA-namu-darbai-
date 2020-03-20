public class Ex6 {

    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        double x = Double.parseDouble(System.console().readLine());
        System.out.println("Enter the second number");
        double y = Double.parseDouble(System.console().readLine());

        //Kodel nesuveikia sitas variantas ??????
//        x = (Math.round(x * 1000))/1000;
//        y = (Math.round(y * 1000))/1000;

        x = Math.round(x * 1000);
        y = Math.round(y * 1000);
        x = x / 1000;
        y = y / 1000;
        System.out.println(x);
        System.out.println(y);
    }
}
