import java.util.HashSet;
import java.util.Set;

public class ManageUniqueCourseNames {
    public static void main(String[] args){
        Set<String> courseNames = new HashSet<>();
        courseNames.add("IT");
        courseNames.add("HR");
        courseNames.add("DM");
        courseNames.add("SW");
        courseNames.add("NW");

        System.out.println(courseNames);
        courseNames.add("HSC");
        System.out.println(courseNames);

        boolean find = courseNames.contains("IT");
        System.out.println(find);

        courseNames.remove("HSC");
        System.out.println(courseNames);

        System.out.println(courseNames.size());
        courseNames.clear();

        System.out.println(courseNames);
        System.out.println(courseNames.size());


    }
}
