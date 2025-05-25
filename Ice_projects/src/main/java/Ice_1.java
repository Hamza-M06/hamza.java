
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mwars
 */
public class Ice_1 {
    
    final String SET_TITLE ="\033]0;$\007";
            
            static final String CLEAR_TERMINAL = "\033c"; 
    
                     static final String BANNER = """
                                         
                                        ====================
                                        Student Registration
                                        ====================
                                    
                                                 """;     
            
            
            

    /**
     * @param args the command line arguments
     */           
            
            
    
    
    public static void main(String[] args) {
        
        

        Scanner scanner = new Scanner(System.in);
            
            
//            
//        System.out.printf(SET_TITLE, "Student regestration - Hamza M");
//        
  
           
        
        
        
        
        System.out.print("enter your full name: ");
        // next line helps get ride of any remaining input 
        String name = scanner.nextLine();
        
        System.out.print("enter your course name: ");
        String courseName = scanner.nextLine();
        
        
         System.out.print("enter your course Duration in semsters: ");
         int Duration = Integer.parseInt(scanner.nextLine());
       
        System.out.print("enter your current semster: ");
         int currentSemster = Integer.parseInt(scanner.nextLine());
        
        
        
        
        // output
        System.out.println(CLEAR_TERMINAL);
        
        System.out.println("Name:" + name);
        
        System.out.println("course name: " + Duration + "semesters" );
        
        System.out.printf("current semster: %s /n", currentSemster);
        System.out.printf("youve got %s semsters to go! \n");
        
        
        
        
        
        
        // Scanner - gets the user input 
        
        
        
        //System.out.println("hello world");
        
        //exit prompt
        System.out.print("Press enter to exit");
        scanner.nextLine();
        
     //exit prompt   
     
        
    }
    
}
    
   
