package namuDarbai.convaysLife;

public class Testing {
    public static void main(String[] args) {
        String[] testArray = new String[10];
        for (int i = 0; i < testArray.length; i++) {
            if (i < 5) testArray[i] = " ";
            else testArray[i] = "X";
        }

        for (int i = 0; i < testArray.length; i++) {
            if (!testArray[i].equals(" ")) {
                System.out.println("NOT A WHITE SPACE  HERE ");
            }else{
                    System.out.println("WHITE SPACE HERE");
                }
        }
    }
}
