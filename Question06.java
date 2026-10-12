import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one character: ");
        char ch = sc.next().charAt(0);

        System.out.println("Character = " + ch);
        System.out.println("Numeric code value = " + (int) ch);
        System.out.println("(For standard ASCII characters, this is the ASCII value.)");
        sc.close();
    }
}
