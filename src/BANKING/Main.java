package BANKING;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

           System.out.println("which bank you want to open an account ");
           System.out.println("print 1 to  create in lotack bank and 2 to create  in sbi" );
           Scanner sc=new Scanner (System.in);
           int option=sc.nextInt();
           bank_interface bankaccount;
        System.out.println("enter password and initial deposite ");
        String password=sc.next();
        Integer initialbalance=sc.nextInt();
        double accountno=Math.abs(Math.random()*Math.pow(10,9));
        String stringversion=String.valueOf(accountno);


           if(option ==1)
           {
               bankaccount=new lotakBank(stringversion,password,initialbalance);
           }
           else
           {
               bankaccount=new sbibank(stringversion,password,initialbalance);
           }
         String debit=  bankaccount.withdrowMoney(70000,password);
           System.out.println(debit);

           String credit =bankaccount.depositMoney(70000);
           System.out.println(credit);

           bankaccount.checkBalance(password);
    }
}