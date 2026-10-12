import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter gender (male/female): ");
        String gender = sc.next().toLowerCase();

        if (age < 0) {
            System.out.println("Invalid age.");
        } else {
            if (gender.equals("male")) {
                if (age >= 21) {
                    System.out.println("Eligible for marriage according to the given criteria.");
                } else {
                    System.out.println("Not eligible: male age must be at least 21.");
                }
            } else if (gender.equals("female")) {
                if (age >= 18) {
                    System.out.println("Eligible for marriage according to the given criteria.");
                } else {
                    System.out.println("Not eligible: female age must be at least 18.");
                }
            } else {
                System.out.println("Invalid gender. Please enter male or female.");
            }
        }
        sc.close();
    }
}
