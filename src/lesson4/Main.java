package lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
//        Set<String> stringSet = new HashSet<>();
//        stringSet.add("first");
//        stringSet.add("second");
//        stringSet.add("third");
//        stringSet.add("fourth");
//
//        for (String s : stringSet) {
//            System.out.println(s);
//        }

//        Set<Person> personSet = new LinkedHashSet<>();
//        personSet.add(new Person("Taras", 27));
//        personSet.add(new Person("Olha", 23));
//        personSet.add(new Person("Julia", 53));
//
//        for (Person person : personSet) {
//            System.out.println(person);
//        }

//        Set<String> stringSet = new TreeSet<>();
//        stringSet.add("first");
//        stringSet.add("second");
//        stringSet.add("third");
//        stringSet.add("fourth");
//
//        for (String s : stringSet) {
//            System.out.println(s);
//        }


//        Set<Person> personSet = new TreeSet<>();
//        personSet.add(new Person("Taras", 27));
//        personSet.add(new Person("Olha", 23));
//        personSet.add(new Person("Julia", 53));
//        personSet.add(new Person("Taras", 25));
//        personSet.add(new Person("Taras", 25));
//
//        for (Person person : personSet) {
//            System.out.println(person);
//        }

//        Map<String, Person> map = new HashMap<>();
//        map.put("first", new Person("Taras", 27));
//        map.put("second", new Person("Petro", 31));
//        map.put("third", new Person("Olha", 21));
//        map.putIfAbsent("second", new Person("Olha", 21));
//
//        for (Map.Entry<String, Person> entry : map.entrySet()) {
//            System.out.println(entry);
//        }

        Person ivan = new Person("Ivan", 25);
        Person vlodko = new Person("Vlodko", 23);

        Map<Person, List<Engine>> map = new HashMap<>();
        map.put(ivan, new ArrayList<>());
        map.put(vlodko, new ArrayList<>());

        map.get(ivan).add(new Engine(2.5, 160));
        map.get(ivan).add(new Engine(2.1, 533));

        map.get(vlodko).add(new Engine(6.5, 125));
        map.get(vlodko).add(new Engine(.5, 325));

        for (Map.Entry<Person, List<Engine>> personListEntry : map.entrySet()) {
            System.out.println(personListEntry.getKey() + ":");
            for (Engine engine : personListEntry.getValue()) {
                System.out.println("\t" + engine);
            }
        }

    }
}
