package deck;

public enum Suit {
  DIAMOND(1), CLUB(2), HEART(3), SPADE(4),;

  private int rank;

  private Suit(int rank) {
    this.rank = rank;
  }

  public int getRank() {
    return this.rank;
  }

  // most of the instance methods should reger to "this"
  // if there is no "this" keyword in your method, then probably you should 
  // consider to use "Static method"
  public boolean isHigherThan(Suit suit) {
    return this.rank  > suit.getRank();
  }


  public static void main(String[] args) {

    Suit currentSuit = Suit.CLUB;
    Suit targetSuit = Suit.HEART;
    // 新手版
    // if (currentSuit.getRank() > targetSuit.getRank()) {

    // } 
    // 進階版，用method名演繹，最終目標：寫code即係寫文章
    if (currentSuit.isHigherThan(targetSuit)) {
      System.out.println("YES");
    } else {
      System.out.println("NOR");
    }
  }
}
