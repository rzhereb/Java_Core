package lesson5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;
import java.util.function.Predicate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {

    @NonNull
    private String tittle;
    @NonNull
    private int pagesCount ;
    @NonNull
    private String country;

//    static class TestPagesCountMoreThan500 implements Predicate<Book> {
//
//        @Override
//        public boolean test(Book book) {
//            return book.getPagesCount() > 500;
//        }
//    }

    public static void showBigBooks(List<Book> bookList) {
//        Predicate<Book> bookPredicate = new Predicate<Book>() {
//
//            @Override
//            public boolean test(Book book) {
//                return book.getPagesCount() > 500;
//            }
//        };

        Predicate<Book> bookPredicate = book -> book.getPagesCount() > 500;

        for (Book book : bookList) {
            if (bookPredicate.test(book)) {
                System.out.println(book);
            }
        }
    }

}
