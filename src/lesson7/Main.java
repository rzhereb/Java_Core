package lesson7;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Person person = new Person("Taras", -5);
        System.out.println(person);
//        Class<? extends Person> aClass = person.getClass();
//        Class<Person> personClass = Person.class;

//        Field[] fields = personClass.getFields();
//        Field[] declaredFields = personClass.getDeclaredFields();

//        System.out.println("Method fields():");
//        for (Field field : fields) {
//            System.out.println(field.getName());
//        }
//        System.out.println("Method declaredFields():");
//        for (Field declaredField : declaredFields) {
//            declaredField.setAccessible(true);
//            System.out.println(declaredField.getName() + " " + declaredField.get(person));
//            if (declaredField.getType().equals(String.class)) {
//                declaredField.set(person, "Another name");
//            }
//            System.out.println(declaredField.getName() + " " + declaredField.get(person));
//
//        }
//        System.out.println(person);


//        person.methodToTestArray(new String[] {"first", "second"});
//        person.methodToTestVarArgs("first", "second");

//        Method[] declaredMethods = personClass.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            if (declaredMethod.getName().equals("toString")) {
//                System.out.println(declaredMethod.invoke(person));
//            }
//        }


    }
}
