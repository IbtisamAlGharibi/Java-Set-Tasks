import java.util.HashSet;
import java.util.Set;

public class StoreandManageUniqueCourseNames {
    public static void main(String[] args){
        Set<String> courseNames = new HashSet<>();
        courseNames.add("Java");
        courseNames.add("Python");
        courseNames.add("Database");
        courseNames.add("Networking");
        courseNames.add("Web Design ");

        System.out.println(courseNames);
        courseNames.add("Security");
        System.out.println(courseNames);
        courseNames.add("Security");
        System.out.println(courseNames);

        boolean find = courseNames.contains("Database");
        System.out.println(find);

        courseNames.remove("Database");
        System.out.println(courseNames);

        System.out.println(courseNames.size());

        courseNames.add("C++");
        System.out.println(courseNames.size());

        courseNames.clear();
        System.out.println("The set now contains zero elements " + courseNames);



    }
}
