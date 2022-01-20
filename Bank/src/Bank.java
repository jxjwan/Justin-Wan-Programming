/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author justi
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date = new Date();
        
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        
        System.out.println(date);
        
        Customer poo = new Customer("poo", 1, 1, 1);
        poo.withdraw(10.2,new Date(),Customer.SAVING);
        poo.printsavebal();
        poo.displayWithdraws();
        poo.withdraw(101.2,new Date(),Customer.SAVING);
        poo.printsavebal();
        poo.displayWithdraws();
        poo.deposit(10000000, new Date(), Customer.SAVING);
        poo.printsavebal();
        poo.displayWithdraws();
        poo.withdraw(101.2,new Date(),Customer.SAVING);
        poo.printsavebal();
        poo.displayWithdraws();
        poo.deposit(1000, new Date(), Customer.CHECKING);
        poo.displayDeposits();
    }
    
}
