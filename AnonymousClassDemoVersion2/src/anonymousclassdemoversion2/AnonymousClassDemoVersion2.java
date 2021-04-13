/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousclassdemoversion2;

/**
 *
 * @author KELVO FRAYAY
 */
public class AnonymousClassDemoVersion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a test oblong
        Oblong testOblong= new Oblong(8,8);
        
        //this checks that the sides are greater than zero
        System.out.println("Oblong is "+checkValidity(new Cheakable(){
             @Override
            public boolean check(){
                return testOblong.getLength()>0&&testOblong.getHeight()>0;
            }
        }));
        
        //this checks that the sides are not equal
        System.out.println("Oblong is "+checkValidity(new Cheakable(){
             @Override
            public boolean check(){
                return testOblong.getLength()!=testOblong.getHeight();
            }
        }));
    }
    private static String checkValidity(Cheakable objectIn){
        if(objectIn.check()){
            return "valid";
        }
        else{
            return "invalid";
        }
    }
}
