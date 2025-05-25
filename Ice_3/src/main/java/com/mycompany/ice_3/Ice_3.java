/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ice_3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ice_3 {

    //static final String CLEAR_TERMINAL = "\033c";
    static final String SET_TITLE = "\033]0;%s\007";

    public static void main(String[] args) {
        System.out.printf(SET_TITLE, "Calculator");

        // input screen
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("enter 'r' to restart");

        } while (scanner.nextLine().equalsIgnoreCase("R"));

        System.out.print("Press [enter] to exit: ");
        scanner.nextLine();
        scanner.close();

    }
}
