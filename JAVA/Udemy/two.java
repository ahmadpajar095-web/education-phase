public class two {
    public static void main(String[] args) {
        String satu = "air" ;
        String dua = "kopi" ;
        String tiga = "susu" ;
        String empat ="kosong" ;

        empat = satu;
        satu = dua ;
        dua = tiga;
        tiga = empat;


        System.out.println(satu+dua+tiga);
    }

}
