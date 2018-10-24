import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards;
	private ArrayList<Card> usedCard;
	public int nUsed;

	// TODO: Please implement the constructor
	/**
	 * 使用三層迴圈，將撲克牌寫進cards裡 
	 * 第一層迴圈:使用者輸入的撲克牌副數(nDeck) 
	 * 第二層迴圈:花色(Suit) 
	 * 第三層迴圈:數字(1~13)
	 * 使用for迴圈重複使用printCard method in Card class直到把cards跑完
	 */
	public Deck(int nDeck) {
		cards = new ArrayList<Card>();
		usedCard = new ArrayList<Card>();
		for (int n = 0; n < nDeck; n++) {
			for (Card.Suit s : Card.Suit.values()) {
				for (int y = 1; y < 14; y++) {
					Card card = new Card(s, y);
					cards.add(card);
				}
			}
		}
		shuffle();
	}

	// TODO: Please implement the method to print all cards on screen 
	public void printDeck() {
		// TODO: please implement and reuse printCard method in Card class
		for (Card cardss : cards) {
			cardss.printCard();
		}
	}

	public ArrayList<Card> getAllCards() {
		return cards;
	}

	public void shuffle() {
		if (usedCard.size() > 0) {
			for (Card recycle : usedCard) {
				cards.add(recycle);
			}
			usedCard.clear();
			nUsed = 0;
		}
		Random rnd = new Random();
		for (int i = 0; i < cards.size(); i++) {
			int j = rnd.nextInt(i + 1);
			Card newCard = cards.get(j);
			cards.set(j, cards.get(i));
			cards.set(i, newCard);
		}
	}

	public Card getOneCard() {
		if (cards.size() == 0) {
			shuffle();
		}

		Card record = cards.get(0);
		usedCard.add(record);
		nUsed++;
		cards.remove(record);
		return record;
	}
}
