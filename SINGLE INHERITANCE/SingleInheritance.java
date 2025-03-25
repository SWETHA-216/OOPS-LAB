// Base class (Parent)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class (Child)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks: Woof! Woof!");
    }
}

// Main class
public class SingleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Calling base class method
        myDog.eat();

        // Calling derived class method
        myDog.bark();
    }
}
