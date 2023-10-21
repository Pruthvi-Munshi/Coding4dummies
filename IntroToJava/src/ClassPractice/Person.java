package ClassPractice;

public class Person {
    // define attributes
    // member declared as private is only visible to its class
    // declaring this as private falls under umbrella of encapsulation
    private String name;
    private int age;
    private String address;

    //Constructor
    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // getter and setter methods
    // this is how we control and modify our data
    // falls under umbrella of encapsulation

    // Getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public static void main(String[] args) {
        // create person object
        Person person = new Person("Alice", 30, "12th st");
        System.out.println(person.getAddress());
        person.setAddress("24th st");
        System.out.println(person.getAddress());
    }
}
