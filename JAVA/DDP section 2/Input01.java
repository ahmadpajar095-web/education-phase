import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        String umur =  JOptionPane.showInputDialog("umur kamu :");
        System.out.println(umur);

        //Store the input as a String and print it.
        String input = JOptionPane.showInputDialog("Type something:");
        System.out.println(input);


        
        
        
        //Parse the input as an int.
        
        //Print its value +1
        int umurmu = Integer.parseInt(JOptionPane.showInputDialog("berapa umur kamu sekarang? ")) + 5;
        System.out.println("dalam 5 tahun kamu akan berumur" + umurmu);

        
        
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        
    }
}
