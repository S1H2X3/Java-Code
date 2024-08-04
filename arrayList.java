/**
 * arrayList
 */
import java.util.ArrayList;
import java.util.Iterator;
public class arrayList {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("London");
    list.add("Washington");
    list.add("Turkey");
    list.add("Canada");
    list.add("France");
    // System.out.println(list);
    Iterator <String> it = list.iterator();
    System.out.println(it.next());
    while (it.hasNext()) {
      System.out.println(it.next());
      
    }
  }
}