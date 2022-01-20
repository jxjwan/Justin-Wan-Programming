import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private static int numnum;
    private ArrayList<Deposit> deposits = new ArrayList<>();
    private ArrayList<Withdraw> withdraws = new ArrayList<>();
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;
    
    public double getsavebal(){
        return savingBalance;
    }
    
    public double getcheckbal(){
        return checkBalance;
    }
    
    public void printsavebal(){
        System.out.println("Savings: "+Double.toString(savingBalance));
    }
    
    public void printcheckbal(){
        System.out.println("Checkings: "+Double.toString(checkBalance));
    }
    
    Customer(){
        this.name = "dumdum";
        
    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;
    }

    public double deposit(double amt, Date date, String account){
        if(account.equals("Checking")){
            this.checkBalance += amt;
            deposits.add(new Deposit(amt, date, account));
        } else if(account.equals("Saving")){
            this.savingBalance += amt;
            deposits.add(new Deposit(amt, date, account));
        } else {
            
        }
        return 0;
    }
    public double withdraw(double amt, Date date, String account){
        if(account.equals("Checking")){
            
            double balcheck = checkBalance - amt; // creates an amount to check for overdraft
            
            if(balcheck < -100){
                this.withdraws.add(new Withdraw(amt, date, "OVERDRAFTED in "+account+"! WITHDRAWAL FAILED!"));
            } else{
                this.checkBalance -= amt;
                this.withdraws.add(new Withdraw(amt, date, account));
            }
            
        } else if(account.equals("Saving")){
            
            double balcheck = savingBalance - amt; // creates an amount to check for overdraft
            
            if(balcheck < -100){
                this.withdraws.add(new Withdraw(amt, date, "OVERDRAFTED in "+account+"! WITHDRAWAL FAILED!"));
            } else{
            
            this.savingBalance -= amt;
            this.withdraws.add(new Withdraw(amt, date, account));
            
            }
        } else {
            
        }
        return 0;
    }
    /*private boolean checkOverdraft(double amt, String account){
        
        double draft = 
        
        return false;
    }
    
    Overdraft function worked into the withdraw() double itself.
    */
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
