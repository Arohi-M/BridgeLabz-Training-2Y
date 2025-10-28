// Animal Hierarchy
class Animal {
    String name;
    int age;
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animal {
    void makeSound() {
        System.out.println("Bird chirps");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Bird()};
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
