/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystrialquizes;
import java.util.Scanner;
/**
 *
 * @author KELVO FRAYAY
 */
public class ArraysTrialQuizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char [][] grades= new char [4][2];
        enterGrade(grades);
        displayGrade(grades);
    }
    
    static void enterGrade(char[][]gradesIn){
        Scanner keyboard= new Scanner(System.in);
        for (int i=0;i<gradesIn.length;i++) {
            for(int j=0;j<gradesIn[0].length;j++){
                System.out.println("enter group "+(i+1)+" student "+(j+1));
                gradesIn[i][j]= keyboard.next().charAt(0);
            }
        }
            
    }
    static void displayGrade(char[][]gradesIn){
        System.out.println();
        System.out.println("***GRADES***");
        for (int i=0;i<gradesIn.length;i++) {
            for(int j=0;j<gradesIn[0].length;j++){
               System.out.println("group "+(i+1)+" student "+(j+1)+":"
                       +"grade= "+gradesIn[i][j]);
            }
        }
    }
}
