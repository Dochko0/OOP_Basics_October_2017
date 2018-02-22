package DefineBankAccountClass.staticId;

public class BankAccount {

    private static double interestRate = 0.02;
    //private static int id=0.0;
    private static int counter = 1;
    private int id;
    private double balance;

    //constructor

    BankAccount() {
        this.id = counter++;
    }

//    BankAccount(double balance) {
//        this();
//        this.balance = balance;
//    }

    public int getId() {
        return this.id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterestRate(int years) {
        return BankAccount.interestRate * years * this.balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    void deposit(double ammount) {

        this.balance += ammount;
    }


    @Override
    public String toString() {
        return String.format("Account ID%d, balance %.2f", this.id, this.balance);
    }
}
