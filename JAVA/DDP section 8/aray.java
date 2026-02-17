import java.util.ArrayList;
import java.util.Scanner;
public class aray{
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        ArrayList<Object> data = new ArrayList<Object>();
        System.out.print("masukkan nama teman anda : ");
        String nama = x.nextLine();
        data.add(nama);


        
        for (int xy = 1; xy<= data.size(); xy++) {
            System.out.println(xy + ". " + data.get(xy-1));
        }

        ArraysUtilities_Start arr = new ArraysUtilities_Start();
        arr.buildList();
        arr.getSum();
        System.out.println("Original List: " + arr.toString());



        
        
        
    }


}
