public class classlain {
   public double balance;
   public double interestRate;
   public String nama;

   public classlain(String custName, double initialBalance, double rate)
   {
      nama         = custName;
      balance      = initialBalance;
      interestRate = rate;
   }
      
   public void displayCustomer(int umur)
   {
      System.out.println("Customer: " + nama + umur);
      System.out.println("Balance: "  + balance);
      System.out.println("Rate: "     + interestRate);
      int tahun = 5 + umur ;
   }//end method displayCustomer  
   
   public static int hitung(int a, int b) 
   {
        int hasil = a + b;
        return hasil; // Kirim nilai keluar
    }

}