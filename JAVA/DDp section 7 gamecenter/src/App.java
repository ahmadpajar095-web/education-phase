import java.util.*;

public class App {
    public static void main(String[] args) {
        // Buat dua kartu
        Card card1 = new Card(1);
        Card card2 = new Card(2);

        // Buat terminal dan game
        Terminal terminal = new Terminal();
        Game game = new Game(5); // Game butuh 5 kredit untuk main

        // Tambahkan kategori hadiah ke terminal
        terminal.addPrizeCategory(new PrizeCategory("Boneka", 10, 5));
        terminal.addPrizeCategory(new PrizeCategory("Sticker", 3, 10));
        terminal.addPrizeCategory(new PrizeCategory("Gantungan Kunci", 5, 7));

        // 1. Isi saldo ke masing-masing kartu
        terminal.loadCredits(card1, 20); // Card1 dapat 20 kredit
        terminal.loadCredits(card2, 15); // Card2 dapat 15 kredit

        // 2. Main game pakai kedua kartu
        game.play(card1);
        game.play(card2);

        // 3. Transfer saldo dari Card1 ke Card2
        terminal.transferCredits(card1, card2, 5);

        // 4. Tukar hadiah pakai Card2
        terminal.redeemPrize(card2, "Boneka");

        // 5. Coba main lagi pakai Card1 dan tukar hadiah
        game.play(card1);
        terminal.redeemPrize(card1, "Sticker");

        // Cetak hasil akhir
        System.out.println("\n=== STATUS AKHIR ===");
        System.out.println(card1);
        System.out.println(card2);
    }
}

// ================= CLASS CARD =================
class Card {
    private int id;
    private int credits;
    private int tickets;

    public Card(int id) {
        this.id = id;
        this.credits = 0;
        this.tickets = 0;
    }

    public int getCredits() { return credits; }
    public int getTickets() { return tickets; }
    public int getId() { return id; }

    public void addCredits(int amount) { credits += amount; }
    public void deductCredits(int amount) { credits -= amount; }
    public void addTickets(int amount) { tickets += amount; }

    @Override
    public String toString() {
        return "Card " + id + " -> Credits: " + credits + ", Tickets: " + tickets;
    }
}

// ================= CLASS GAME =================
class Game {
    private int costCredits;
    private Random rand = new Random();

    public Game(int costCredits) {
        this.costCredits = costCredits;
    }

    public void play(Card card) {
        if (card.getCredits() >= costCredits) {
            card.deductCredits(costCredits);
            int ticketsWon = rand.nextInt(10); // tiket random 0-9
            card.addTickets(ticketsWon);
            System.out.println("Card " + card.getId() + " played game and won " + ticketsWon + " tickets!");
        } else {
            System.out.println("Card " + card.getId() + " does not have enough credits to play!");
        }
    }
}

// ================= CLASS PRIZECATEGORY =================
class PrizeCategory {
    private String name;
    private int ticketsRequired;
    private int count;

    public PrizeCategory(String name, int ticketsRequired, int count) {
        this.name = name;
        this.ticketsRequired = ticketsRequired;
        this.count = count;
    }

    public String getName() { return name; }
    public int getTicketsRequired() { return ticketsRequired; }
    public int getCount() { return count; }

    public boolean redeem() {
        if (count > 0) {
            count--;
            return true;
        }
        return false;
    }
}

// ================= CLASS TERMINAL =================
class Terminal {
    private List<PrizeCategory> prizes = new ArrayList<>();

    public void addPrizeCategory(PrizeCategory prize) {
        prizes.add(prize);
    }

    public void loadCredits(Card card, int money) {
        int credits = money * 2; // $1 = 2 credits
        card.addCredits(credits);
        System.out.println("Loaded " + credits + " credits to Card " + card.getId());
    }

    public void transferCredits(Card from, Card to, int amount) {
        if (from.getCredits() >= amount) {
            from.deductCredits(amount);
            to.addCredits(amount);
            System.out.println("Transferred " + amount + " credits from Card " + from.getId() + " to Card " + to.getId());
        } else {
            System.out.println("Transfer failed! Not enough credits on Card " + from.getId());
        }
    }

    public void redeemPrize(Card card, String prizeName) {
        for (PrizeCategory prize : prizes) {
            if (prize.getName().equalsIgnoreCase(prizeName)) {
                if (card.getTickets() >= prize.getTicketsRequired()) {
                    if (prize.redeem()) {
                        card.addTickets(-prize.getTicketsRequired());
                        System.out.println("Card " + card.getId() + " redeemed prize: " + prizeName);
                    } else {
                        System.out.println("Prize " + prizeName + " is out of stock!");
                    }
                } else {
                    System.out.println("Card " + card.getId() + " does not have enough tickets for " + prizeName);
                }
                return;
            }
        }
        System.out.println("Prize " + prizeName + " not found!");
    }
}