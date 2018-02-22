package DefineBankAccountClass.staticId;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {
    private static Map<Integer, BankAccount> bankAccounts = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String[] line = bf.readLine().split(" ");
            if ("end".equalsIgnoreCase(line[0])) {
                break;
            }

            switch (line[0]) {
                case "Create":
                    createBankAccount();
                    break;
                case "Deposit":
                    depositSum(Integer.valueOf(line[1]), Double.valueOf(line[2]));
                    break;
                case "SetInterest":
                   setInterest(Double.valueOf(line[1]));
                    break;
                case "GetInterest":
                    getInterest(Integer.valueOf(line[1]), Integer.valueOf(line[2]));
                    break;
            }
        }
    }

    private static void getInterest(Integer id, Integer years) {
        if(bankAccounts.containsKey(id)){
            bankAccounts.get(id).getInterestRate(years);
            System.out.printf("%.2f%n", bankAccounts.get(id).getInterestRate(years));

        }else{
            System.out.println("Account does not exist");
        }
    }


    private static void depositSum(Integer id, Double amount) {
        if (bankAccounts.containsKey(id)) {
            bankAccounts.get(id).deposit(amount);
            System.out.printf("Deposited %.0f to ID%d%n", amount, id);
        }else{
            System.out.println("Account does not exist");
        }
    }

    //CREATE NA BANKACCOUNT
    private static void createBankAccount() {
            BankAccount ba = new BankAccount();
            bankAccounts.put(ba.getId(),ba);
        System.out.println("Account ID"+ ba.getId() +" created");
        }


    private static void setInterest(Double interest) {
        BankAccount.setInterestRate(interest);
    }
}
