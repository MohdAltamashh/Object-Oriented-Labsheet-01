import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one character: ");
        char ch = sc.next().charAt(0);

        if (Character.isDigit(ch)) {
            System.out.println("It is a digit.");
        } else if (Character.isUpperCase(ch)) {
            System.out.println("It is an uppercase letter.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("It is a lowercase letter.");
        } else {
            System.out.println("It is a special character.");
        }
        sc.close();
    }
}
