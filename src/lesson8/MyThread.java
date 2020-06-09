package lesson8;

public class MyThread implements Runnable {

    private int number;

    public MyThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < number; i++) {
            System.out.println(number--);
        }
    }
}
