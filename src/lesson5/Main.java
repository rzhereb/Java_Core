package lesson5;

import lombok.NonNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String... args) {

        Book book1 = new Book("LOTR The Return of the King", 360, "England");
        Book book2 = new Book("11/22/63", 750, "USA");
        Book book3 = new Book("Dark Tower", 1532, "USA");
        Book book4 = new Book("Kobzar", 547, "Ukraine");
//
        Person person1 = new Person("Taras", 25, Arrays.asList(book1, book2));
        Person person2 = new Person("Ivan", 21, Arrays.asList(book1, book3, book4));
        List<Person> personList = Arrays.asList(person1, person2);

//        List<Book> books = Arrays.asList(book1, book2, book3, book4);

//        long usaCount = books.stream().filter(book -> book.getPagesCount() > 500)
//                .filter(book -> book.getCountry().equals("USA"))
//                .count();
//        System.out.println(usaCount);

//        List<Book> usaList = books.stream().filter(book -> book.getPagesCount() > 500)
//                .filter(book -> book.getCountry().equals("USA"))
//                .collect(Collectors.toList());
//        usaList.forEach(System.out::println);

//        Function<Book, String> bookStringFunction = book -> book.getTittle();
//        Function<Book, String> bookStringFunction = new Function<Book, String>() {
//
//            @Override
//            public String apply(Book book) {
//                return book.getTittle();
//            }
//        };

//        List<String> tittlesList = books.stream().map(Book::getTittle).collect(Collectors.toList());
//        for (String s : tittlesList) {
//            System.out.println(s);
//        }
//
//        List<@NonNull String> countriesList = books.stream().
//                map(Book::getCountry).
//                distinct().
//                collect(Collectors.toList());
//        System.out.println(countriesList);

//        Optional<Book> first = books.stream().filter(book -> "France".equals(book.getCountry())).findFirst();

//        List<@NonNull String> bookTittles = personList
//                .stream().map(Person::getBooks)
//                .flatMap(Collection::stream)
//                .map(Book::getTittle)
//                .collect(Collectors.toList());
//        for (String bookTittle : bookTittles) {
//            System.out.println(bookTittle);
//        }

//        long count = personList
//                .stream().map(Person::getBooks)
//                .flatMap(Collection::stream)
//                .count();
//        System.out.println(count);


        Map<Person, List<Book>> map = personList.stream().collect(Collectors.toMap(
                Function.identity(),
                Person::getBooks
        ));

        System.out.println(map);
    }
}
