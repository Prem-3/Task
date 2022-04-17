interface RBI {
    static double rateOfInterest = 4;

    void showBalance();

    double withdraw(double amount);

    double deposit(double amount);

    double calculateYearlyInterest();

}

class SBIAccount implements RBI {
    protected String accHolder;
    protected int accBalance;
    protected long accNumber;
    static int openingBonus = 1000;

    SBIAccount(String accHolder, int accBalance, long accNumber) {
        this.accHolder = accHolder;
        this.accBalance = accBalance;
        this.accNumber = accNumber;
    }

    @Override
    public double calculateYearlyInterest() {
        return ((this.accBalance * rateOfInterest) / 100);
    }

    @Override
    public double deposit(double amount) {
        this.accBalance += amount;
        return this.accBalance;
    }

    @Override
    public double withdraw(double amount) {
        if (this.accBalance < amount) {
            System.out.println("Insuffiecient balance");
            return this.accBalance;
        }
        this.accBalance -= amount;
        return accBalance;
    }

    @Override
    public void showBalance() {
        System.out.println(this.accBalance);
    }

    void display() {
        System.out.println("1000 will be credited as Openng bonus");
    }

    @Override
    public String toString() {
        return "SBIAccount [accBalance=" + accBalance + ", accHolder=" + accHolder + ", accNumber=" + accNumber + "]";
    }
}

class ICIC implements RBI {
    protected String accHolder;
    protected int accBal;
    protected long accNo;
    static int additionalInterest = 2;

    public ICIC(String accHolder, int accBal, long accNo) {
        this.accHolder = accHolder;
        this.accBal = accBal;
        this.accNo = accNo;
    }

    @Override
    public double calculateYearlyInterest() {
        return ((this.accBal * rateOfInterest) / 100);
    }

    @Override
    public double deposit(double amount) {
        this.accBal += amount;
        return this.accBal;
    }

    @Override
    public double withdraw(double amount) {
        if (this.accBal < amount) {
            System.out.println("Insuffiecient balance");
            return this.accBal;
        }
        this.accBal -= amount;
        return accBal;
    }

    @Override
    public void showBalance() {
        System.out.println(this.accBal);
    }

    void display() {
        System.out.println("providing 2% extra interest");
    }

    @Override
    public String toString() {
        return "ICIC [accBal=" + accBal + ", accHolder=" + accHolder + ", accNo=" + accNo + "]";
    }

}

public class Interface2RbiCode {
    public static void main(String args[]) {
        RBI obj = new SBIAccount("Pk", 2500, 12321);
        System.out.println(obj.toString());
        System.out.println(obj.withdraw(2500));
        System.out.println(obj.deposit(1500));
        System.out.println(obj.calculateYearlyInterest());
        obj.showBalance();
        System.out.println("----------------------");
        RBI ic = new ICIC("Prem", 1000, 876201);
        System.out.println(ic.toString());
        System.out.println(ic.withdraw(250));
        System.out.println(ic.deposit(500));
        System.out.println(ic.calculateYearlyInterest());
        ic.showBalance();
        System.out.println("----------------------");
    }
}
