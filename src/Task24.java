import java.util.HashSet;
import java.util.Set;

public class Task24 {
    public static void main(String[] args){

        Set<String> fruitNames = new HashSet<>();
        fruitNames.add(" Apple");
        fruitNames.add("Banana");
        fruitNames.add("Mango");
        fruitNames.add("Orange");
        fruitNames.add("Grape");

        System.out.println(fruitNames);
        fruitNames.add("Green Apple");
        System.out.println(fruitNames);

        fruitNames.add("Green Apple");
        System.out.println(fruitNames);

        boolean find = fruitNames.contains("Apple");
        System.out.println(find);

        boolean find2 = fruitNames.contains("Banana");
        System.out.println(find2);

        fruitNames.remove("Banana");
        System.out.println(fruitNames);

        System.out.println(fruitNames.size());
        fruitNames.add("Watermelon");
        System.out.println(fruitNames);

        System.out.println(fruitNames.size());
        fruitNames.clear();

        System.out.println(fruitNames);
        System.out.println(fruitNames.size());
        System.out.println("The set now contains zero elements " + fruitNames);

    }
}
