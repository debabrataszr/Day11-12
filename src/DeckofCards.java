import java.util.Random;

public class DeckofCards {
    public static void main(String[] args) {
        int noOfPlayer = 4;
        int cardDistribute = 9;
        Random random = new Random();

        String[][] deck = new String[noOfPlayer][cardDistribute];
        for (int i = 0; i < noOfPlayer; i++) {
            for (int j = 0; j < cardDistribute; j++) {

                String cardType = (String) (random.nextInt(4) + "type");
                if (cardType.equals("0type")) {
                    cardType = "Clubs";
                } else if (cardType.equals("1type")) {
                    cardType = "Diamonds";
                } else if (cardType.equals("2type")) {
                    cardType = "Hearts";
                } else if (cardType.equals("3type")) {
                    cardType = "Spades";
                }

                String cardNo = (String) (random.nextInt(13) + "");
                if (cardNo.equals("1")) {
                    cardNo = "Ace";
                } else if (cardNo.equals("11")) {
                    cardNo = "Jack";
                } else if (cardNo.equals("12")) {
                    cardNo = "Queen";
                } else if (cardNo.equals("0")) {
                    cardNo = "King";
                }

                deck[i][j] = cardNo + " of " + cardType + "  ";
            }
        }

        for (int i = 0; i < noOfPlayer; i++) {
            System.out.print("Player " + (i + 1) + " : ");
            for (int j = 0; j < cardDistribute; j++) {
                System.out.print(deck[i][j] + " ");
            }
            System.out.println();
        }
    }
}