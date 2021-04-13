/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousclassdemo;

/**
 *
 * @author KELVO FRAYAY
 */
public class AnonymousClassDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a test oblong
        Oblong testOblong= new Oblong(8,8);
        
        /*declare an object of an anonymous class that checks that an oblongs
        length and height are greater than zero*/
        Cheakable cheakableObject1 = new Cheakable(){
            @Override
            public boolean check(){
                return testOblong.getLength()>0&&testOblong.getHeight()>0;
            }
        };
        
        /*declare an object of an anonymous class that checks that an oblongs
        length and height are not equal*/
        Cheakable cheakableObject2= new Cheakable(){
            @Override
            public boolean check(){
                return testOblong.getLength()!=testOblong.getHeight();
            }
        };
        
        //this checks that the sides are greater than zero
        System.out.println("cheakableobject1 is "+checkValidity(cheakableObject1));
        
        //this checks that the length and height are not equal
        System.out.println("cheakableobject2 is "+checkValidity(cheakableObject2));
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
