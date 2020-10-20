/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;

/**
 *
 * @author carl
 */
public class Account {
    
    int id;
    double balance;
    
    public Account (int id, double balance) {
        this.id = id;
        this.balance = balance;
        
    }
    
    private void deposit(double amount){
        if (amount >= 0){
            this.balance += amount;
        }
        else{
            System.out.println("Amount of money is zero of less");
        }
    }
    
    private void withdraw(double amount){
        if (amount >= 0 && balance - amount >0){
            this.balance -= amount;
        }
        else if(balance - amount <= 0){
            System.out.println("You dont have enough money in the account.");
        }else{
            System.out.println("Amount of money is zero of less");
        }
    }
    
}
