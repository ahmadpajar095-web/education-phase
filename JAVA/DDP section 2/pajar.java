import java.util.Scanner;

public class pajar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();                // Reads an integer but leaves a newline (\n)
        scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();           // Reads the leftover newline instead of
        
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);        // This prints an empty string!
          
    }

}
