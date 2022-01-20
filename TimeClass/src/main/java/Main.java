/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author justi
 */
public class Main {
    public static void main(String args[]) {
       
       Timering Time = new Timering(-1,-1,-1); 
        
       System.out.println(Time);
       
       Time.nextSecond();
       
       System.out.println(Time);
       
       Time.previousSecond();
       
       System.out.println(Time);
    }
}
