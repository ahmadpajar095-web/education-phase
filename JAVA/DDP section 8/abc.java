import java.util.Scanner;
public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = sc.nextInt();
            numbers[i] = element;
        }

        

    }
}
