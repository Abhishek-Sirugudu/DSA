package OOP;

public class Main_day01 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Abhishek", 5000);
        acc.deposit(1000);
        acc.display();

        SavingsAccount sav = new SavingsAccount("Abhishek", 3000, 3.5);
        sav.withdraw(500);   // should work
        sav.withdraw(9000);  // should print error
        sav.display();
    }
}
