package BANKING;

public interface bank_interface {
    public String depositMoney(int money);
    public  String withdrowMoney(int money, String password);
    public   String checkBalance(String Password);
    public double calculateInterest(int time);


}
