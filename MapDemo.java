import java.util.*;

/**
 * Simple demo of a map.
 */
public class MapDemo {
  /**
   * Use a map to count the frequency of randomly-generated characters.
   */
  public static void runDemo() {
    Random prng = new Random();

    // We will only do TreeMap here. The only difference according
    // to the output would be the order of the keys. As things
    // are implemented in Java, characters are placed in a HashSet / Map in
    // alphabetic order, but that is not generally true (see, e.g., city
    // names in the SetDemo class)
    Map<Character, Integer> map = new TreeMap<>();

    // randomly create characters and count how many times each
    // is seen
    for(int i = 0; i < 1000000; i++) {
      char c = (char)('A' + prng.nextInt(26));

      // if we've seen the character before...
      if(map.containsKey(c)) {
        // ... increment its count by one
        map.put(c, map.get(c) + 1);
      } else {
        // otherwise, its the first time 
        map.put(c, 1);
      }
    }

    // display the counts -- they should all be fairly equal
    for(char c : map.keySet()) {
      System.out.printf("%c: %6d\n", c, map.get(c));
    }
  }
}