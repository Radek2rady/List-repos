import java.util.ArrayList;
import java.util.List;

public class ListIntroduction2 {
  public static void main(String[] args) {

    ArrayList<String> List_A = new ArrayList<>();
    List_A.add("Apple");
    List_A.add("Avocado");
    List_A.add("Blueberries");
    List_A.add("Durian");
    List_A.add("Lychee");
    List<String> List_B = List_A;
    List_B.remove("Durian");
    List_A.add(3, "Kiwifruit");
    List_A.equals(List_B);
    List_A.indexOf("Avocado");
    List_B.indexOf("Durian");
    List<String> temp = List.of("Passion Fruit", "Pomelo");
    List_B.addAll(temp);
    System.out.println(List_A.get(2));
  }
}
