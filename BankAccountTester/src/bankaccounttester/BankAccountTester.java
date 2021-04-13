/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccounttester;
import java.util.ArrayList;
/**
 *
 * @author KELVO FRAYAY
 */
public class BankAccountTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create an array of references
        ArrayList<BankAccount>accountList= new ArrayList<>();
        //create three new accounts, referenced by each element in the array
        accountList.add(new BankAccount("7939838929","Kelvin Njoro"));
        accountList.add(new BankAccount("7939838784","Samuel Maina"));
        accountList.add(new BankAccount("7939836758","David Mburu"));
        accountList.add(new BankAccount("7939839071","Magdalene Wairimu"));
        //make various deposits and withdrawals
        accountList.get(0).deposit(1000);
        accountList.get(1).deposit(7000);
        accountList.get(2).deposit(1500);
        accountList.get(3).deposit(3700);
        accountList.get(3).withdraw(700);
        //print details for all four accounts
        for(BankAccount item:accountList){
        System.out.println("Account number: "+item.getAccountNumber());
        System.out.println("Account name: "+item.getAccountName());
        System.out.println("Current balance: "+item.getBalance());
        System.out.println();
        }
    }
    
}
