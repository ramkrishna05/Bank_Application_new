package BANKING;

public class lotakBank implements bank_interface{

    private  String accountno;
    private  String  password;
    private double rateOfinterset=7.5;
    private double balance;

    public lotakBank(String accountno, String password,double balance)
    {
        this.accountno=accountno;
        this.password=password;
        this.balance=balance;
    }

    public String  depositMoney(int money) {
        if(money>0)
        {
            balance=balance+money;
            return "money :"+money+"has been added to your account total balance is "+balance;
        }
        else
        {
            return "money enter is negative ";
        }
    }

    @Override
    public String withdrowMoney(int money, String password) {
        if(password.equals(this.password))
        {
            if(balance>=money)
            {
              balance=balance-money;
              return "money :"+money+"has been withdrawn . remaining balance is "+balance;

            }
            else
            {
                return "insufficient Balance ";
            }
        }
        else
        {
             return "wrong password enterd ";
        }
    }

    public String checkBalance(java.lang.String Password) {
        if(password.equals(this.password))
        {
            return "The balance is "+this.balance;
        }
        else
        {
            return "wrong password enterd";
        }

    }

    public double calculateInterest(int time ) {
        double intrest= (balance*time*rateOfinterset)/100;
        return intrest;
    }
}
