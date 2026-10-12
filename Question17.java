import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println(number + " is not a palindrome.");
        } else {
            int original = number;
            int temp = number;
            int reversed = 0;

            while (temp > 0) {
                int digit = (int) (temp % 10); // Explicit type cast
                reversed = reversed * 10 + digit;
                temp /= 10;
            }

            if (original == reversed) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }
        }
        sc.close();
    }
}
