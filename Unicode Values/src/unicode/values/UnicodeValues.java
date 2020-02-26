/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicode.values;

/**
 *
 * @author Jorda
 */
public class UnicodeValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // enter what you need converted
         String str = "";
            for(int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) +" - " + 
            (int)str.charAt(i));
            }

    }
    
}
