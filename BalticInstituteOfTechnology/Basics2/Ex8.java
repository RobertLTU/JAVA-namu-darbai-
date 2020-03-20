/*
5 Vowels : A  E  I  O  U
All the remaining 21 are Consonants
 */

public class Ex8 {

    public static void main(String[] args) {
        System.out.println("Enter a single alphabet letter :");
        String abc = (System.console().readLine()).toLowerCase();
        char x = abc.charAt(0);

        if (abc.length() > 1) {
            System.out.println("Error. More than 1 character entered");
        } else if (!((x >= 65 && x <= 90) || (x >= 97 && x <= 122))) {
            System.out.println("Error. Not an English alphabet letter");
        } else if (abc.equals("a") || abc.equals("e") || abc.equals("i") || abc.equals("o") || abc.equals("u")) {
            System.out.println("The letter is Vowel");
        } else {
            System.out.println("The letter is Consonant");
        }
    }
}
