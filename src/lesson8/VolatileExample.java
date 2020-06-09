package lesson8;

public class VolatileExample {
    private volatile int counter = 0;

    public int getCounter()
    {
        return counter;
    }
    public void increaseCounter()
    {
        ++counter;
    }
}
