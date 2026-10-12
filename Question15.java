import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit integer: ");
        int number = sc.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Please enter a positive 3-digit number.");
        } else {
            int temp = number;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (sum == number) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }
        sc.close();
    }
}
