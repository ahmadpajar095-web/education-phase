import java.util.Scanner;

public class mainmenu {

    public static void displayMenu() {
         System.out.println("selamat datang di gamecenter\n==========================\n");
        System.out.println(
            """
            Pilih Menu:
            1. buat kartu baru
            2. cek saldo kartu
            3. mainkan game
            4. tukar hadiah
            5. isi ulang saldo kartu
            6. keluar
            ==========================
            """
        );
        System.out.print("Masukkan pilihan Anda: ");            
        Scanner input = new Scanner(System.in);
        int swtoken = input.nextInt();

        switch (swtoken) {
            case 1:
                card newCard = new card();
                System.out.println("Kartu baru dibuat dengan ID: " + newCard.getCardID());
                displayMenu();
                break;
            case 2:
                card myCard = new card();
                myCard.balancecheck();
                break;
            case 3:
                gamestand game = new gamestand();
                break;
            case 4:
                prizechanger prize = new prizechanger();
                break;
            case 5:
                
                terminal.displayOptions();

                break;
            case 6:
                System.out.println("Terima kasih telah berkunjung!");
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                displayMenu();

        }
        
    }
    
}
