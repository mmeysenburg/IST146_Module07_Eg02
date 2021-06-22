import java.util.*;

/**
 * Class demonstrating Sets.
 */
public class SetDemo {
  /**
   * Add strings to TreeSet and HashSet, display to see
   * differences in order.
   */
  public static void runDemo() {

    // array of city names from Alabama and Alaska; Anchorage is
    // in the array twice.
    String[] cities = {"Scottsboro", "Kotzebue", "Fairbanks", "Sheffield",
      "Tuskegee","Opelika", "Jasper", "Cordova", "Andalusia", "Seward", 
      "Phenix City", "Haines", "Anchorage", "Bessemer", "Fort Payne", "Troy", 
      "Huntsville", "Homer", "Talladega", "Juneau", "Auburn", "Nome", "Montgomery", "Birmingham", "Eufaula", "Kodiak", "Sitka", "Greenville", 
      "Demopolis", "Decatur", "Florence", "Clanton", "Selma", "Chickasaw", 
      "Atmore", "Sylacauga", "Ozark", "Guntersville", "Valdez", "Mobile", 
      "Dothan", "Cullman", "Enterprise", "Ketchikan", "Tuscumbia", "Anniston", 
      "Prichard", "Palmer", "Skagway", "Tuscaloosa", "Marion", 
      "Alexander City", "Gadsden", "Anchorage"};

    // Create two sets
    Set<String> set1 = new TreeSet<>();
    Set<String> set2 = new HashSet<>();

    // Add the city names to each set
    for(String s : cities) {
      if(!set1.add(s)) {
        System.out.printf("%s was already in set1", s);
      }
      if(!set2.add(s)) {
        System.out.printf(" and in set2\n");
      }
    }

    // note the difference in the order of the set elements!
    System.out.println();
    System.out.println("TreeSet: " + set1);
    System.out.println();
    System.out.println("HashSet: " + set2);
  }
}