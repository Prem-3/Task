
class Account {
    double balance;
    String accHolder;

    public Account(double balance, String accHolder) {
        this.balance = balance;
        this.accHolder = accHolder;
    }

    public void debit(int amount) {
        if (amount > balance) {
            System.out.println("Insuffiecient balance");
        } else
            balance -= amount;
        System.out.println("Amount debited is: " + balance);

    }

    public void credit(int amount) {
        balance += amount;
        System.out.println("Amount credited is: " + balance);
    }

}

public class Bank {
    public static void main(String args[]) {
        Account a1 = new Account(5000, "prem");
        Account a2 = new Account(2500, "pk");
        a1.debit(10000);
        a2.debit(1500);
        a1.credit(15000);
        a2.credit(10000);
    }

}
