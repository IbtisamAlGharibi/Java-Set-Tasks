import java.util.HashSet;
import java.util.Set;

public class Task19 {

    public static void main(String[] args){

        Set<String> employeeNames = new HashSet<>();
        employeeNames.add("Ibtisam");
        employeeNames.add("Anfal");
        employeeNames.add("Sara");
        employeeNames.add("Muna");
        employeeNames.add("Noor");

        System.out.println(employeeNames);
        employeeNames.add("Noor");
        System.out.println(employeeNames);

        employeeNames.add("Noor");
        System.out.println(employeeNames);

        boolean find = employeeNames.contains("Ibtisam");
        System.out.println(find);

        boolean find2 = employeeNames.contains("Anfal");
        System.out.println(find2);

        employeeNames.remove("Ibtisam");
        System.out.println(employeeNames);

        System.out.println(employeeNames.size());
        employeeNames.add("Rahaf");
        System.out.println(employeeNames);

        System.out.println(employeeNames.size());
        employeeNames.clear();

        System.out.println(employeeNames);
        System.out.println(employeeNames.size());
        System.out.println("The set now contains zero elements " + employeeNames);

    }
}
