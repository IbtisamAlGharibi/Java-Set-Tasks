import java.util.HashSet;
import java.util.Set;

public class Task23 {

    public static void main(String[] args){

        Set<String> animalNames = new HashSet<>();
        animalNames.add(" Lion");
        animalNames.add("Tiger");
        animalNames.add("Elephant");
        animalNames.add("Giraffe");
        animalNames.add("Zebra");

        System.out.println(animalNames);
        animalNames.add("Cat");
        System.out.println(animalNames);

        animalNames.add("Cat");
        System.out.println(animalNames);

        boolean find = animalNames.contains("Lion");
        System.out.println(find);

        boolean find2 = animalNames.contains("Tiger");
        System.out.println(find2);

        animalNames.remove("Tiger");
        System.out.println(animalNames);

        System.out.println(animalNames.size());
        animalNames.add("Bear");
        System.out.println(animalNames);

        System.out.println(animalNames.size());
        animalNames.clear();

        System.out.println(animalNames);
        System.out.println(animalNames.size());
        System.out.println("The set now contains zero elements " + animalNames);

    }
}
