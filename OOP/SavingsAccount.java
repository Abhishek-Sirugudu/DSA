package OOP;

public class SavingsAccount extends BankAccount{
    double interestrate;
    SavingsAccount(String owner, double balance,double interestrate){
        super(owner,balance);
        this.interestrate = interestrate;
    }
    void withdraw(int amount){
        if(balance - amount < 0){
            System.out.println("You don't have enough amount in ur account"+balance);
        }else{
            balance -= amount;
            System.out.println("Updated Balance :"+balance);
        }
    }

}
