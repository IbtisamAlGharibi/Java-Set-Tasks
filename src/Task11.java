import java.util.HashSet;
import java.util.Set;

public class Task11 {
    public static void main(String[] args){
        Set<String> bookTitle = new HashSet<>();
        bookTitle.add("Harry Potter");
        bookTitle.add("The old man");
        bookTitle.add("Animal Farm");
        bookTitle.add("The Secret Garden");
        bookTitle.add("Matilda");

        System.out.println(bookTitle);
        bookTitle.add("The Giver");
        System.out.println(bookTitle);

        boolean find = bookTitle.contains("Matilda");
        System.out.println(find);

        bookTitle.remove("Matilda");
        System.out.println(bookTitle);

        System.out.println(bookTitle.size());
        bookTitle.clear();

        System.out.println(bookTitle);
        System.out.println(bookTitle.size());


    }
}
