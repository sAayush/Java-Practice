class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void eat() {
        super.eat(); // calling the parent class method
        System.out.println("Dog is eating...");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}
