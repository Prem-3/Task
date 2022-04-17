public class UpiApp implements cloneable {
    String appName;
    String country;
    int dayLimit;
    double maxDayLimit;
}

    public UpiApp(String appName, String country, int dayLimit, double maxDayLimit) {
        this.appName = appName;
        this.country = country;
        this.dayLimit = dayLimit;
        this.maxDayLimit = maxDayLimit;
    }

    @Override
    public String toString() {
        return "UpiApp [appName=" + appName + ", country=" + country + ", dayLimit=" + dayLimit + ", maxDayLimit="
                + maxDayLimit + "]";
    }

}

class UPI {
    public static void main(String args[]) throws Exception {
        UpiApp BHIM = new UpiApp("Utube", "India", 10, 100000);
        System.out.println(BHIM);
        UpiApp PhonePay = (UpiApp) BHIM.clone();
        System.out.println(PhonePay);
        UpiApp Gpay = (UpiApp) BHIM.clone();
        System.out.println(Gpay);
    }
}