package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
	// write your code here

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        System.out.println("На вашем счете: " + bankAccount.getAmount() + " сом");

        while (true){

            try {
                System.out.println(bankAccount.withdraw(6000));
                System.out.println("Остаток на банковском счете = " + bankAccount.getAmount());

            } catch (LimitException e) {
                //e.printStackTrace();
                System.out.println("На вашем счете: " + bankAccount.getAmount() + " сом. Был снят остаток "
                        + bankAccount.getAmount() + ". ");
                bankAccount.withdraw(bankAccount.getAmount());
                System.out.println("Остаток на банковском счете = " + bankAccount.getAmount());

                break;
            }

        }

    }
}
