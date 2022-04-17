class BankAccount {
    protected long accNo;
    protected String accHolder;
    protected double accBal;

    BankAccount(long accNo, String accHolder, double accBal) {
        this.accNo = accNo;
        this.accHolder = accHolder;
        this.accBal = accBal;
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public double getAccBal() {
        return accBal;
    }

    public void setAccBal(double accBal) {
        this.accBal = accBal;
    }

    @Override
    public String toString() {
        return "BankAccount [accBal=" + accBal + ", accHolder=" + accHolder + ", accNo=" + accNo + "]";
    }

}

class SavingsAccount extends BankAccount {
    double rateOfIntrest;

    public SavingsAccount(long accNo, String accHolder, double accBal, double rateOfIntrest) {
        super(accNo, accHolder, accBal);
        this.rateOfIntrest = rateOfIntrest;
    }

    public double getRateOfIntrest() {
        return rateOfIntrest;
    }

    public void setRateOfIntrest(double rateOfIntrest) {
        this.rateOfIntrest = rateOfIntrest;
    }

    public double getComputedIntrest(int years) {
        return (this.accBal * years * rateOfIntrest) / 100;
    }

    public double getYearlyIntrest() {
        return this.getComputedIntrest(1);
    }

    @Override
    public String toString() {
        return "SavingsAccount [rateOfIntrest=" + rateOfIntrest + "]";
    }
}

class CurrentAccount extends BankAccount {
    float avgDailyTrans;

    public CurrentAccount(long accNo, String accHolder, double accBal) {
        super(accNo, accHolder, accBal);
    }

    public CurrentAccount(long accNo, String accHolder, double accBal, float avgDailyTrans) {
        super(accNo, accHolder, accBal);
        this.avgDailyTrans = avgDailyTrans;
    }

    public float getAvgDailyTrans() {
        return avgDailyTrans;
    }

    public void setAvgDailyTrans(float avgDailyTrans) {
        this.avgDailyTrans = avgDailyTrans;
    }

    public double getTotalTransAmount(int days) {
        return (days * this.avgDailyTrans);
    }

    public double getYearlyTransAmount() {
        return getTotalTransAmount(365);
    }

    @Override
    public String toString() {
        return "AccountNO :" + accNo + " %n AccountHolderName :" + accHolder + "%n AccountBalance " + accBal
                + "%n avgDailyTransaction" + avgDailyTrans;
    }

}

public class DynamicPoly {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(1232315, "Prem", 6543);
        SavingsAccount sa = new SavingsAccount(651233, "kumar", 3450, 5);
        CurrentAccount ca = new CurrentAccount(123098, "pk", 2000, 500);
        System.out.println("--------------------------------------");
        System.out.println(ba);
        System.out.println("--------------------------------------");
        System.out.println(sa);
        System.out.println("Yearly Intrest: " + sa.getYearlyIntrest());
        System.out.println("Intrest Calculated: " + sa.getComputedIntrest(3));
        System.out.println("--------------------------------------");
        System.out.println(ca);
        System.out.println("Yearly transactions: " + ca.getYearlyTransAmount());
        System.out.println("Total transactions: " + ca.getTotalTransAmount(3));

    }
}
