import java.util.Scanner;

public class CashApp {
       public static void main(String[] args) {
        CashCard[] cards = {
            new CashCard("A001", 500, 0),
            new CashCard("A002", 300, 0),
            new CashCard("A003", 1000, 1)
        };

        Scanner scanner = new Scanner(System.in);
        for(CashCard card : cards) {
            System.out.printf("为(%s, %d, %d) 储值：", card.getNumber(), card.getBalance(), card.getBonus());
            card.store(scanner.nextInt());
            System.out.printf("明细 (%s, %d, %d)%n", card.getNumber(), card.getBalance(), card.getBonus());
        }
    }
}
