package lesson4;

public class Engine {

    private double volume;
    private int horsePower;

    public Engine(double volume, int horsePower) {
        this.volume = volume;
        this.horsePower = horsePower;
    }

    public double getVolume() {
        return volume;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "volume=" + volume +
                ", horsePower=" + horsePower;
    }

    public void startEngine() {

        System.out.println("Start engine");
    }
}
