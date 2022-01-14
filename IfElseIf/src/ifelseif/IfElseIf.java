/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifelseif;

import java.util.Scanner;

/**
 *
 * @author justi
 */
public class IfElseIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Assignment 1
         * Q1:  else if and else are covering the cases when the previous "if" fails
         * in its condition, and they do not activate when the previous "if" succeeds.
         * 
         * Q2: Turning an "else if" into an "if" removes the "else"'s ability to suppress
         * itself when the previous "if" fails in its condition. Thus, following an "if"
         * with another "if" can have both "if"s occur when both conditions are true.
         * (tl;dr: if - else if only allows at most one of the conditionals to run; if - if
         * can have both conditionals run)
         */
        
        System.out.println("Which assignment do you want to view?");
        Scanner assignment = new Scanner(System.in);
        String ssa = assignment.nextLine();
        
        if("1".equals(ssa)){
            System.out.println("Assignment 1");
            System.out.println("Q1:  else if and else are covering the cases when the previous 'if' fails");
            System.out.println("in its condition, and they do not activate when the previous 'if' succeeds.");
            System.out.println("Q2: Turning an 'else if' into an 'if' removes the 'else's ability to suppress");
            System.out.println("itself when the previous 'if' fails in its condition. Thus, following an 'if'");
            System.out.println("with another 'if' can have both 'if's occur when both conditions are true.");
            System.out.println("(tl;dr: if - else if only allows at most one of the conditionals to run; if - if");
            System.out.println("can have both conditionals run)");
        } else if("2".equals(ssa)){
        // Assignment 2        
        System.out.println("What is your name?");
            Scanner scanner1 = new Scanner(System.in);
            String name = scanner1.nextLine();
            System.out.println("Hello, " + name + "! What is your age?");
            Scanner scanner2 = new Scanner(System.in);
            String age_s = scanner2.nextLine();
            
            try {
            int age = Integer.parseInt(age_s);
        } catch (NumberFormatException e) {
            System.out.println("That isn't a valid age, you fool!");
            System.exit(0);
        }
            
            int age = Integer.parseInt(age_s);
            
            System.out.println(age);
            String message;
            if(age < 16){
                message = "You can't drive";
            } else if(age < 18){
                message = "You can drive but not vote";
            } else if(age < 24){
                message = "You can vote but not rent a car";
            } else {
                message = "You can do pretty much anything";
            }
            
            System.out.println(message+", "+name+"!");
            
        }
            //Assignment 3
         else if("3".equals(ssa)){
        
        System.out.println("How much do you weigh on Earth? (in newtons, please)");
            Scanner scannerW = new Scanner(System.in);
            String EarthFg = scannerW.nextLine();
            
            
            try {
            double fat = Double.parseDouble(EarthFg);
        } catch (NumberFormatException e) {
            System.out.println("That isn't a number, so it can't be your weight in newtons, you fool!");
            System.exit(0);
        }
            double fat = Double.parseDouble(EarthFg);
            
            System.out.println("I know about the following planets:");
            System.out.println("1. Venus");
            System.out.println("2. Mars");
            System.out.println("3. Jupiter");
            System.out.println("4. Saturn");
            System.out.println("5. Ur anus");
            System.out.println("6. Neptune");
            
            System.out.println("Which planet are you visiting?");
                        
            double mult = 0;
            String planetname = "Earth";
            
            Scanner scannerp = new Scanner(System.in);
            String scannerP = scannerp.nextLine();
            
            if("1".equals(scannerP) || "Venus".equals(scannerP) || "venus".equals(scannerP)){
                mult = 0.78;
                planetname = "Venus.";
            } else if("2".equals(scannerP) || "Mars".equals(scannerP) || "mars".equals(scannerP)){
                mult = 0.39;
                planetname = "Mars.";
            } else if("3".equals(scannerP) || "Jupiter".equals(scannerP) || "jupiter".equals(scannerP)){
                mult = 2.65;
                planetname = "Jupiter.";
            } else if("4".equals(scannerP) || "Saturn".equals(scannerP) || "saturn".equals(scannerP)){
                mult = 1.17;
                planetname = "Saturn.";
            } else if("5".equals(scannerP) || "Uranus".equals(scannerP) || "uranus".equals(scannerP) || "ur anus".equals(scannerP) || "haha ur butt lol".equals(scannerP)){
                mult = 1.05;
                planetname = "ur anus lol";
            } else if("6".equals(scannerP) || "Neptune".equals(scannerP) || "neptune".equals(scannerP)){
                mult = 1.23;
                planetname = "Neptune.";
            } else if("Earth".equals(scannerP) || "earth".equals(scannerP)){
                System.out.println("Your weight is "+EarthFg+"N, what did you expect?");
                mult = 1;
            } else if("Mercury".equals(scannerP) || "mercury".equals(scannerP)){
                System.out.println("We don't know about Mercury yet... Sorry");
            } else {
                System.out.println("Either you were a fool to pick something that is not an option");
                System.out.println("or you mistyped something.");
           }
            
            if(mult == 0 || mult == 1){
                System.exit(0);
            }
            
            System.out.println("You would weigh "+mult*fat+"N on "+planetname);
            
         }
        
         else if ("4".equals(ssa)) {
                
                int score = 0;
                
                System.out.println("Here's a quiz about Starter Pokemon!");
                System.out.println("");
                System.out.println("1) Which Pokemon region is the only region whose starters form a");
                System.out.println("Type Advantage Triangle with their secondary types?");
                System.out.println("    A. Sinnoh");
                System.out.println("    B. Kalos");
                System.out.println("    C. Alola");
                
                Scanner Q1 = new Scanner(System.in);
                String q1a = Q1.nextLine();
                
                if ("B".equals(q1a) || "b".equals(q1a)) {
                    score++;
                } else {
                    
                }
                
                System.out.println("Correct answer is B.");
                
                System.out.println("2) Which Pokemon region does NOT have a Legendary trio which shares");
                System.out.println("all types with the status conditions of the move Tri-Attack?");
                System.out.println("    A. Kanto");
                System.out.println("    B. Johto");
                System.out.println("    C. Unova");
                
                Scanner Q2 = new Scanner(System.in);
                String q2a = Q2.nextLine();
                
                if ("B".equals(q1a) || "b".equals(q1a)) {
                    score++;
                } else {
                    
                }
                
                System.out.println("Correct answer is B.");
                
                System.out.println("3) Which Pokemon region had its fire-type starter banned to Ubers?");
                System.out.println("    A. Kanto");
                System.out.println("    B. Hoenn");
                System.out.println("    C. Alola");
                
                Scanner Q3 = new Scanner(System.in);
                String q3a = Q3.nextLine();
                
                if ("B".equals(q1a) || "b".equals(q1a)) {
                    score++;
                } else {
                    
                }
                
                 System.out.println("Correct answer is B.");
                
                System.out.println("You scored "+score+"/3.");
         } else {
             
         }
        
        
    }
    
}
