// public class BookDriver {

// }
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Book1 {
    int id;
    String name;
    String author;
    String publisher;
    int quantity;

    public Book1(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book1 [author=" + author + ", id=" + id + ", name=" + name + ", publisher=" + publisher + ", quantity="
                + quantity + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
        result = prime * result + quantity;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book1 other = (Book1) obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (publisher == null) {
            if (other.publisher != null)
                return false;
        } else if (!publisher.equals(other.publisher))
            return false;
        if (quantity != other.quantity)
            return false;
        return true;
    }
}

public class BookDriver {
    public static void main(String[] args) {
        Book1 b1 = new Book1(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book1 b2 = new Book1(233, "Operating System", "Galvin", "Wiley", 6);
        Book1 b3 = new Book1(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book1 b4 = new Book1(121, "Let us C", "Yashwant Kanetkar", "Mc Graw Hill", 11);
        List<Book1> library = new ArrayList<>();
        library.add(b1);
        library.add(b2);
        library.add(b3);
        library.add(b4);
        Set<Book1> set = new HashSet<>();
        for (int i = 0; i < library.size() - 1; i++) {
            Book1 a = library.get(i);
            for (int j = i + 1; j < library.size(); j++) {
                if (a.equals(library.get(j))) {
                    set.add(a);
                }

            }
        }
        System.out.println("No. of duplicates found: " + set.size());
        set.forEach(System.out::println);

        Book1 maxBook = null;

        library.removeAll(set);
        int max = Integer.MIN_VALUE;
        for (Book1 b : library) {

            if (b.quantity > max) {
                max = b.quantity;
                maxBook = b;

            }

        }
        System.out.println("Book with Max quantity \n" + maxBook);

    }

}
