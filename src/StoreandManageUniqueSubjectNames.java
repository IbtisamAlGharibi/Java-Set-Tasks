import java.util.HashSet;
import java.util.Set;

public class StoreandManageUniqueSubjectNames {

    public static void main(String[] args){

        Set<String> subjectNames = new HashSet<>();
        subjectNames.add("Math");
        subjectNames.add("Science");
        subjectNames.add("English");
        subjectNames.add("History");
        subjectNames.add("Computer");

        System.out.println(subjectNames);
        subjectNames.add("Sport");
        System.out.println(subjectNames);

        subjectNames.add("Sport");
        System.out.println(subjectNames);

        boolean find = subjectNames.contains("Computer");
        System.out.println(find);

        boolean find2 = subjectNames.contains("History");
        System.out.println(find2);

        subjectNames.remove("History");
        System.out.println(subjectNames);

        System.out.println(subjectNames.size());
        subjectNames.add("Math2");
        System.out.println(subjectNames);

        System.out.println(subjectNames.size());
        subjectNames.clear();

        System.out.println(subjectNames);
        System.out.println(subjectNames.size());
        System.out.println("The set now contains zero elements " + subjectNames);

    }
}
