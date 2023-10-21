package Polymorphism;
// Method overloading
class Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    //double is like a float in python
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(6, 7));
        System.out.println(add(4.2, 6.9));
    }
}
