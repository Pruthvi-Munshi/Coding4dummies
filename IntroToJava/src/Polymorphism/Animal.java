package Polymorphism;

// Animal class (parent class)
class Animal {
    private String name;

    // Constructor
    Animal(String name){
        this.name = name;
    }

    void makeSound(){
        System.out.println("some sound");
    }
    void sleep(){
        System.out.println(name + " is sleeping");
    }

    String getName(){
        return name;
    }
}

// Child 1

class Dog extends Animal{
    // constructor
    Dog(String name){
        super(name); //super calls the constructor from Animal cuz Dog extends animal
    }

    @Override
    void makeSound(){
        System.out.println(getName() + " says bark bark");
    }

    void fetch(){
        System.out.println(getName() + " is fetching the ball");
    }
}

class Cat extends Animal{
    Cat(String name){
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println(getName() + " says meow");
    }

    void climb(){
        System.out.println(getName() + " is climbing tree");
    }
}