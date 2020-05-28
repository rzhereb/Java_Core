package lesson5;

import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class Person {

    @NonNull
    private String name;
    @NonNull
    private int age;
    @NonNull
    private List<Book> books;

}
