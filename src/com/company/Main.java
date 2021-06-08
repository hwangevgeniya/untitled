package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        System.out.println("На вашем счете: " + bankAccount.getAmount() + " сом");

        while (true){

            try {
                System.out.println(bankAccount.withdraw(6000));

            } catch (LimitException e) {
                //e.printStackTrace();
                System.out.println("На вашем счете: " + e.GetRemainingAmount() + " сом. Был снят остаток "
                        + e.GetRemainingAmount() + ". " +
                        "Оставшаяся сумма = " + (e.GetRemainingAmount() - e.GetRemainingAmount()));
                break;
            }

        }

    }
}
