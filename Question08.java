import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet character: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        if (!Character.isLetter(ch)) {
            System.out.println("Input is not an alphabet.");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("It is a vowel.");
        } else {
            System.out.println("It is a consonant.");
        }
        sc.close();
    }
}
