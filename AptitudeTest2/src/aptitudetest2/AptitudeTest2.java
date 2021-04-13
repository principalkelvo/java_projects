/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptitudetest2;
import java.io.IOException;
/**
 *
 * @author KELVO FRAYAY
 */
public class AptitudeTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int score;
            System.out.print("Enter aptitude test score: ");
            // getInteger may throw IOException or NumberFomatException
            score = TestException.getInteger();
            if (score >= 50) {
                System.out.println("You have a place on the course!");
            } else {
                System.out.println("Sorry, you failed your test");
            }
        } // if something does goes wrong!
        catch (NumberFormatException e) {
            System.out.println("You entered an invalid number!");
        } 
        catch (IOException e) {
            System.out.println(e); // calls toString method
        }
        // even if no exception thrown/caught, this line will be executed
        System.out.println("Goodbye");
    }

}
