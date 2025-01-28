import java.util.Scanner;

public class Q23_Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner Alphabet = new Scanner(System.in);

        System.out.println("Enter your Character");
        char userchar = Alphabet.next().charAt(0);

        if(Character.isAlphabetic(userchar)) {
            if (userchar == 'A' || userchar == 'a') {
                System.out.println(userchar + " is a Vowel");
            } else if (userchar == 'E' || userchar == 'e') {
                System.out.println(userchar + " is a Vowel");
            } else if (userchar == 'I' || userchar == 'i') {
                System.out.println(userchar + " is a Vowel");
            } else if (userchar == 'O' || userchar == 'o') {
                System.out.println(userchar + " is a Vowel");
            } else if (userchar == 'U' || userchar == 'u') {
                System.out.println(userchar + " is a Vowel");
            } else {
                System.out.println(userchar + " is a Consonant");
            }
        }
        else {
            System.out.println("Please enter a valid input");
        }
        Alphabet.close();
    }
}
