import java.util.*;

public class ShortSet {
  public static void main (String[] args) {
    Set<Short> s = new HashSet<>();
    for (short i = 0; i < 100; i++) {
      s.add(i);
      Short sh = i - 1;
      s.remove(sh);
    }
    System.out.println(s.size());
  }
}


