import java.util.HashSet;
import java.util.Set;

public class ClearAllElements {
    public static void main(String[] args){
        Set<String> userName = new HashSet<>();
        userName.add("prod1");
        userName.add("prod2");
        userName.add("prod3");
        userName.add("prod4");
        userName.add("prod5");

        System.out.println(userName);
        int size = userName.size();
        System.out.println(size);

        userName.clear();
        System.out.println(userName);

        int size2 = userName.size();
        System.out.println(size2);



    }
}
