import java.util.HashSet;
import java.util.Set;

public class Task12 {
    public static void main(String[] args){
        Set<String> mobileApp = new HashSet<>();
        mobileApp.add("Watts");
        mobileApp.add("Insta");
        mobileApp.add("X");
        mobileApp.add("Teams");
        mobileApp.add("Clickup");

        System.out.println(mobileApp);
        mobileApp.add("Slack");
        System.out.println(mobileApp);

        boolean find = mobileApp.contains("Teams");
        System.out.println(find);

        mobileApp.remove("Teams");
        System.out.println(mobileApp);

        System.out.println(mobileApp.size());
        mobileApp.clear();

        System.out.println(mobileApp);
        System.out.println(mobileApp.size());


    }
}
