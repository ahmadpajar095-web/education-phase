public class ExceptionEx1 {

    public static void main(String args[]) {

        int[] nums = {3, 2, 6, 1};
        badUse(nums);
    }

    public static void badUse(int[] vals) {

        try {
            int total = 0;

            for (int i = 0; i < vals.length; i++) {
                int index = vals[i];
                total += vals[index];
            }
            System.out.println(total);
            } catch (ArrayIndexOutOfBoundsException ea) {
            System.out.println("Array index out-of-bounds: " + ea.getMessage());
            System.out.println("ini error banhh");

            
        }
    }    
}
