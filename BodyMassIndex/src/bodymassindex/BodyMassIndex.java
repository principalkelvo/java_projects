/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodymassindex;

/**
 *
 * @author KELVO FRAYAY
 */
public class BodyMassIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double weight,height,bmi;
        System.out.print("Enter your weight:");
        weight= 64;
        System.out.println("Enter your height:");
        height= 4;
        bmi= weight/(height*height);
        System.out.println("BMI = "+ bmi+"kgs/m");
        // TODO code application logic here
    }
    
}
