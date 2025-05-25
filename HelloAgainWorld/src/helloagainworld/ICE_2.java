/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloagainworld;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ICE_2 {
    
    
     // Constants
    static final String CLEAR_TERMINAL = "\033c";
    static final String SET_TITLE = "\033]0;%s\007";
    
    /**
     * @param args the command line arguments
     */
    
       static final String BANNER = """
                                    
                                    ~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`
                                    Arithmatic calculator Calculator
                                    ~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`
                                    
                                    """;
    
    public static void main(String[] args) {
        
    
        
        
        
        // Set the title
        System.out.printf(SET_TITLE, "Calculator");

        
        // variables
        float number1,number2, result = 0;
        char operator;
    //    boolean;
        boolean divideby0 = false;
        
        
                
        
        
        
        // User input
        Scanner scanner = new Scanner(System.in);
        
        
       // input screen
       
       number1 = scanner.nextInt();
       operator = scanner.next().charAt(0);
       number2 = scanner.nextInt();
       // get ride of any extra input
       scanner.nextLine();
       
       // calculation 
       switch(operator)
       {
           case '+':
               result = number1 + number2;
               break;
           case '-':
               result = number1 - number2;
               break;
            case '*':
               result = number1 * number2;
               break; 
             case '/':
               if(number2 == 0)
               {
                   System.out.println("error - cannot divide by zero!");
                   divideby0 = true;
               }
               result = number1 / number2;
               break;         
             default:
                 System.out.printf(" error - %$ is not valid operator /n",
                         operator);
                 divideby0 = true; // doesnt show calculations
                
                        
                    }
           
        
        // TODO code application logic here
        
        // Exit prompt - So the terminal doesn't close in our faces!
        System.out.print("Press [enter] to exit: ");
        scanner.nextLine();
        scanner.close();
    }
}


   

