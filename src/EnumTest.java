import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("All Books");
        for(Book book : Book.values())
        System.out.printf("%-5s%-30s%s%n", book, book.getBookName(),book.getCopyrightYear());
        System.out.println();
        System.out.println("The Book Range is as follows :");
        for(Book book: EnumSet.range(Book.SE,Book.WA))
        System.out.printf("%-5s%-30s%s%n", book,book.getBookName(),book.getCopyrightYear());
    }
    }

