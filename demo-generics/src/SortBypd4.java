import java.util.Comparator;

public class SortBypd4 implements Comparator<Short>{

  @Override
  public int compare(Short o1, Short o2) {
    // TODO Auto-generated method stub
    return o2 > o1 ? -1 : 1; // ">" convert Short to short
    // throw new UnsupportedOperationException("Unimplemented method 'compare'");
  }
}
