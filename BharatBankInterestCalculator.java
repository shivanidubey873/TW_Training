package com.tw;
class BharatBank{
    private double balance;
    private final String accountType;
    public BharatBank(double balance,String accountType){
        this.balance=balance;
        this.accountType=accountType;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }
    public void withdraw(double amount){
        //Assuming that both withdrawal happened on 31st march according to problem statement
        // and as interest gets credited quarterly and this is the end of first quarter it will get credited once
        this.balance+=this.getQuarterlyInterest(); // account got credited
        if(this.balance>amount){
            this.balance-=amount;
        }
        else{
            // According to problem statement from a current account
            // we can withdraw amount up to (current balance +20% of current balance)
            if(this.accountType.equalsIgnoreCase("current") && this.balance>0 && amount<=this.balance*1.2){
                this.balance-=amount;
            }
            else{
                System.out.println("Not Sufficient Balance");
            }
        }
    }
    public double getQuarterlyInterest(){
        if (this.accountType.equalsIgnoreCase("current")){
            return 0;
        }
        else{
            return this.balance*0.03*0.25;
        }
    }

    public double getBalance() {
        return balance;
    }
}
public class BharatBankInterestCalculator {
    public static void main(String[] args) {
        BharatBank gopalAccount= new BharatBank(50000,"current");
        BharatBank amritaAccount = new BharatBank(100000,"savings");
        gopalAccount.deposit(10000);
        amritaAccount.withdraw(45000);
        System.out.println(gopalAccount.getQuarterlyInterest());
        System.out.println(amritaAccount.getQuarterlyInterest());
        gopalAccount.withdraw(70000);
        System.out.println(gopalAccount.getBalance()); //Balance after withdrawal of 70k
        System.out.println(amritaAccount.getBalance()); //Balance after lat withdrawal of 45k
    }
}
