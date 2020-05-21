package lesson2;

public class Car {

    private String brand;
    private CarType carType;
    private Engine engine;

    public Car() {

    }

    public Car(String brand, CarType carType, Engine engine) {
        this.brand = brand;
        this.carType = carType;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", carType=" + carType +
                ", engine=" + engine +
                '}';
    }

    public void startCar() {
        engine.startEngine();
        System.out.println("Car started");
    }
}
