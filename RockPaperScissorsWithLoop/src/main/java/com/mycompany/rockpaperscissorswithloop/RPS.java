package com.mycompany.rockpaperscissorswithloop;

import java.util.Scanner;

public class RPS {
        public static void main(String args[]) {

            System.out.println("Welcome to Grass, Fire, Water!");
            System.out.println("Fire-type beats Grass-type!");
            System.out.println("Water beats Fire!");
            System.out.println("And Grass beats Water!");
            System.out.println("Pick a starter Pokemon using its number!");
            System.out.println("0: Chikorita (Grass)");
            System.out.println("1: Cyndaquil (Fire)");
            System.out.println("2: Totodile (Water)");
            // Starting text
            
            int gameon = 1; // determines if the game is in session
            
            
            while(gameon == 1) {
                int playerchoice;
                System.out.println("Which starter do you pick?");
                Scanner scanner = new Scanner(System.in);
                String starter = scanner.nextLine();
                System.out.println(starter);
                // the above gets the user to pick their starter
                String playername;

                if(starter.equals("0")){
                    playerchoice = 0;
                    playername = "Chikorita";
                }
                else if(starter.equals("1")){
                    playerchoice = 1;
                    playername = "Cyndaquil";
                }
                else if(starter.equals("2")){
                    playerchoice = 2;
                    playername = "Totodile";
                }
                else if(starter.equals("a valid choice")){
                    playerchoice = 10;
                    playername = "the smart option";
                    System.out.println("That is \"a valid choice\", but screw you...");
                    //this is the option for doing technically the truth.
                }
                else {
                    playerchoice = 4;
                    playername = "the oops option";
                    System.out.println("That isn't a valid choice! You lose!");
                    //this is where you done goofed
                }
                    System.out.println("You picked "+ playername +"!");
                if(playerchoice < 3){

                    double oppGen = 3 * Math.random();
                    int opp = (int) oppGen; //this sets up a random integer of 0, 1, 2

                    if(opp == 0){
                        System.out.println("The opponent picked Grookey, a Grass type!");
                    }
                    else if(opp == 1){
                        System.out.println("The opponent picked Scorbunny, a Fire type!");
                    }
                    else {
                        System.out.println("The opponent picked Sobble, a Water type!");
                    }

                    int score = (playerchoice - opp + 6) % 3; 
                    
                    /**this calculates how far off your starter is compared to the 
                    opponent's, allowing calculating type effectiveness
                    * 
                    * */
                   
                    if(score == 0) {
                        System.out.println("Your Pokemon are of the same type! It is a tie!");
                    }
                    else {
                        System.out.println("Your Pokemon attacked!");

                        if(score == 1){
                            System.out.println("It's super effective!");
                            System.out.println("You win!");
                        }
                        else {
                            System.out.println("It's not very effective...");
                            System.out.println("Better luck next time!");
                        }
                    }
                }
                
                System.out.println("Try again?");
                Scanner gamecontinue = new Scanner(System.in);
                String gameonprime = gamecontinue.nextLine();
                // this sets up a rematch
                if(gameonprime.equals("Yes") || gameonprime.equals("yes") || gameonprime.equals("1") || gameonprime.equals("Y") || gameonprime.equals("y")){
                    gameon = 1;
                }
                
                else if(gameonprime.equals("No") || gameonprime.equals("no") || gameonprime.equals("0") || gameonprime.equals("N") || gameonprime.equals("n")){
                    gameon = 0;
                    System.out.println("Thank you for playing this game!");
                }
                
                else{
                    gameon = 0;
                    System.out.println("Not a valid option, shutting down game...");
                }
            }
        }
}
