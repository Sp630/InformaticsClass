import java.util.Scanner;

public class Class09_10_24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the account holder: ");
        String name = scanner.nextLine();
        System.out.println("Enter the number of the account: ");
        int number = scanner.nextInt();
        System.out.println("What is your current balance: ");
        double balance = scanner.nextDouble();

        Bank bank = new Bank(name, number, balance);
        System.out.println("How much do you want to deposit: ");
        double deposit = scanner.nextDouble();
        bank.Deposit(deposit);

        System.out.println("How much do you want to withdraw: ");
        double withdraw = scanner.nextDouble();
        bank.Withdraw(withdraw);


    }
}

class Bank{
    String accountHolder;
    int accountNumber;
    double balance;

    public Bank(String accountHolder,int accountNumber,double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void Withdraw(double amount){
        balance = balance - amount;
        System.out.println("Your balance is: " + balance + "$");
    }
    void Deposit(double amount){
        balance = balance + amount;
        System.out.println("Your balance is: " + balance + "$");
    }
}
