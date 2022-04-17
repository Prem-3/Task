class Address {
    Location location;
    String state;
    String country;

    public Address(Location location, String state, String country) {
        this.location = location;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address [country=" + country + ", location=" + location + ", state=" + state + "]";
    }
}

class Location {
    String city;
    String street;

    public Location(String city, String street) {
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Location [city=" + city + ", street=" + street + "]";
    }
}

class UPIPaymentApps implements Cloneable {
    String appName;
    int dailyLimit;
    double maxDailyLimit;
    Address headofficeLocation;

    public UPIPaymentApps(String appName, int dailyLimit, double maxDailyLimit, Address headofficeLocation) {
        this.appName = appName;
        this.dailyLimit = dailyLimit;
        this.maxDailyLimit = maxDailyLimit;
        this.headofficeLocation = headofficeLocation;
    }

    @Override
    public String toString() {
        return "UPIPaymentApps [appName=" + appName + ", dailyLimit=" + dailyLimit + ", headofficeLocation="
                + headofficeLocation + ", maxDailyLimit=" + maxDailyLimit + "]";
    }

    protected Object clone() throws CloneNotSupportedException {
        Location clone = new Location(headofficeLocation.location.street, headofficeLocation.location.city);
        Address newObj = new Address(clone, headofficeLocation.state, headofficeLocation.country);
        return new UPIPaymentApps(this.appName, this.dailyLimit, this.maxDailyLimit, newObj);
    }
}

public class DeepCopy {
    public static void main(String[] args) {

        try {
            Location location = new Location("Hyderabad", "IDK");
            Address address = new Address(location, "Telangana", "India");
            UPIPaymentApps Bhim = new UPIPaymentApps("BHIM", 10, 10000, address);
            System.out.println("BHIM info" + " " + Bhim);
            System.out.println("----------------");
            UPIPaymentApps Paytm = (UPIPaymentApps) Bhim.clone();
            Paytm.headofficeLocation.country = "Canada";
            Paytm.headofficeLocation.state = "idk";
            System.out.println("Paytm");
            System.out.println(Paytm.headofficeLocation.country);
            System.out.println(Paytm.headofficeLocation.state);
        } catch (CloneNotSupportedException c) {
        }
    }
}
