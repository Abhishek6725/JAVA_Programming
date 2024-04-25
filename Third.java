import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String num1 = sc.next();
            String num2 = sc.next();
            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            float c = (a * 100) / b;
            System.out.printf("%.2f%%\n", c);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}


