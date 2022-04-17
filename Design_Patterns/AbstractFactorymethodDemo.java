interface Chair {
    boolean hasLegs();

    void sitOn();
}

interface Sofa {
    boolean hasLegs();

    void sitOn();
}

interface CoffeeTable {
    boolean hasLegs();

    void keepOn();
}

class VictorianChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true;
    }

    public void sitOn() {
        System.out.println("I'm sat on a victorian chair");
    }
}

class ModernChair implements Chair {
    @Override
    public boolean hasLegs() {
        return false;
    }

    public void sitOn() {
        System.out.println("I'm sat on a Modern Chair");
    }
}

class VictorianSofa implements Sofa {
    @Override
    public boolean hasLegs() {
        return true;
    }

    public void sitOn() {
        System.out.println("I'm sat on a Victorian Sofa");
    }
}

class ModernSofa implements Sofa {
    @Override
    public boolean hasLegs() {
        return false;
    }

    public void sitOn() {
        System.out.println("I'm sat on a Modern Sofa");
    }
}

class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public boolean hasLegs() {
        return true;
    }

    public void keepOn() {
        System.out.println("I kept coffee on a Victorian CoffeeTable");
    }
}

class ModernCoffeeTable implements CoffeeTable {
    @Override
    public boolean hasLegs() {
        return false;
    }

    public void keepOn() {
        System.out.println("I kept coffee on a Modern CoffeeTable");
    }
}

interface FurnitureFactory {
    Chair createChair();

    Sofa createSofa();

    CoffeeTable createCoffeeTable();
}

class VictorianFactory implements FurnitureFactory {
    public Chair createChair() {
        return new VictorianChair();
    }

    public Sofa createSofa() {
        return new VictorianSofa();
    }

    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}

class ModernFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }

    public Sofa createSofa() {
        return new ModernSofa();
    }

    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}

class Client {
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;

    Client(FurnitureFactory factory) {
        this.chair = factory.createChair();
        this.sofa = factory.createSofa();
        this.coffeeTable = factory.createCoffeeTable();
    }

    void useFurniture() {
        this.chair.sitOn();
        this.sofa.sitOn();
        this.coffeeTable.keepOn();
        System.out.println("Chair has legs" + " " + this.chair.hasLegs());
        System.out.println("Sofa has legs" + " " + this.sofa.hasLegs());
        System.out.println("Coffee Table has legs" + " " + this.coffeeTable.hasLegs());
    }
}

public class AbstractFactorymethodDemo {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFactory();
        Client client = new Client(factory);
        client.useFurniture();

    }
}
