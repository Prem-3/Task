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

// class Location {
// String street;
// String city;

// public Location(String street, String city) {
// this.street = street;
// this.city = city;
// }

// @Override
// public String toString() {
// return "Location [city=" + city + ", street=" + street + "]";
// }
// }

// class Address {
// Location location;
// String state;
// String country;

// @Override
// public String toString() {
// return "Address [country=" + country + ", location=" + location + ", state="
// + state + "]";
// }

// public Address(Location location, String state, String country) {
// this.location = location;
// this.state = state;
// this.country = country;
// }
// }

// class UPIPaymentApps implements Cloneable {
// String name;
// int dailyLimit;
// double maxDailyAmount;
// Address headOfOfficeLocation;

// public UPIPaymentApps(String name, int dailyLimit, double maxDailyAmount,
// Address headOfOfficeLocation) {
// this.name = name;
// this.dailyLimit = dailyLimit;
// this.maxDailyAmount = maxDailyAmount;
// this.headOfOfficeLocation = headOfOfficeLocation;
// }

// @Override
// protected Object clone() throws CloneNotSupportedException {
// Location newDependency = new
// Location(this.headOfOfficeLocation.location.street,
// this.headOfOfficeLocation.location.city);
// Address newDependencyObj = new Address(newDependency,
// this.headOfOfficeLocation.state,
// this.headOfOfficeLocation.country);
// return new UPIPaymentApps(this.name, this.dailyLimit, this.maxDailyAmount,
// newDependencyObj);
// }

// @Override
// public String toString() {
// return "UPIPaymentApps [dailyLimit=" + dailyLimit + ", headOfOfficeLocation="
// + headOfOfficeLocation + ", maxDailyAmount=" + maxDailyAmount + ", name=" +
// name + "]";
// }
// }

// public class ObjectCloning {
// public static void main(String[] args) throws CloneNotSupportedException {
// UPIPaymentApps bhim = new UPIPaymentApps("BHIM", 10000, 100000,
// new Address(new Location("Attapur", "Hyderabad"), "Telangana", "India"));
// System.out.println(bhim); // before DeepCopy

// UPIPaymentApps Paytm = (UPIPaymentApps) bhim.clone();
// Paytm.name = "Paytm";
// System.out.println(Paytm); // city = hyderabad & state = TS

// Paytm.headOfOfficeLocation.location.city = "Mumbai";
// Paytm.headOfOfficeLocation.state = "Maharashtra";

// System.out.println(Paytm); // city = Mumbai & state = Maharashtra
// System.out.println(bhim.headOfOfficeLocation.state);

// }
// }