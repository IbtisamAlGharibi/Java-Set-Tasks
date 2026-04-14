import java.util.HashSet;
import java.util.Set;

public class ManageUniqueCityNames {
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

        boolean find = cityNames.contains("Ibri");
        System.out.println(find);

        cityNames.remove("Sur");
        System.out.println(cityNames);

        System.out.println(cityNames.size());
        cityNames.clear();

        System.out.println(cityNames);
        System.out.println(cityNames.size());

    }
}
