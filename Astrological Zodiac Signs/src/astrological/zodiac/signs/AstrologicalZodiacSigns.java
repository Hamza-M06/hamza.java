/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package astrological.zodiac.signs;

import java.util.Scanner;


/**
 *
 * @author User
 */
public class AstrologicalZodiacSigns {
    
    
    


    static final String SET_TITLE ="\033]0;%s\007 ";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // TODO code application logic here
        System.out.printf(SET_TITLE, "Astrological Zodiac Signs ");
        
        System.out.println("Hello");
        
        
        
        System.out.print("Press enter to exit");
        scanner.nextLine();
        
        
    }

}
