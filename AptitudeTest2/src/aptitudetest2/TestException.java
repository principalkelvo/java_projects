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
public class TestException {
    
        // adding this throws clause will allow this method to compile
        public static int getInteger() throws IOException{
        byte [] buffer = new byte[512];
        System.in.read(buffer);
        String s = new String (buffer);
        s = s.trim();
        int num = Integer.parseInt(s);
        return num; // send back the integer value
    }
}
