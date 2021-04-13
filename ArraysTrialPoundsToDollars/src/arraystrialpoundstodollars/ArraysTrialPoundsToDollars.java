/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystrialpoundstodollars;
import java.util.Scanner;
/**
 *
 * @author KELVO FRAYAY
 */
public class ArraysTrialPoundsToDollars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard= new Scanner (System.in);
        System.out.println("How many items do you wish to purchase: ");
        int size=keyboard.nextInt();
        double [] pounds = new double [size];
        double [] dollars= new double[size];
        double exchange;
        System.out.println("Enter Exchange Rate: ");
        exchange= keyboard.nextDouble();
        enterPounds(pounds);
        changeToDollars(pounds,dollars,exchange);
        displayAllContents(pounds,dollars);
        displayTotal(pounds,dollars);
    }
    
    //enter price in pounds
    static void enterPounds(double [] poundsIn){
        Scanner keyboard= new Scanner(System.in);
        System.out.println("enter price in pounds: ");
        for(int i=0;i<poundsIn.length;i++){
            System.out.print("price "+(i+1)+" : ");
            poundsIn[i] = keyboard.nextDouble();
        }
    }
    
    //change pounds to dollars and assign the value to dollars
    static void changeToDollars(double [] poundsIn, double[] dollarsIn,double exchangeIn){
        for(int i=0;i<poundsIn.length;i++){
                dollarsIn[i]=(exchangeIn *poundsIn[i]);
                //System.out.println("Exchange successful "+ dollarsIn[i]);
            }  
    }
    
    //display all contents
    static void displayAllContents(double[]poundsIn, double[] dollarsIn){
        for(int i=0;i<poundsIn.length;i++){
            System.out.println("price "+(i+1)+" in pounds = "+ poundsIn[i]);
        }
        for(int i=0;i<poundsIn.length;i++){
            System.out.println("price "+(i+1)+" in dollars = $"+ dollarsIn[i]);
        }
    }
    
    //total costs
    static void displayTotal(double[]poundsIn, double[]dollarsIn){
        double total= 0;
        double totalIn=0;
        for(double item:poundsIn){
            total =total+item;
        }
        System.out.println("Total = "+total +" pounds");
        for(double item:dollarsIn){
            totalIn =totalIn+item;
        }
        System.out.println("Total = "+totalIn +" dollars");
    }
}

