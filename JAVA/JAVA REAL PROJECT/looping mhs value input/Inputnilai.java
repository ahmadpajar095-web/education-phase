import java.util.Scanner;
public class Inputnilai {
    static int  nilaiformatif, nilaiuts, nilaiuas;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int token = 1;
        while (token == 1) {
        
            System.out.print("masukkan nama mahasiswa : ");
            String nama = in.nextLine();
            
            
            
            System.out.print("masukkan NIM mahasiswa  : ");
            String nim = in.nextLine();
            
            System.out.print("masukkan Nilai formatif mahasiswa (0 - 100)   : ");
            nilaiformatif = in.nextInt();
            while (nilaiformatif > 100 || nilaiformatif < 0) {
                System.out.println("nilai invalid");
                System.out.print("masukkan Nilai formatif mahasiswa (0 - 100)   : ");
                nilaiformatif = in.nextInt();
                
            }
            System.out.print("masukkan Nilai UTS mahasiswa (0 - 100)        : ");
            nilaiuts = in.nextInt();
            while (nilaiuts > 100 || nilaiformatif < 0) {
                    System.out.println("nilai invalid");
                    System.out.print("masukkan Nilai UTS mahasiswa (0 - 100)        : ");
                    nilaiuts = in.nextInt();
            }
            System.out.print("masukkan Nilai UAS mahasiswa (0 - 100)        : ");
            nilaiuas = in.nextInt();
            while (nilaiuas > 100 || nilaiformatif < 0) {
                        System.out.println("nilai invalid");
                        System.out.print("masukkan Nilai UAS mahasiswa (0 - 100)        : ");
                        nilaiuas = in.nextInt();
            }

            int maximum=0;
            int minimum=100;

            if (maximum < nilaiformatif) {
                maximum = nilaiformatif;
            }
            if (maximum < nilaiuts) {
                maximum = nilaiuts;
            }
            if (maximum < nilaiuas) {
                maximum = nilaiuas;

            }
            if (minimum > nilaiformatif) {
                minimum = nilaiformatif;
            }
            if (minimum > nilaiuts) {
                minimum = nilaiuts;
            }
            if (minimum > nilaiuas) {
                minimum = nilaiuas;
            }

        
            int nilaikumulatif = (nilaiformatif+nilaiuas+ nilaiuts);
            int nilairata = (nilaikumulatif/3);

            System.out.println("NAMA                : " + nama);
            System.out.println("NIM                 : " + nim);
            System.out.println("================================");
            System.out.println( "NILAI FORMATIF     : " + nilaiformatif);
            System.out.println( "NILAI UTS          : " + nilaiuts);
            System.out.println( "NILAI UAS          : " + nilaiuas);
            System.out.println("================================");
            System.out.println( "NILAI KUMULATIF    : " + nilaikumulatif);
            System.out.println( "NILAI RATA-RATA    : " + nilairata);
            System.out.println("NILAI TERBESAR      : " + maximum);
            System.out.println("NILAI TERKECIL      : " + minimum);
            
            
            
            
            
            if (nilairata >= 85){
                System.out.println("NILAI = A");
            }else if (nilairata >= 70){
                System.out.println("NILAI = B");
            }else if (nilairata >= 60){
                System.out.println("NILAI = C");
            }else if (nilairata >= 40){
                System.out.println("NILAI = D");
            }else {
                System.out.println("NILAI = E");
            }
            
            int ulang=1;
            while (ulang == 1) {
                System.out.println("Apakah Anda ingin memasukkan nilai lagi? (1 untuk ya, 0 untuk tidak)");
                token = in.nextInt();
                ulang = 0;
            }
            if (token == 0) {
                System.out.println("Terima kasih telah menggunakan program ini.");
            }
            if (token != 0 && token != 1){
                System.out.println("input tidak valid");
                ulang = 1;
            }
           
            in.nextLine();
            
            
        }
        in.close();
        
    }
}
