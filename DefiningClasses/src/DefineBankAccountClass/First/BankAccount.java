package DefineBankAccountClass.First;

public class BankAccount {
    private static double interestRate = 0.0;
    private int id;
    private double balance;

    //constructor


    BankAccount(int id) {
        this.id = id;
        this.balance = 0.0;
    }

//    public int getId() {
//        return this.id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

//    public static void setInterestRate(double interestRate) {
//        BankAccount.interestRate = interestRate;
//    }
//
//    public double getInterestRate(int years) {
//        return BankAccount.interestRate * years * this.balance;
//    }

    public double getBalance() {
        return this.balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    void deposit(double ammount) {

        this.balance += ammount;
    }

    void withdraw(double ammount) {
        if (this.balance - ammount < 0) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= ammount;
        }
    }

    @Override
    public String toString() {
        return String.format("Account ID%d, balance %.2f", this.id, this.balance);
    }
}
