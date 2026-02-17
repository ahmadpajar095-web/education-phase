import java.util.Scanner;
class Person {
    String name;
    int age;

    Person(String name, int age) {
    this.name = name;
    this.age = age;
    }

    void displayInfo() {
    if (age >= 18) {
        System.out.println(name + " is an adult.");
    } else {
        System.out.println(name + " is a minor.");
        }
    }

    void displayInfo(boolean showAge) {
    if (showAge) {
        System.out.println(name + " is " + age + " years old.");
    } else {
        displayInfo(); // Calls the original method
    }
    }
}

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        Person p = new Person(name, age);

        p.displayInfo(true);

        scanner.close();
    }
}