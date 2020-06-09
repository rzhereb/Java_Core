package lesson8;

public class AccountOperation implements Runnable {

    BankAccount bankAccount = new BankAccount(50);

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            makeWithdraw(10);
            if (bankAccount.getBalance() < 0) {
                System.out.println("You don't have enough money!");
            }
        }
    }

    private synchronized void makeWithdraw(int sum) {
        synchronized (bankAccount) {
            if (bankAccount.getBalance() >= sum) {
                System.out.println(Thread.currentThread().getName() + " is withdrawing money");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bankAccount.withdraw(sum);
                System.out.println(Thread.currentThread().getName() + " has withdraw money");
            } else {
                System.out.println("Not enough money: " + bankAccount.getBalance());
            }
        }
    }
}

class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int sum) {
        balance -= sum;
    }
}
