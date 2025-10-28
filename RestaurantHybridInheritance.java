// Hybrid Inheritance: Restaurant Management System
interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;
}

class Chef extends Person implements Worker {
    public void performDuties() {
        System.out.println(name + " cooks delicious meals.");
    }
}

class Waiter extends Person implements Worker {
    public void performDuties() {
        System.out.println(name + " serves customers.");
    }
}

public class RestaurantHybridInheritance {
    public static void main(String[] args) {
        Chef c = new Chef();
        c.name = "Raj";
        c.performDuties();

        Waiter w = new Waiter();
        w.name = "Aman";
        w.performDuties();
    }
}
