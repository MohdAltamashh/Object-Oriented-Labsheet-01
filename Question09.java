import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in subject 1 (out of 100): ");
        double m1 = sc.nextDouble();
        System.out.print("Enter marks in subject 2 (out of 100): ");
        double m2 = sc.nextDouble();
        System.out.print("Enter marks in subject 3 (out of 100): ");
        double m3 = sc.nextDouble();

        if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100) {
            System.out.println("Invalid marks. Each subject must be between 0 and 100.");
        } else {
            double total = m1 + m2 + m3;
            double percentage = total / 3.0;
            System.out.println("Total marks = " + total + " / 300");
            System.out.printf("Percentage = %.2f%%%n", percentage);

            if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
                System.out.println("Result: PASS");
            } else {
                System.out.println("Result: FAIL");
            }
        }
        sc.close();
    }
}
