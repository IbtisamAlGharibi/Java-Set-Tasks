import java.util.HashSet;
import java.util.Set;

public class ManageUniqueStudentNames {

    public static void main(String[] args){

        Set<String> studentNames = new HashSet<>();
        studentNames.add("Ibtisam");
        studentNames.add("Anfal");
        studentNames.add("Sara");
        studentNames.add("Muna");
        studentNames.add("Noor");

        System.out.println(studentNames);
        studentNames.add("Noor");
        System.out.println(studentNames);

        boolean find = studentNames.contains("Ibtisam");
        System.out.println(find);

        studentNames.remove("Ibtisam");
        System.out.println(studentNames);

        System.out.println(studentNames.size());
        studentNames.clear();

        System.out.println(studentNames);
        System.out.println(studentNames.size());
    }
}
