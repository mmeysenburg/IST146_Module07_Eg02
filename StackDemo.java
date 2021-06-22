import java.util.*;

/**
 * Class demonstrating use of a Stack. 
 */
public class StackDemo {
  /**
   * Add some characters to a stack, then remove some of them.
   */
  public static void runDemo() {
    Random prng = new Random();

    Stack<Character> stack = new Stack<>();

    // populate stack
    for(int i = 0; i < 20; i++) {
      char c = (char)('A' + prng.nextInt(26));
      System.out.printf("Push %c\n", c);
      stack.push(c);
    }

    // display initial stack
    System.out.println("Top is at the right ============>");
    System.out.println("Initial stack: " + stack);

    // pop 5 elements
    for(int i = 0; i < 5; i++) {
      char c = stack.pop();
      System.out.printf("Pop #%d: %c\n", i + 1, c);
    }

    // display final stack
    System.out.println("Top is at the right ============>");
    System.out.println("Final stack: " + stack);
  }
}