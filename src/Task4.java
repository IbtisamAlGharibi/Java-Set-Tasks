import java.util.HashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args){
        Set<String> productName = new HashSet<>();
        productName.add("prod1");
        productName.add("prod2");
        productName.add("prod3");
        productName.add("prod4");
        productName.add("prod5");

        System.out.println(productName);

        productName.remove("prod1");
        System.out.println(productName);

    }
}
