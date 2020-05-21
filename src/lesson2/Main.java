package lesson2;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(1.4, 150);
        Car bmw = new Car("BMW", CarType.SEDAN, new Engine(1.8, 200));
        Car mers = new Car("Mersedes", CarType.MINIVAN, new Engine(2.1, 2500));
//        System.out.println(engine);
//        System.out.println(bmw);
//        System.out.println(mers);
//
//
//        bmw.setEngine(mers.getEngine());
//        System.out.println();
//        System.out.println(engine);
//        System.out.println(bmw);
//        System.out.println(mers);
//
//        mers.getEngine().setHorsePower(mers.getEngine().getHorsePower() * 2);
//        System.out.println();
//        System.out.println(engine);
//        System.out.println(bmw);
//        System.out.println(mers);

//        bmw.startCar();

//        User u = new User("String id");
        User u1 = new User(5);

//        System.out.println(u);
        System.out.println(u1);

    }
}
