package OOP;

public class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(int amount){
        balance += amount;
    }
    void withdraw(int amount){
        balance -= amount;
    }

    void display(){
        System.out.println("Current balance "+balance);
    }
}
