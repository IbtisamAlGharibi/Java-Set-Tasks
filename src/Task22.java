import java.util.HashSet;
import java.util.Set;

public class Task22 {
    public static void main(String[] args){

        Set<String> countryNames = new HashSet<>();
        countryNames.add("Oman");
        countryNames.add("UAE");
        countryNames.add(" Saudi Arabia");
        countryNames.add("Qatar");
        countryNames.add("Bahrain");

        System.out.println(countryNames);
        countryNames.add("Lebanon");
        System.out.println(countryNames);

        countryNames.add("Lebanon");
        System.out.println(countryNames);

        boolean find = countryNames.contains("Oman");
        System.out.println(find);

        boolean find2 = countryNames.contains("UAE");
        System.out.println(find2);

        countryNames.remove("UAE");
        System.out.println(countryNames);

        System.out.println(countryNames.size());
        countryNames.add("Italy");
        System.out.println(countryNames);

        System.out.println(countryNames.size());
        countryNames.clear();

        System.out.println(countryNames);
        System.out.println(countryNames.size());
        System.out.println("The set now contains zero elements " + countryNames);

    }
}
