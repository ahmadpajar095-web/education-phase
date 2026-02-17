public class hai {
    
public static void main(String[] args) {
    System.out.println("this is my sorting project");

    int[] arr = {7, 8, 3, 8, 3, 1, 2};
    // bubble sort
    for (int i = 0 ; i < arr.length; i++) {
        for (int j = 0 + i; j < arr.length ; j++){
            if (arr[j] > arr[i]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

    } 
    System.out.println("sorted array is:");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
        
    

    
}
}
