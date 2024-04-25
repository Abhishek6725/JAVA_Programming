import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
           
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            
            
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            
            System.out.println("Hello, " + name + "! You are " + age + " years old.");
        } catch (Exception e) {
            
            System.out.println("Error: Invalid input. Please enter a valid name and age.");
        } finally {
           
            scanner.close();
        }
    }
}
