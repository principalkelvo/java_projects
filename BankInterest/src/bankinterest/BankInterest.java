/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankinterest;

/**
 *
 * @author KELVO FRAYAY
 */
public class BankInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double amount; char interest;
        System.out.println("Enter amount to deposit:");
        amount=200;
        System.out.println("Enter type of bank account:");
        interest='x';
        double A = amount*1.5/100;
        double B = amount*2/100;
        double C = amount*1.5/100;
        double X = amount*5/100;
        if(amount<=200&&interest=='A'){
            System.out.println("hello");
        }
        switch (interest){
            case 'A':case 'a':System.out.println(A);
            break;
            case 'B':case 'b':System.out.println(B);
            break;
            case 'C':case 'c':System.out.println(C);
            break;
            case 'X':case 'x':System.out.println(X);
            break;
            default: System.out.println("No such account");
        }
        // TODO code application logic here
    }
    
}
