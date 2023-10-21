package Polymorphism;
// Method overriding

// shape class (parent class)

class Shape {
    public void draw(){
        System.out.println("Drawing a shape");
    }
}

// child class 1
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// child class 2
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}