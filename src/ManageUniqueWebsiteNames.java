import java.util.HashSet;
import java.util.Set;

public class ManageUniqueWebsiteNames {
    public static void main(String[] args){
        Set<String> websiteName = new HashSet<>();
        websiteName.add("Watts");
        websiteName.add("Insta");
        websiteName.add("X");
        websiteName.add("Teams");
        websiteName.add("Clickup");

        System.out.println(websiteName);
        websiteName.add("Slack");
        System.out.println(websiteName);

        boolean find = websiteName.contains("Teams");
        System.out.println(find);

        websiteName.remove("Teams");
        System.out.println(websiteName);

        System.out.println(websiteName.size());
        websiteName.clear();

        System.out.println(websiteName);
        System.out.println(websiteName.size());


    }

}
