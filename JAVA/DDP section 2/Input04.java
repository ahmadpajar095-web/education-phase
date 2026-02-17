import java.util.Scanner;
import java.io.*;

public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
        
        System.out.println(sc.nextLine());
        sc.nextLine();
        sc.nextLine();

         //Does this line contain "BlueBumper"?
        System.out.println(sc.findInLine("BlueBumper"));

        //Store the next two numbers as xPosition and yPosition

        int posisix = sc.nextInt();
        int posisiy = sc.nextInt();
        
        //Print these positions
        System.out.println("X: " + posisix    +", Y: " + posisiy       );
        sc.close();
    }    
}
