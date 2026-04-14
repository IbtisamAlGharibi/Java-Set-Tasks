import java.util.HashSet;
import java.util.Set;

public class Task15 {

    public static void main(String[] args){
        Set<String> products = new HashSet<>();
        products.add("prod1");
        products.add("prod2");
        products.add("prod3");
        products.add("prod4");
        products.add("prod5");

        System.out.println(products);

        products.add("Prod6");
        System.out.println(products);
        boolean find = products.contains("Prod6");
        System.out.println(find);

        products.remove("Prod6");
        System.out.println(products);

        System.out.println(products.size());
        products.clear();

        System.out.println(products);
        System.out.println(products.size());


    }
}
