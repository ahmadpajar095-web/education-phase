import java.util.Scanner;

public class terminal {
    card myCard = new card();

    public void welcomeMessage() {
        System.out.println("Welcome to the Game Center Terminal!");
    }
    public static void displayOptions() {
        System.out.println("1. Check Card Balance");
        System.out.println("2. Add Balance to Card");
        System.out.println("3. Exit");

        System.out.print("Please select an option: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                
                break;
            case 2:
                System.out.print("Enter amount to add: ");
                int amount = input.nextInt();
                card.addBalance(amount);
                
                System.out.println("Balance updated.");
                displayOptions();
            case 3:
                System.out.println("Exiting terminal. Thank you!");
                mainmenu.displayMenu();
            default:
                System.out.println("Invalid option. Please try again.");
                terminal.displayOptions();
                break;
        }
        


    }

    // private int cardBalance;
    // private String cardID;


    // public int getCardBalance() {
    //     return cardBalance;
        
        
        
        
    // }

    // public String getCardID() {
    //     return cardID;
    // }

    // public void addBalance(int amount) {
    //     cardBalance += amount;
    // }

    // public void balancecheck() {
    //     System.out.println("Card ID: " + cardID + ", Balance: " + cardBalance);
    // }
    

    
}
