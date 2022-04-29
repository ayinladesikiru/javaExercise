package eBanking;

public class Bank {
    private final String name;
    private Acc[] accounts;
    private int numberOfCustomers;

    public Bank(String bankName, int numberOfCustomers) {
        name = bankName;
        accounts = new Acc[numberOfCustomers];
    }

    public String getName() {
        return name;
    }

    public int getMaximumOfCustomers() {
        return accounts.length;
    }

    public void register(String firstName, String lastName, String pin) {

    }

    public int getNumberOfCustomers() {
        return 0;
    }
}
