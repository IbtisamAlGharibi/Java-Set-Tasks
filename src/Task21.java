import java.util.HashSet;
import java.util.Set;

public class Task21 {
    public static void main(String[] args){

        Set<String> carNames = new HashSet<>();
        carNames.add(" Toyota");
        carNames.add("Honda");
        carNames.add("BMW");
        carNames.add("Audi");
        carNames.add("Nissan");

        System.out.println(carNames);
        carNames.add("Porsche");
        System.out.println(carNames);

        carNames.add("Porsche");
        System.out.println(carNames);

        boolean find = carNames.contains("Toyota");
        System.out.println(find);

        boolean find2 = carNames.contains("Audi");
        System.out.println(find2);

        carNames.remove("Audi");
        System.out.println(carNames);

        System.out.println(carNames.size());
        carNames.add("Chevrolet");
        System.out.println(carNames);

        System.out.println(carNames.size());
        carNames.clear();

        System.out.println(carNames);
        System.out.println(carNames.size());
        System.out.println("The set now contains zero elements " + carNames);

    }
}
