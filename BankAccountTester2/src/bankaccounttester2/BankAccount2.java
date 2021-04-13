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
public class BankAccount2 {
    //attributes
    private String accountNumber;
    private String accountName;
    private double balance;
    private static double interestRate;
    
    //THE METHODS

    //the constructor
    public BankAccount2(String numberIn, String nameIn){
        accountNumber= numberIn;
        accountName= nameIn;
        balance= 0;
    }
    
    //methods to read
    public String getAccountName(){
        return accountName;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    
    //methods to deposit and withdraw
    public void deposit(double amountIn){
        balance= balance+amountIn;
    }
    public boolean withdraw(double amountIn){
        if (amountIn>balance){
            return false;//no withdraw was made
        }
        else{
            balance= balance-amountIn;
            return true; //money was withdrawn successfully
        }
    }
    //interest rate
    public static void setInterestRate(double rateIn){
        interestRate= rateIn;
    }
    public static double getInterestRate(){
        return interestRate;
    }
    public void addInterest(){
    balance = balance+(balance*interestRate)/100;
}
}