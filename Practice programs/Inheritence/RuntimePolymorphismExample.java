class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphismExample {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound(); // Dog's sound() is called

        a = new Cat();
        a.sound(); // Cat's sound() is called
    }
}
