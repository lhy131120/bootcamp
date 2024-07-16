package deck;

public class Card {

  // private String suit;
  // private String rank;
  private Suit suit;
  private Rank rank;

  // public Card(String suit, String rank) {
  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  // public String getSuit() {
    public Suit getSuit() {
      return this.suit;
    }
    
  // public String getRank() {
  public Rank getRank() {
    return this.rank;
  }

  // Coding style: Early return
  public boolean isHigherThan(Card card) {
    if(this.rank.isHigherThan(card.getRank()))
      return true;
    if(this.rank == card.getRank() && this.suit.isHigherThan(card.getSuit()))
      return true;
    return false;
  }

  @Override
  public String toString() {
    return "Card(" //
        + "suit=" + this.suit //
        + ", rank=" + this.rank //
        + ")";
  }

}