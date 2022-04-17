import java.util.*;
import java.util.stream.Collectors;
class BookMarket{
    int id;
    String name;
    String author;
    String publisher;
    int quantity;
    public BookMarket(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "BookMarket [author=" + author + ", id=" + id + ", name=" + name + ", publisher=" + publisher
                + ", quantity=" + quantity + "]";
    }
    @Override
    public int compareTo(BookMarket b) {
        return this.id-b.id;
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
        BookMarket other = (BookMarket) obj;
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

public class StreamBook {
    public static void main(String[] args) {
        BookMarket b1 = new BookMarket(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
BookMarket b2 = new BookMarket(233, "Operating System", "Galvin", "Wiley", 6);
BookMarket b3 = new BookMarket(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
BookMarket b4 = new BookMarket(121, "Let us C", "Yashwant Kanetkar", "Mc Graw Hill", 11);
    List<BookMarket> al=new ArrayList<>();
    al.add(b1);
    al.add(b2);
    al.add(b3);
    al.add(b4);
    al.stream().forEach(System.out::println);
Set<BookMarket> bookSet = al.stream().collect(Collectors.toSet());
        bookSet.stream().forEach(System.out::println);

        List<BookMarket> newList =al.stream().sorted()
        .map(n->{n.setQuantity(2*n.getQuantity());return n;})
        .filter(n-> n.getQuantity()>10).toList();
        newList.forEach(System.out::println);

        int booksSold = al.stream().filter(n-> n.id<200).map(e->e.quantity).reduce(0,(ans,i)->ans+i);
        System.out.println(booksSold);
}
    
}
