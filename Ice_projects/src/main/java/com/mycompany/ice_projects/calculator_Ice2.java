/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.ice_projects;

import java.util.Scanner;

/**
 *
 * @author mwars
 */
public class calculator_Ice2 {
      //  System.out.printf(SET_TITLE, "calculator");

    /**
     * @param args the command line arguments
     */
    static final String CLEAR_TERMINAL = "\033c";
static final String SET_TITLE ="\033]0;hello\007";
static final String BANNER = """
                             ~~~~~~~~~~
                             Calculator
                             ~~~~~~~~~~~
                             """;
    
    
    
 public static void main(String[] args) {
     
     
     
        // Set the title

        // User input
        Scanner scanner = new Scanner(System.in);
        
        // TODO code application logic here
        
        // Exit prompt - So the terminal doesn't close in our faces!
        System.out.print("Press [enter] to exit: ");
        scanner.nextLine();
        scanner.close();
    }
}
