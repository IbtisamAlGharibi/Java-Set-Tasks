import java.util.HashSet;
import java.util.Set;

public class Task7 {
    public static void main(String[] args){
        Set<String> employeesIds = new HashSet<>();
        employeesIds.add("001");
        employeesIds.add("002");
        employeesIds.add("003");
        employeesIds.add("004");
        employeesIds.add("005");

        System.out.println(employeesIds);
        employeesIds.add("005");
        System.out.println(employeesIds);

        boolean find = employeesIds.contains("001");
        System.out.println(find);

        employeesIds.remove("001");
        System.out.println(employeesIds);

        System.out.println(employeesIds.size());
        employeesIds.clear();

        System.out.println(employeesIds);
        System.out.println(employeesIds.size());

    }
}
