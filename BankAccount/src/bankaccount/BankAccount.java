/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;
import java.util.Scanner;
/**
 *
 * @author KELVO FRAYAY
 */
public class BankAccount {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        Scanner keyboardString= new Scanner(System.in);
        char choice;
        String name;
        double balance=0,withdraw=0,deposit=0, interest=0;
        int accountType;
        long accountNumber;
        
        System.out.print("Enter Account Holder Name:");
        name= keyboardString.nextLine();

        System.out.println("Enter account type: "
                + " 1. Savings "
                + " 2. Current");
        accountType= keyboard.nextInt();
        while(accountType<=0 || accountType>2){
        System.out.println("Input Not Allowed. Please enter 1 or 2");
            accountType= keyboard.nextInt();
    }
        
        System.out.println("Input your account Number:");
        accountNumber=keyboard.nextLong();
        
        do{
            System.out.println();
            System.out.println("***MENU INTERFACE***");
            System.out.println();
            System.out.println("A. DEPOSIT");
            System.out.println("B. WITHDRAW");
            System.out.println("C. CHECK BALANCE");
            System.out.println("D. QUIT");
            System.out.println();
            System.out.println("ENTER CHOICE A,B,C or D");
            System.out.println("");
            choice=keyboard.next().charAt(0);
            switch (choice){
                case 'A':case'a':checkBalance(deposit,withdraw,balance,interest);
                    deposit=optionDeposit(accountType,deposit);
                    interest=interest
                (accountType,deposit,interest);
                    optionDeposit(deposit,withdraw,name,accountNumber,balance,accountType,interest);
                    break;
                case 'B':case'b':withdraw=optionWithdraw(balance);
                    optionWithdraw(withdraw,deposit,name,accountNumber,balance);
                    break;
                case 'C':case'c':
                    balance=checkBalance(deposit,withdraw,balance,interest);
                checkBalance(deposit,withdraw,balance,name,accountNumber);
                    break;
                case 'D':case'd':break;
                default:System.out.println("Enter only option A,B,C or D");
                System.out.println();
            }
        }while(choice != 'D');
    }
    static double optionDeposit(int accountTypeIn,double depositIn){
        Scanner keyboard= new Scanner(System.in);
            System.out.println("input amount you wish to deposit: ");
            depositIn=keyboard.nextDouble();
            return depositIn;
    }
        static void optionDeposit
        (double depositIn,double withdrawIn,String nameIn,long accountNumberIn
                ,double balanceIn,int accountTypeIn,double interestIn)
        {
                double balanceOut= depositIn+interestIn;
                System.out.println
                        (nameIn+" confirmed you deposited "+depositIn+
                                " for account "+accountNumberIn+
                                " your balance is "+balanceOut);
            }
        
        static double optionWithdraw(double balanceIn){
        Scanner keyboard= new Scanner(System.in);
            System.out.println("input amount you wish to withdraw: ");
            double withdrawIn=keyboard.nextDouble();
            return withdrawIn;
    }
        static void optionWithdraw
        (double withdrawIn,double depositIn,String nameIn,long accountNumberIn,double balanceIn)
        {
            double balanceOut= (balanceIn-withdrawIn)+depositIn;
            System.out.println
        (nameIn+" confirmed you withdrew "+withdrawIn+
                " for account "+accountNumberIn+
                " your balance is "+balanceOut);
        }
        static double checkBalance
        (double depositIn,double withdrawIn,double balanceIn, double interestIn)
        {
            double balanceOut=(depositIn+balanceIn+interestIn)-withdrawIn;
            return balanceOut;
        }
        static void checkBalance
        (double depositIn,double withdrawIn
                ,double balanceIn,String nameIn,long accountNumberIn)
        {
            
            System.out.println(nameIn+" account No. "+accountNumberIn+
                    " your current balance = "+balanceIn);
        }

        static double interest(int accountTypeIn,double depositIn, double interestIn)
        {
            Scanner keyboard= new Scanner(System.in);
            double interest=0;
            double rate;
            if(accountTypeIn == 1){
                System.out.println("input rate of interest: ");
            rate=keyboard.nextDouble();
                interest=depositIn*(rate/100);
                System.out.println("intreset="+interest);
            }
                return interest;
        }
        // TODO code application logic here
                
}