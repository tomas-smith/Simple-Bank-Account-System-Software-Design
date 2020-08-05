/**
 * Created by Tomas Smitas on 09/12/2015.
 */
public class BankTestOracle {
    public static boolean bankAccount( int Final, int scenario) {

        switch (scenario){
            case 1:
                if (Final == 102)return true;
                else return false;

            case 2:
                if(Final==104)return true;
                else return false;

            case 3:
                if(Final==102)return true;
                else return false;
            case 4:
                if(Final==100)return true;
                else return false;
            case 5:
                if(Final==104)return true;
                else return false;
            case 6:
               if  (Final==102)return true;
                else return false;
            case 7:
               if  (Final==98)return true;
                else return false;
            case 8:
               if  (Final==96)return true;
                else return false;
            case 9:
               if  (Final==100)return true;
                else return false;
            case 10:
               if  (Final==98)return true;
                else return false;
            case 11:
               if  (Final==98)return true;
                else return false;
            case 12:
               if  (Final==100)return true;
                else return false;
            case 13:
               if  (Final==98)return true;
                else return false;
            case 14:
               if  (Final==102)return true;
                else return false;
            case 15:
               if  (Final==100)return true;
                else return false;
            case 16:
               if  (Final==100)return true;
                else return false;
            case 17:
               if  (Final==100)return true;
                else return false;
            case 18:
               if  (Final==102)return true;
                else return false;
            case 19:
               if  (Final==98)return true;
                else return false;
            case 20:
               if  (Final==100)return true;
                else return false;
            case 21:
                if (Final==100)return true;
                else return false;

            case 22:
                if(-Final==102)return true;
                else return false;

            case 23:
               if  (Final==96)return true;
                else return false;
            case 24:
               if  (Final==100)return true;
                else return false;

            default: return false;

        }
    }
}
