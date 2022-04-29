package eBanking;

public class Acc {

    private final String ACCOUNT_NUMBER;
    private final String accountName;
    private final String PIN;
    private int balance;

    public Acc(String accountNumber, String firstName, String lastName, String pin) {
        ACCOUNT_NUMBER = accountNumber;
        accountName = firstName + " " + lastName;
        PIN = pin;
    }

    public String getAccountNumber() {
        return ACCOUNT_NUMBER;
    }

    public String getAccountName() {
        return accountName;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance(String pin) {
        if (pin.equals(PIN)){
            return balance;
        }
        return 0;
    }

    public void withdrawal(int amount, String pin) {
        if (pin.equals(PIN)) balance -= amount;
    }
}
