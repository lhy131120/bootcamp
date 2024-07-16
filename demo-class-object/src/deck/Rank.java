package deck;

public enum Rank {
  ACE(14), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), JOKER(15), JOKERACE(16);

  private int value;

  private Rank (int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public boolean isHigherThan(Rank rank) {
    return this.value > rank.getValue();
  }

  public static void main(String[] args) {
    Rank currentRank = Rank.TWO;
    Rank targetRank = Rank.KING;

    // System.out.println(currentRank.getValue());
    System.out.println(currentRank.isHigherThan(targetRank));
  }
}

