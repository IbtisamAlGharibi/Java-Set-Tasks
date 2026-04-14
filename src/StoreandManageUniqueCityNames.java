import java.util.HashSet;
import java.util.Set;

public class StoreandManageUniqueCityNames {
    public static void main(String[] args){
        Set<String> cityNames = new HashSet<>();
        cityNames.add("Ibri");
        cityNames.add("Sohar");
        cityNames.add("Muscat");
        cityNames.add("Nizwa");
        cityNames.add("Salalah");

        System.out.println(cityNames);
        cityNames.add("Sur");
        System.out.println(cityNames);

        cityNames.add("Sur");
        System.out.println(cityNames);

        boolean find = cityNames.contains("Ibri");
        System.out.println(find);

        boolean find2 = cityNames.contains("Sur");
        System.out.println(find2);

        cityNames.remove("Sur");
        System.out.println(cityNames);

        cityNames.add("Musandam");
        System.out.println(cityNames);

        System.out.println(cityNames.size());
        cityNames.clear();

        System.out.println("The set now contains zero elements " + cityNames);

    }
}
