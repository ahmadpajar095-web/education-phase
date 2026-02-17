import javax.swing.JOptionPane;
import java.util.Scanner;
public class inputtest {
    public static void main(String[] args) {
        masukkan();

        Scanner mm = new Scanner(System.in);
         

        
    
        
    }//main

    public static void masukkan() {
        String angka = JOptionPane.showInputDialog("satu ditambah satu =");
        int x = Integer.parseInt(angka);

        if ( x == 2 ) {
            System.out.println("benar");
            JOptionPane.showMessageDialog(null, " maaf, jawaban anda benar !!!!!");


        }else {
            System.out.println("salah");
            JOptionPane.showMessageDialog(null,"selamat, jawaban anda ternyata salah .......");

        }
        };
    

}//inputtest
