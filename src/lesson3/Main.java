package lesson3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("first");
//        list.add("second");
//        list.add("first");
//        list.add("third");
//        list.add(null);
//
//        list.add(1, "another");
//        list.set(1, "anotherBySet");
//        list.add("first");
//        System.out.println(list);
//
//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
//            if ("first".equals(s)) {
//                System.out.println(i + " " + s) ;
//            }
//        }
//        for (String s : list) {
//            if ("first".equals(s)) {
//                System.out.println(list.indexOf(s));
//            }
//        }
//        System.out.println(list.lastIndexOf("first"));

        List<Person> list = new ArrayList<>();
        list.add(new Person("Taras", 22));
        list.add(new Person("Petro", 28));
        list.add(new Person("Bogdan", 25));
        list.add(new Person("Ira", 21));
        list.add(new Person("Julia", 30));

//        for (Person person : list) {
//            if (person.getName().startsWith("T")) {
//                list.add(person);
//            }
//        }

        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getName().startsWith("T")) {
                iterator.remove();
            }
        }
        iterator = list.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getName().startsWith("I")) {
                iterator.remove();
            }
        }

        for (Person person : list) {
            System.out.println(person);
        }




    }
}
