import java.util.HashSet;
import java.util.Set;

public class Task5 {
    public static void main(String[] args0){

        Set<String> deptName = new HashSet<>();
        deptName.add("dept1");
        deptName.add("dept2");
        deptName.add("dept3");
        deptName.add("dept4");
        deptName.add("dept5");

        System.out.println(deptName);
        int size = deptName.size();
        System.out.println(size);

        deptName.add("dept6");
        System.out.println(deptName);
        int size2 = deptName.size();
        System.out.println(size2);

    }
}
