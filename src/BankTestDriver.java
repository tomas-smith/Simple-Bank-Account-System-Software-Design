import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Tomas Smitas on 08/12/2015.
 */
public class BankTestDriver {

    public static void main(String[] args) {
        //Init has 
        Customer.init();
        boolean[] Try = new boolean[31];
        for(int i=0; i<Try.length;i++)
            try {
                String myString="Try" + (i + 1);
                Method method = BankTestDriver.class.getMethod(myString);
                Try[i] = (boolean) method.invoke(new BankTestDriver());
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }




       

        System.out.println("POFOD is : "); //output your POFOD
        

    }


    public static boolean Try1(){

        int scenario=1;
        Customer customer = Customer.getWithCustomerNumber(0);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);


        return BankTestOracle.bankAccount(Final,scenario);
    }

    public static boolean Try2(){
        int scenario=2;
        Customer customer = Customer.getWithCustomerNumber(1);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(1,Customer.getWithCustomerNumber(1).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    }

    public static boolean Try3(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(2);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    }

    public static boolean Try4(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(3);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    }

    public static boolean Try5(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(4);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);

    }

    public static boolean Try6(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(5);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    }

    public static boolean Try7(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(6);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    }


    public static boolean Try8(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(7);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    }

    public static boolean Try9(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(8);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    }

    public static boolean Try10(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(9);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    }

    public static boolean Try11(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(10);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    }



    public static boolean Try12(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(11);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    }
    public static boolean Try13(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(12);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    } public static boolean Try14(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(13);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    } public static boolean Try15(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(14);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    } public static boolean Try16(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(15);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);

    } public static boolean Try17(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(16);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    } public static boolean Try18(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(17);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    } public static boolean Try19(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(18);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    } public static boolean Try20(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(19);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    } public static boolean Try21(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(20);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    } public static boolean Try22(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(21);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    } public static boolean Try23(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(22);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    } public static boolean Try24(){
        int scenario=3;
        Customer customer = Customer.getWithCustomerNumber(23);
        customer.Balance(100);
        
        int Final = Bank.bankAccount(0,Customer.getWithCustomerNumber(0).BalanceStart);

        return BankTestOracle.bankAccount(Final,scenario);
    }
}







