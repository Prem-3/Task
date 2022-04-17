interface Bird {
    void fly();

    void makeSounds();
}

class Sparrow implements Bird {
    public void fly() {
        System.out.println("Flying");
    }

    public void makeSounds() {
        System.out.println("chirp chirp");
    }
}

class Duck implements Bird {
    public void fly() {
        System.out.println("Flying");
    }

    public void makeSounds() {
        System.out.println("Quack Quack");
    }
}

interface ToyBird {
    void fly();

    void squeak();
}

class ToyDuck implements ToyBird {
    public void fly() {
        System.out.println("Can't Fly");
    }

    public void squeak() {
        System.out.println("sqeuaking noise");
    }
}

class ToySparrow implements ToyBird {
    public void fly() {
        System.out.println("Can't Fly");
    }

    public void squeak() {
        System.out.println("sqeuaking noise...");
    }
}

class BirdAdapter implements ToyBird {
    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    public void squeak() {
        bird.makeSounds();
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub

    }
}

public class Adapter {
    public static void main(String[] args) {
        Bird duck = new Duck();
        Bird sparrow = new Sparrow();

        ToyBird toyDuck = new ToyDuck();
        ToyBird toySparrow = new ToySparrow();

        BirdAdapter birdAdapter = new BirdAdapter(duck);
        BirdAdapter birdAdapter2 = new BirdAdapter(sparrow);
        System.out.println("Demonstrating a real bird::");
        duck.fly();
        duck.makeSounds();
        System.out.println("-------");
        sparrow.fly();
        sparrow.makeSounds();
        System.out.println("-------");
        System.out.println("demonstrating a toy bird::");
        toyDuck.squeak();
        System.out.println("-------");
        toySparrow.squeak();
        System.out.println("-------");
        System.out.println("making a toy bird behave like a real bird via bird adapter::");
        birdAdapter.squeak();
        birdAdapter2.squeak();
        System.out.println("-------");
    }
}
