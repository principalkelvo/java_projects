/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccounttester2;

/**
 *
 * @author KELVO FRAYAY
 */
public class BankAccountTester2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a bank account
        BankAccount2 account1= new BankAccount2("999787","kelvin njoro");
        //create another bank account
        BankAccount2 account2= new BankAccount2("127352","Samuel Mburu");
        //make a deposit to the first account
        account1.deposit(2000);
        //make a deposit to the second account
        account2.deposit(1000);
        //set the interest rate
        BankAccount2.setInterestRate(10);
        //add interest to accounts
        account1.addInterest();
        account2.addInterest();
        //display the account details
        System.out.println("account Name: "+account1.getAccountName());
        System.out.println("account Number: "+account1.getAccountNumber());
        System.out.println("Interest Rate: "+BankAccount2.getInterestRate());
        System.out.println("current Balance: "+account1.getBalance());
        System.out.println();//blank line
        System.out.println("account Name: "+account2.getAccountName());
        System.out.println("account Number: "+account2.getAccountNumber());
        System.out.println("interest Rate: "+BankAccount2.getInterestRate());
        System.out.println("current Balance"+account2.getBalance());
        
    }
    
}
