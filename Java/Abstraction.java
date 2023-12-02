
abstract class Car {
    public void start() {
        System.out.println("started");
    }

    abstract public void accelerate();
    abstract public void drive();
    abstract public void combustion();

    public void stop() {
        System.out.println("stops");
    }
}

class Maruti extends Car {
    @Override
    public void accelerate() {
        System.out.println("100");
    }

    @Override
    public void drive() {
        System.out.println("gear");
    }

    @Override
    public void combustion() {
        System.out.println("petrol");
    }
}

class Innova extends Car {
    @Override
    public void accelerate() {
        System.out.println("120");
    }

    @Override
    public void drive() {
        System.out.println("auto gear");
    }

    @Override
    public void combustion() {
        System.out.println("diesel");
    }
}

class Road {
    public void permit(Car ref) {
        ref.start();
        ref.accelerate();
        ref.combustion();
        ref.drive();
        ref.stop();
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Maruti m = new Maruti();
        Innova i = new Innova();

        Road r = new Road();
        r.permit(m);
        r.permit(i);
    }
}
