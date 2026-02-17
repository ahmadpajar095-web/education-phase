import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int umur;
        String nama;
        double tinggi;

        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nama anda: ");
        nama = input.nextLine();
        System.out.print("umur anda: ");
        umur = input.nextInt();
        System.out.print("tinggi anda (dalam meter): ");
        tinggi = input.nextDouble();
        input.close();

        System.out.println("nama saya " + nama);
        System.out.println("umur saya " + umur + " tahun");
        System.out.println("tinggi saya " + tinggi + " meter");

        int nilai = 80;
        if (nilai >= 75){
            System.out.println("selamat anda lulus");
        }
        else {
            System.out.println("maaf, anda tidak lulus");
        }
        for (int i =nilai; i <= 85; i++){
            System.out.println("perulangan ke " + i);
        }

    }
}
