import java.util.HashSet;
import java.util.Set;

public class Task25 {

    public static void main(String[] args){

        Set<String> flowerNames = new HashSet<>();
        flowerNames.add(" Rose");
        flowerNames.add("Lily");
        flowerNames.add("Tulip");
        flowerNames.add("Sunflower");
        flowerNames.add("Jasmine");

        System.out.println(flowerNames);
        flowerNames.add("Blue Tulip");
        System.out.println(flowerNames);

        flowerNames.add("Blue Tulip");
        System.out.println(flowerNames);

        boolean find = flowerNames.contains("Rose");
        System.out.println(find);

        boolean find2 = flowerNames.contains("Lily");
        System.out.println(find2);

        flowerNames.remove("Lily");
        System.out.println(flowerNames);

        System.out.println(flowerNames.size());
        flowerNames.add("White Tulip");
        System.out.println(flowerNames);

        System.out.println(flowerNames.size());
        flowerNames.clear();

        System.out.println(flowerNames);
        System.out.println(flowerNames.size());
        System.out.println("The set now contains zero elements " + flowerNames);

    }
}
