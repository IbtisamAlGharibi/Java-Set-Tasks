import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args){
        Set<String> customerIds = new HashSet<>();
        customerIds.add("001");
        customerIds.add("002");
        customerIds.add("003");
        customerIds.add("004");
        customerIds.add("005");

        System.out.println(customerIds);

        customerIds.add("005");
        System.out.println(customerIds);

    }
}
