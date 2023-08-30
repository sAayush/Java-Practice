class Animal {
    public void move() {
        System.out.println("Moving...");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Woof!");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.move();
        dog1.bark();
    }
}
