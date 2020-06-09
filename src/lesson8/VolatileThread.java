package lesson8;

public class VolatileThread extends Thread {

    private final VolatileExample volatileExample;


    public VolatileThread(VolatileExample volatileExample) {
        this.volatileExample = volatileExample;
    }

    @Override
    public void run() {
        int oldValue = volatileExample.getCounter();
        System.out.println(Thread.currentThread().getName() + ": Old value = " + oldValue);
        volatileExample.increaseCounter();
        int newValue = volatileExample.getCounter();
        System.out.println(Thread.currentThread().getName() + ": New value = " + newValue);
    }
}
