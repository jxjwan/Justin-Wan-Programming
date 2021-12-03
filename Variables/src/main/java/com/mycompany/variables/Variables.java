/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variables;

/**
 *
 */
public class Variables {
      public static void main( String[] args ) 
    { 
        int cars, drivers, passengers, cars_not_driven, cars_driven; 
        double space_in_a_car, carpool_capacity, average_passengers_per_car; 
 

cars = 100; 
        space_in_a_car = 4.0; 
        drivers = 30; 
        passengers = 90; 
        cars_not_driven = cars - drivers; 
        cars_driven = drivers; 
        carpool_capacity = cars_driven * space_in_a_car; 
        average_passengers_per_car = passengers / cars_driven; 
 

System.out.println( "There are " + cars + " cars available." ); 
        System.out.println( "There are only " + drivers + " drivers available." ); 
        System.out.println( "There will be " + cars_not_driven + " empty cars today." ); 
        System.out.println( "We can transport " + carpool_capacity + " people today." ); 
        System.out.println( "We have " + passengers + " to carpool today." ); 
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." ); 
    
    
    System.out.println( "Problem 2" );
    int room = 113;
    double yooler = 2.71828;
    String subject = "Computer Science";
    System.out.println( "This is room # " + room );
    System.out.println( "e is close to " + yooler);
    System.out.println( "I am learning a bit about " + subject);
    
   System.out.println( "Problem 3" );
   
   String leftaligner = "                         "; // 25 spaces
   String Class1 = "Engineering 12";
   String Teach1 = "Mr. Lachelt";
   String Class2 = "Computer Info Systems 12";
   String Teach2 = "Mr. Zaremba";
   String Class3 = "Group Theory";
   String Teach3 = "Prof. Vatsal";
   
   
   
   System.out.println( "+--------------------------------------------------+");
   System.out.println( "| 1 | " + (Class1 + leftaligner).substring(0,26) + " | " + (Teach1 + leftaligner).substring(0,15) + " |");
   System.out.println( "| 2 | " + (Class2 + leftaligner).substring(0,26) + " | " + (Teach2 + leftaligner).substring(0,15) + " |");
   System.out.println( "| 3 | " + (Class3 + leftaligner).substring(0,26) + " | " + (Teach3 + leftaligner).substring(0,15) + " |");
   System.out.println( "+--------------------------------------------------+");
    }  
}
