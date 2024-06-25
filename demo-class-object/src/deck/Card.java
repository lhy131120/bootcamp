package deck;

public class Card {

  private String suit;
  private String rank;

  public Card(String suit, String rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public String getSuit() {
    return this.suit;
  }

  public String getRank() {
    return this.rank;
  }

  public String toString() {
    return "Card(" //
        + "suit=" + this.suit //
        + ", rank=" + this.rank //
        + ")";
  }

}