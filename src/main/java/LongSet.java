import java.util.*;

public class LongSet {
  public static void main (String[] args) {
    Set<Short> s = new HashSet<Short>();
    for (short i = 0; i < 100000; i++) {
	short sh = i - 1;
        s.add(i);
	s.remove(sh);
    }
    System.out.println(s.size());
  }
}


