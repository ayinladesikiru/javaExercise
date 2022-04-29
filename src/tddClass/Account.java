package tddClass;

public class Account {

    private int balance;

    public void deposit(int amount) {
        if (amount < 0) {
            amount = 0;
        }
        balance = amount + balance;
    }

    public void getWithdrawBalance(int amount) {
        balance = balance - amount;
    }

    public int getBalance() {
        return balance;
    }

    public void minimumWithdraw(int amount) {
        if (amount > balance)
            balance = balance + 0;
    }
}
