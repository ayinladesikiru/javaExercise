package chapterThree;

public class Akant {

    private String name;
    private double balance;

    public Akant(double balance, String name){
        if (balance > 0.0) this.balance = balance;
        this.name = name;
    }

    public void deposit(double amountDeposited) {
        if (amountDeposited > 0.0) balance += amountDeposited;
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
        } else System.out.println("Withdrawal amount exceeded account balance.");
    }
    public void SetName(){
        this.name = name;
    }

    public String getName(){
        return name;

    }

    public double getBalance() {
        return balance;
    }
}
