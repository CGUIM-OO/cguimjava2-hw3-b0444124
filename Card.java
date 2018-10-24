
public class Card {
	enum Suit {
		Club, Diamond, Heart, Spade
	}

	private Suit suit; // Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4
	private int rank; // 1~13

	/**
	 * @param s suit
	 * @param r rank
	 */
	public Card(Suit s, int value) {
		suit = s;
		rank = value;
	}

	// TODO: 1. Please implement the printCard method 
	public void printCard() {
		String s = "";
		String value = "";

		switch (suit) {
		case Club:
			s = "Club";
			break;
		case Diamond:
			s = "Diamond";
			break;
		case Heart:
			s = "Heart";
			break;
		case Spade:
			s = "Spade";
			break;
		}

		switch (rank) {
		case 1:
			value = "Ace";
			break;
		case 11:
			value = "Jack";
			break;
		case 12:
			value = "Queen";
			break;
		case 13:
			value = "King";
			break;
		default:
			value = Integer.toString(rank);
			break;
		}
		System.out.println(s + "," + value);
	}

	public Suit getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}
}
