package chapterThree;

public class Akant {

//    private String name;
    private double balance;

    public Akant(double balance){
        if (balance > 0.0) this.balance = balance;
    }

    public void deposit(double amountDeposited) {
        if (amountDeposited > 0.0) balance = balance + amountDeposited;
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
        } else System.out.println("Withdrawal amount exceeded account balance.");
    }
//    public void SetName(){
//        this.name = name;
//    }
//
//    public String getName(){
//        return name;

//    }

    public double getBalance() {
        return balance;
    }
}
