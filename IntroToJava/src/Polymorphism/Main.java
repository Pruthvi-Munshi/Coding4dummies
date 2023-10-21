package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(); // Reference of shape, object circle
        Shape shape2 = new Square(); // Reference of shape, object square

        shape1.draw(); // Calls the draw() method of Circle class
        shape2.draw(); // Calls the draw() method of Square class

        Animal myDog = new Dog("Buddy"); // Reference of Animal, object dog
        Animal myCat = new Cat("Whiskers"); // Reference of Animal, object cat

        myDog.makeSound(); //Calls the makeSound() method of Dog class
        myDog.sleep(); //inherits sleep method from Animal class
        // casting dog to dog type
        ((Dog) myDog).fetch(); // Calls fetch() method of Dog class

        myCat.makeSound(); //Calls the makeSound() method of Cat class
        myCat.sleep(); //inherits sleep method from Animal class
        // casting cat to cat type
        ((Cat) myCat).climb(); // Calls climb() method of Cat class
    }
}
