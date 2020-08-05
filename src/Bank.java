/**
 * Created by Tomas Smitas on 08/12/2015.
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class Bank {

    public static int bankAccount(int CustomerID, int BalanceStart) {

        Scanner stdin = new Scanner(System.in);
        System.out.println("Welcome to the Bank.");

        //Get the customer
        Customer myCustomer = Customer.getWithCustomerNumber(CustomerID);

        //Get the customer name.
        String name = myCustomer.name;

        //Get the starting balance.
        int balance = BalanceStart;

        //Get the date and time
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        //	Get the user's choice.
        //	1. Make a deposit
        //	2. Make a withdrawal
        //	3. Print your balance
        //	4. Quit
        int choice = 0;

        // Continue processing choices until the user quits.
        while (choice != 4) {
            // Reprompt the menu.
            System.out.println("Here are your menu options:");
            System.out.println("1. Make a deposit.");
            System.out.println("2. Make a withdrawal.");
            System.out.println("3. Print your balance.");
            System.out.println("4. Quit.");
            System.out.println("Please enter the number of your choice.");
            choice = stdin.nextInt();

            switch (choice) {
                case 1: {
                    // Handle a deposit.
                    System.out.println("Enter the amount of your deposit.");
                    int deposit = stdin.nextInt();
                    balance = balance + deposit;
                    System.out.println(dateFormat.format(date) + " Customer " + name + " new balance is $" + balance + ".");
                    break;
                }
                case 2: {
                    // Handle a withdrawal.
                    System.out.println("Enter the amount of your withdrawal.");
                    int withdrawal = stdin.nextInt();
                    if (balance - withdrawal >= 0) {
                        balance = balance - withdrawal;
                        System.out.println(dateFormat.format(date) + " Customer " + name + " new balance is $" + balance + ".");
                    } else {
                        System.out.println(dateFormat.format(date) + " Customer " + name + " Insufficient funds for withdrawal. Balance is $" + balance + ".");
                    }
                    break;
                }
                case 3: {
                    // Print out the current balance.
                    System.out.println(dateFormat.format(date) + " Customer " + name + " balance is $" + balance + ".");
                    break;
                }
                case 4: {
                    //Do nothing, we quit
                    break;
                }
                default: {
                    System.out.println("Sorry that is not a valid choice.");
                }
            }
        }
        System.out.println("Thank you for using the bank!");
        return balance;



    }



    }




class Customer {
    String name;
    
    //Initial ints for differing the users.
    protected int CustomerID;
    protected int BalanceStart;



    //sets up the variable loop all available tests
    static int total=24;
    static Customer[] customerList = new Customer[total];


    // initializes the names of the user.
    private static String Name ;
    

    private static boolean check= false;


    //superclassing it
    public Customer(int id, String name){
        this.name=name;
        this.CustomerID=id;
        this.BalanceStart=0;
        


    }

    public void Balance(int BalanceStart) {
        this.BalanceStart = BalanceStart;
    }

    public static Customer getWithCustomerNumber(int id){
        for (Customer cust : customerList){
            if (cust.CustomerID == id)return cust;
        }
        return null;
    }
    public static void init(){
        Name = "Bob FreedomPants";

        for(int i=0;i<total;i++){
            customerList[i] = new Customer(i, Name);
        }

    }
}






