package lesson8;

public class Main {



    public static void main(String[] args) throws InterruptedException {
//        Runnable runnable = () -> {
//            for (int i = 0; i < 5; i++) {
//                try {
//                    System.out.println(Thread.currentThread().getName() + ": " + i);
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//        Thread thread = new Thread(runnable);
//        thread.start();

//        Thread t1 = new Thread(runnable);
//        Thread t2 = new Thread(runnable);
//        Thread t3 = new Thread(runnable);
//        t1.start();
//        t1.join();
//        t2.start();
//        t3.start();


//        AccountOperation accountRunning = new AccountOperation();
//        Thread husband = new Thread(accountRunning, "Husband");
//        Thread wife = new Thread(accountRunning, "Wife");
//        husband.start();
//        wife.start();

        VolatileExample volatileExample = new VolatileExample();

        int noOfThreads = 10;
        Thread[] threads = new Thread[noOfThreads];
        for(int i = 0; i < noOfThreads; ++i) {
            threads[i] = new VolatileThread(volatileExample);
            threads[i].start();
            threads[i].join(); // join для того, щоб потоки відбувались послідовно. Без volatile це не гарантує, що число буде змінюватись адекватно.
        }
                //wait for all threads

    }
}


