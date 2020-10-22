/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracital1_part3;

/**
 *
 * @author Yates
 */
public class Account {

    int id;
    String firstName;
    double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    private void deposit(double amount) {
        if (amount >= 0) {
            this.balance += amount;
        }
        else System.out.println("Amount <= 0 :L");
    }

    private void withdraw(double amount) {
        if (amount >= 0 && balance - amount > 0) {
            this.balance -= amount;
        }
        else if(balance - amount <= 0){
            System.out.println("You don't have enough money...");
        }
        else System.out.println("Amount <= 0 :L");
    }
}
