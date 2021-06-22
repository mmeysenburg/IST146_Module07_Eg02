import java.util.*;

/**
 * Class demonstrating very simple lists.
 */
public class ListDemo {
  /**
   * Add some characters to an ArrayList and a LinkedList.
   */
  public static void runDemo() {
    Random prng = new Random();

    // these are both lists - note how the references are to 
    // the List interface, while the objects are concrete 
    // sublcasses 
    List<Character> list1 = new ArrayList<>();
    List<Character> list2 = new LinkedList<>();

    // populate the lists; when printed, they should be 
    // identical
    for(int i = 0; i < 20; i++) {
      char c = (char)('A' + prng.nextInt(26));
      list1.add(c);
      list2.add(c);
    }

    // Search "Java List API" for methods shared by all lists
    // Search "Java LinkedList API" or "Java ArrayList API" for
    // differences (e.g., LinkedList has addFirst(), ArrayList 
    // does not). If you need to use methods specific to LinkedList
    // or ArrayList, use LinkedList / ArrayList as the reference
    // type, vs. List. 

    // display the list contents
    System.out.println("ArrayList:  " + list1);
    System.out.println("LinkedList: " + list2);
  }
}