package BANKING;

public class sbibank implements bank_interface{
    private  String accountno;
    private  String  password;
    private double rateOfinterset=6;
    private double balance;
    private int minimum=500;

    public sbibank (String accountno, String password, Integer balance)
    {
        this.accountno=accountno;
        this.password=password;
        this.balance= balance;

    }

    public java.lang.String depositMoney(int money) {
        if(money>0)
        {
           balance=balance-money;
           return "Money "+money+"is deposite in your account. the total balance is "+balance;

        }
        else
        {
            return "money enter is negative";

        }
    }
    public  String withdrowMoney(int money, String password)
    {
         if(password.equals(this.password))
         {
             if(balance-minimum>=money)
             {
                 balance=balance-money;
                 return "money :"+money+"is withdrowMoney . total money is "+balance;
             }
             else
             {
                 return "money is not suddicient ";
             }
         }
         else
         {
             return "password is not matching ";
         }

    }

    public  String checkBalance(java.lang.String Password) {
        if(password.equals(this.password))
        {
            return "thr total balance is "+balance;
        }
        else
        {
            return "password enterd id incorrect ";
        }

    }

    public double calculateInterest(int time ) {
         double intreset=(balance*time*rateOfinterset)/100;
         return intreset;
    }
}
