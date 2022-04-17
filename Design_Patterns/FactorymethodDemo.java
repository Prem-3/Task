interface MyWrapper {
    void printType();
}

class MyInteger implements MyWrapper {
    @Override
    public void printType() {
        System.out.println("Integer type");
    }
}

class MyDouble implements MyWrapper {
    @Override
    public void printType() {
        System.out.println("Double type");
    }
}

class MyCharacter implements MyWrapper {
    @Override
    public void printType() {
        System.out.println("Character type");
    }
}

class MyBoolean implements MyWrapper {
    @Override
    public void printType() {
        System.out.println("Boolean type");
    }
}

class MyWrapperFactory {
    MyWrapper createMyWrapper(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }
        if (input.matches("\\d+"))
            return new MyInteger();
        else if (input.matches("([0-9]*)\\.([0-9]*)"))
            return new MyDouble();
        else if (input.length() == 1)
            return new MyCharacter();
        else if (input.equals("true") || input.equals("false"))
            return new MyBoolean();
        else
            throw new IllegalArgumentException("Invalid input : " + input);
    }

}

public class FactorymethodDemo {
    public static void main(String[] args) {
        MyWrapperFactory factory = new MyWrapperFactory();
        MyWrapper obj = factory.createMyWrapper("3.3");
        obj.printType();
        MyWrapper obj1 = factory.createMyWrapper("3");
        obj1.printType();
        MyWrapper obj2 = factory.createMyWrapper("Prem");
        obj2.printType();
    }
}