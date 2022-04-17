public import java.util.*;

class Book {
    int id;
    String name;
    String author;
    String publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Book [author=" + author + ", id=" + id + ", name=" + name + ", publisher=" + publisher + ", quantity="
                + quantity + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Book other = (Book) obj;
        if (author == null) {
            if (other.author != null) return false;
        } else if (!author.equals(other.author)) return false;
        if (id != other.id) return false;
        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;
        return true;
    }

}


public class Hash {
    public static void main(String[] args) {
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b4 = new Book(121, "Let us C", "Yashwant Kanetkar", "Mc Graw Hill", 11);
        List<Book> library = Arrays.asList(b1,b2,b3,b4);
        library.forEach(System.out::println);
        Set<Book> set = new HashSet<>();
        Book b5 = null;
        int maxQuant = 0;
        for(int i=0;i<library.size();i++){
            for(int j=i+1;j<library.size();j++){
                if(library.get(i).equals(library.get(j))){
                    set.add(library.get(i));
                }
            }
        }
        for(Book b : library){
            if(!set.contains(b)){
                if(b.quantity > maxQuant){
                    maxQuant = b.quantity;
                    b5 = b;
                }
            }
        }
        System.out.println("No. of duplicate books = "+set.size());
        set.forEach(System.out::println);
        System.out.println(b5);

    }
}