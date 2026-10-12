import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual income/salary: ");
        double salary = sc.nextDouble();

        if (salary < 0) {
            System.out.println("Salary cannot be negative.");
        } else {
            double rate;
            if (salary <= 250000) {
                rate = 0.0;
            } else if (salary <= 500000) {
                rate = 0.05;
            } else if (salary <= 1000000) {
                rate = 0.20;
            } else {
                rate = 0.30;
            }

            double tax = salary * rate;
            System.out.printf("Tax rate = %.0f%%%n", rate * 100);
            System.out.printf("Tax amount = %.2f%n", tax);
            System.out.printf("Income after this tax calculation = %.2f%n", salary - tax);
        }
        sc.close();
    }
}
