import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author KELVO FRAYAY
 */
public class BankInterest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double amount; 
        char interest;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Enter amount to Deposit: ");
        amount=keyboard.nextDouble();
        System.out.println("Enter type of bank: ");
        interest=keyboard.next().charAt(0);
        double A= amount*1.5/100;
        double B= amount*2/100;
        double C= amount*1.5/100;
        double X= amount*5/100;
        
        switch(interest){
            case 'A':case'a':if(amount>=250){
            System.out.println("Annual interest = " +A);
        }
            else{
                System.out.println("amount is below minimum!!");
            }
            break;
            case 'B':case'b':if(amount>=1000){
            System.out.println("Annual interest = "+ B);
        }
            else{
                System.out.println("amount is below minimum!!");
            }
                break;
            case 'C':case'c':if(amount>=250){
            System.out.println("Annual interest = "+ C);
        }
            else{
                System.out.println("amount is below minimum!!");
            }
                break;
            case 'X':case'x':if(amount>=5000){
            System.out.println("Annual interest = "+ X);
        }
            else{
                System.out.println("amount is below minimum!!");
            }
                break;
            default:System.out.println("NO SUCH ACCOUNT!!!");
        }
        // TODO code application logic here
    }
    
}
