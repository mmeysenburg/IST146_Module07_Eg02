import java.util.*;

/**
 * Class demonstrating use of a LinkedList as a queue. 
 */
public class QueueDemo {
  /**
   * Add some characters to a queue, then remove some of them.
   */
  public static void runDemo() {
    Random prng = new Random();

    // use a LinkedList as a queue. Since we need the special
    // LinkedList methods, we use a LinkedList reference.
    LinkedList<Character> queue = new LinkedList<>();

    // populate queue
    for(int i = 0; i < 20; i++) {
      char c = (char)('A' + prng.nextInt(26));
      System.out.printf("Enqueue %c\n", c);
      queue.addLast(c);
    }

    // display initial queue
    System.out.println("Initial queue: " + queue);

    // dequeue 5 elements
    for(int i = 0; i < 5; i++) {
      char c = queue.removeFirst();
      System.out.printf("Dequeue #%d: %c\n", i + 1, c);
    }

    // display final queue
    System.out.println("Final queue: " + queue);
  }
}