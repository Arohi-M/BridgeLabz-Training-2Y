class Fruit { public String toString() { return "Fruit"; } }
class Apple extends Fruit { public String toString() { return "Apple"; } }
class Mango extends Fruit { public String toString() { return "Mango"; } }
class FruitBox<T extends Fruit> {
    private java.util.List<T> fruits = new java.util.ArrayList<>();
    public void add(T fruit) { fruits.add(fruit); }
    public void display() { for (T f : fruits) System.out.println(f); }
    public static void main(String[] args) {
        FruitBox<Fruit> box = new FruitBox<>();
        box.add(new Apple());
        box.add(new Mango());
        box.display();
    }
}