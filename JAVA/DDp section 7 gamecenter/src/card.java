import java.util.Random;
public class card {
    private static int cardBalance;
    Random rand = new Random();
    private String cardID;
    
    

    public int getCardBalance() {
        return cardBalance;
        
        
        
        
    }

    public String getCardID() {
       
        return cardID;
        
    }

    public static void addBalance(int amount) {
        cardBalance += amount;
    }

    public void balancecheck() {
        cardID =String.format("%04d", rand.nextInt(10000));
        System.out.println("Card ID: " + cardID + ", Balance: " + cardBalance);
    }

    
}
