import java.util.HashSet;
import java.util.Set;

public class ManageUniqueMovieNames {
    public static void main(String[] args){
        Set<String> movieNames = new HashSet<>();
        movieNames.add("Harry Potter");
        movieNames.add("The old man");
        movieNames.add("Animal Farm");
        movieNames.add("The Secret Garden");
        movieNames.add("Matilda");

        System.out.println(movieNames);
        movieNames.add("The Giver");
        System.out.println(movieNames);

        boolean find = movieNames.contains("Matilda");
        System.out.println(find);

        movieNames.remove("Matilda");
        System.out.println(movieNames);

        System.out.println(movieNames.size());
        movieNames.clear();

        System.out.println(movieNames);
        System.out.println(movieNames.size());


    }

}
